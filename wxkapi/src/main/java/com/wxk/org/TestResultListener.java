package com.wxk.org;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestResultListener extends TestListenerAdapter {
    private int m_count = 0;

    @Override
    public void onTestFailure(ITestResult tr) {
        String s =  tr.getName() + " == " + tr.getTestName() +" == " + tr.getInstanceName() + " == " + tr.getMethod().getMethodName();
        log(s);
        log("F");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        log("S");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        String s =  tr.getName() + " == " + tr.getTestName() +" == " + tr.getInstanceName() + " == " + tr.getMethod().getMethodName();
        log(s);
        log(".");
    }

    private void log(String string) {
        System.out.print(string);
        if (++m_count % 40 == 0) {
            System.out.println("");
        }
    }
}