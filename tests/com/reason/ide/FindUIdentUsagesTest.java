package com.reason.ide;

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;
import com.intellij.usageView.UsageInfo;

import java.util.Collection;

@SuppressWarnings("ConstantConditions")
public class FindUIdentUsagesTest extends LightPlatformCodeInsightFixtureTestCase {

    public void testException() {
        myFixture.configureByText("A.re", "exception Exception<caret>Name; raise(ExceptionName);");

        Collection<UsageInfo> usages = myFixture.testFindUsages("A.re");
        assertSize(1, usages);
        assertEquals("(ExceptionName)", usages.iterator().next().getElement().getParent().getText());
    }

}
