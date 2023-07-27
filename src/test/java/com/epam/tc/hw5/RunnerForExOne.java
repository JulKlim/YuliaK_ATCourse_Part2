package com.epam.tc.hw5;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/exOne",
        glue = "com.epam.tc.hw5.steps.ex1")
public class RunnerForExOne extends AbstractTestNGCucumberTests {
}
