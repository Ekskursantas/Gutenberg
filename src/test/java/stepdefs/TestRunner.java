/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author diana
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = {"src//test//java//resources//"})
public class TestRunner {
    
}
