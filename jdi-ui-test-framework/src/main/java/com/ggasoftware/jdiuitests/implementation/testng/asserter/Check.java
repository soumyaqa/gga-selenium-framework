package com.ggasoftware.jdiuitests.implementation.testng.asserter;

import com.ggasoftware.jdiuitests.core.asserter.BaseChecker;
import com.ggasoftware.jdiuitests.core.utils.linqinterfaces.JActionT;
import org.testng.Assert;

/**
 * Created by Roman_Iovlev on 6/9/2015.
 */
public class Check extends BaseChecker {
    public Check() {
        super();
    }

    public Check(String checkMessage) {
        super(checkMessage);
    }

    @Override
    protected JActionT<String> throwFail() {
        return Assert::fail;
    }
}
