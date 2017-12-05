package com.reason;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.reason.ide.files.RmlFileType;
import com.reason.lang.RmlLanguage;
import com.reason.lang.core.psi.PsiModule;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RmlFile extends PsiFileBase {
    public RmlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, RmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return RmlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Reason File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

    public PsiModule[] getModules() {
        return findChildrenByClass(PsiModule.class);
    }
}
