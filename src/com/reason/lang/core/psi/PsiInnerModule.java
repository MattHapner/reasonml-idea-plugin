package com.reason.lang.core.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.reason.lang.core.stub.PsiModuleStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public interface PsiInnerModule extends PsiModule, PsiNamedElement, StubBasedPsiElement<PsiModuleStub> {
    @Nullable
    PsiSignature getSignature();

    @Nullable
    PsiElement getBody();

    @NotNull
    Collection<PsiInnerModule> getModules();

    @Nullable
    PsiInnerModule getModule(@NotNull String name);

    @NotNull
    Collection<PsiOpen> getOpenExpressions();

    @NotNull
    Collection<PsiInclude> getIncludeExpressions();

    @NotNull
    Collection<PsiLet> getLetExpressions();

    @NotNull
    Collection<PsiType> getTypeExpressions();

    @Nullable
    PsiExternal getExternalExpression(@NotNull String name);

    @Nullable
    PsiType getTypeExpression(@NotNull String name);

    @Nullable
    PsiLet getLetExpression(@NotNull String make);

    boolean isComponent();

}
