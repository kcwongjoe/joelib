package com.kcwongjoe.joelib;

import org.junit.Test;
import static org.junit.Assert.*;

public class JGeneralUtilsTest {

    @Test public void testIsNullStr() {
        assertTrue("isNullStr() fail with null.", JGeneralUtils.isNullStr(null));
        assertTrue("isNullStr() fail with ''.", JGeneralUtils.isNullStr(""));
        assertFalse("isNullStr() fail with non empty string.", JGeneralUtils.isNullStr("abc"));
    }

    @Test public void testEquals() {

        assertTrue("equals() fail with NaN and NaN.", JGeneralUtils.equals(Double.NaN, Double.NaN));
        assertFalse("equals() fail with NaN and " + (5.0 / 0.0) + ".", JGeneralUtils.equals(Double.NaN, 5.0 / 0.0));
        assertFalse("equals() fail with NaN and " + 5.0 + ".", JGeneralUtils.equals(Double.NaN, 5.0));
        assertTrue("equals() fail with " + (5.0 / 0.0) + " and " + (5.0 / 0.0) + ".", JGeneralUtils.equals(5.0 / 0.0, 5.0 / 0.0));
        assertFalse("equals() fail with " + (5.0 / 0.0) + " and " + (-5.0 / 0.0) + ".", JGeneralUtils.equals(5.0 / 0.0, -5.0 / 0.0));

        assertFalse("equals() fail with " + 0 + " and " + 1e-300 + ".", JGeneralUtils.equals(0, 1e-300));
        assertFalse("equals() fail with " + 1 + " and " + 1.01 + ".", JGeneralUtils.equals(1, 1.01));
        assertTrue("equals() fail with " + 1 + " and " + (1 + Math.ulp(1)) + ".", JGeneralUtils.equals(1, 1 + Math.ulp(1)));
    }
}
