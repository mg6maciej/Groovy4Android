package com.ordonteam.functional;

import com.ordonteam.functional.helper.Checker;

public final class FunctionalExampleTestCase extends BaseInstrumentationTestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testIsHelloWorldDisplayed() {
        Checker.checkIfViewWithTextIsDisplayed("Hello World");
    }

}
