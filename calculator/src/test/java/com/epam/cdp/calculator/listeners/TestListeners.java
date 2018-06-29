package com.epam.cdp.calculator.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    public void onTestStart(ITestResult result) {
       System.out.println("Test: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Result of execution: SUCCESS");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Result of execution: FAILED");
    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}
