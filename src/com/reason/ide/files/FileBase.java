package com.reason.ide.files;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.util.PsiTreeUtil;
import com.reason.lang.ModuleHelper;
import com.reason.lang.core.ORUtil;
import com.reason.lang.core.PsiFileHelper;
import com.reason.lang.core.psi.PsiInnerModule;
import com.reason.lang.core.psi.PsiModule;
import com.reason.lang.core.psi.PsiNamedElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class FileBase extends PsiFileBase implements PsiModule {

    @NotNull
    private final String m_moduleName;

    FileBase(@NotNull FileViewProvider viewProvider, @NotNull Language language) {
        super(viewProvider, language);
        m_moduleName = ORUtil.fileNameToModuleName(getName());
    }

    @NotNull
    public String asModuleName() {
        return m_moduleName;
    }

    public boolean isComponent() {
        if (FileHelper.isOCaml(getFileType())) {
            return false;
        }

        return ModuleHelper.isComponent(this);
    }

    @NotNull
    public String shortLocation(@NotNull Project project) {
        return FileHelper.shortLocation(project, getVirtualFile().getPath());
    }

    @NotNull
    public Collection<PsiNamedElement> getExpressions() {
        return PsiFileHelper.getExpressions(this);
    }

    @NotNull
    public Collection<PsiNamedElement> getExpressions(@Nullable String name) {
        return PsiFileHelper.getExpressions(this, name);
    }

    @NotNull
    public <T extends PsiNamedElement> Collection<T> getExpressions(@Nullable String name, @NotNull Class<T> clazz) {
        List<T> result = new ArrayList<>();

        if (name != null) {
            Collection<T> children = PsiTreeUtil.findChildrenOfType(this, clazz);
            for (T child : children) {
                if (name.equals(child.getName())) {
                    result.add(child);
                }
            }
        }

        return result;
    }

    @Nullable
    @Override
    public String getQualifiedName() {
        return asModuleName();
    }

    @NotNull
    public Collection<PsiInnerModule> getModules() {
        return PsiFileHelper.getModuleExpressions(this);
    }

    @Nullable
    @Override
    public String getAlias() {
        return null;
    }

    public boolean isInterface() {
        FileType fileType = getFileType();
        return fileType instanceof RmlInterfaceFileType || fileType instanceof OclInterfaceFileType;
    }
}
