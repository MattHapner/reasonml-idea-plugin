package com.reason.lang.core.stub.type;

import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import com.reason.ide.search.index.IndexKeys;
import com.reason.lang.core.psi.PsiException;
import com.reason.lang.core.psi.impl.PsiExceptionImpl;
import com.reason.lang.core.stub.PsiExceptionStub;
import com.reason.lang.core.type.ORTypes;
import com.reason.lang.ocaml.OclTypes;
import com.reason.lang.reason.RmlLanguage;
import com.reason.lang.reason.RmlTypes;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class PsiExceptionStubElementType extends IStubElementType<PsiExceptionStub, PsiException> {

    public PsiExceptionStubElementType(@NotNull String name, Language language) {
        super(name, language);
    }

    @NotNull
    public PsiException createPsi(@NotNull final PsiExceptionStub stub) {
        ORTypes types = getLanguage() instanceof RmlLanguage ? RmlTypes.INSTANCE : OclTypes.INSTANCE;
        return new PsiExceptionImpl(stub, this, types);
    }

    @NotNull
    public PsiExceptionStub createStub(@NotNull final PsiException psi, final StubElement parentStub) {
        return new PsiExceptionStub(parentStub, this, psi.getName(), psi.getQualifiedName());
    }

    public void serialize(@NotNull final PsiExceptionStub stub, @NotNull final StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
        dataStream.writeUTFFast(stub.getQualifiedName());
    }

    @NotNull
    public PsiExceptionStub deserialize(@NotNull final StubInputStream dataStream, final StubElement parentStub) throws IOException {
        StringRef name = dataStream.readName();
        String qname = dataStream.readUTFFast();

        return new PsiExceptionStub(parentStub, this, name, qname);
    }

    public void indexStub(@NotNull final PsiExceptionStub stub, @NotNull final IndexSink sink) {
        String name = stub.getName();
        if (name != null) {
            sink.occurrence(IndexKeys.EXCEPTIONS, name);
        }

        String fqn = stub.getQualifiedName();
        if (fqn != null) {
            sink.occurrence(IndexKeys.EXCEPTIONS_FQN, fqn.hashCode());
        }
    }

    @NotNull
    public String getExternalId() {
        return getLanguage() + "." + super.toString();
    }
}
