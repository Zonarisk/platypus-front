package fr.jeansaigne.platypus.cucumber.stepdefs;

import fr.jeansaigne.platypus.FrontApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FrontApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
