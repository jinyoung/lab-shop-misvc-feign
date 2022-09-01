package labshopmisvcfeign.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopmisvcfeign.MonolithApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MonolithApplication.class })
public class CucumberSpingConfiguration {}
