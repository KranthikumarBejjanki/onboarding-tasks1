package com.bdd.test.StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"html:target/cucumber-report.html", "pretty"},
    features = {"./resources/Features"},
    dryRun = false,
    glue = "com.bdd.test.StepDefinitions")
public class RunnerExample {}
