package com.ibm.HelloIBM;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.ibm.HelloIBM.App;

public class AppTest extends TestCase
{
    public void testApp()
    {
        assertTrue( App.now().length() > 0 );
    }
}
