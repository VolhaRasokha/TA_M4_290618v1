package com.epam.cdp.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.epam.cdp.calculator.listeners.TestListeners;


public class Runner {

    public static void main(String[] args) {
        TestNG testNg = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./src/test/resources/testng_SimpleCalculatorOperationsSuite"));

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNg.setXmlSuites(suites);
        testNg.run();
    }
}
