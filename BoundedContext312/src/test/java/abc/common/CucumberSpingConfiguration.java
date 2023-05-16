package abc.common;

import abc.BoundedContext312Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext312Application.class })
public class CucumberSpingConfiguration {}
