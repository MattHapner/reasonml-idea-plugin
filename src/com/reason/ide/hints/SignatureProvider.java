package com.reason.ide.hints;

// just an experiment, cancelled for now
public class SignatureProvider /*implements InlayParameterHintsProvider*/ {

    //@NotNull
    //@Override
    //public List<InlayInfo> getParameterHints(PsiElement element) {
//        if (element instanceof PsiLet) {
//            PsiLet letStatement = (PsiLet) element;
//            if (!letStatement.getLetBinding().isFunction()) {
//                if (letStatement.hasInferredType()) {
//                    return singletonList(new InlayInfo(letStatement.getInferredType(), 14/*letStatement.getLetBinding().getValueName().getTextOffset()*/));
//                }
//            }
//        }

    //return emptyList();
    //}
    //
    //@Nullable
    //@Override
    //public HintInfo getHintInfo(PsiElement psiElement) {
    //    return null;
    //}

/*
    @Nullable
    @Override
    public MethodInfo getMethodInfo(PsiElement element) {
        System.out.println("getMethodInfo " + element);
        if (element instanceof PsiLet) {
            MethodInfo methodInfo = new MethodInfo("fqn", asList("p1", "p2"));
            return methodInfo;
        }
        return null;
    }
*/

    //@NotNull
    //@Override
    //public Set<String> getDefaultBlackList() {
    //    return emptySet();
    //}
    //
    //@Nullable
    //@Override
    //public Language getBlackListDependencyLanguage() {
    //    return null;
    //}
    //
    //@NotNull
    //@Override
    //public List<Option> getSupportedOptions() {
    //    return emptyList();
    //}
    //
    //@Override
    //public boolean isBlackListSupported() {
    //    return false;
    //}
    //
    //@Override
    //public String getInlayPresentation(@NotNull String inlayText) {
    //    return inlayText;
    //}
}
