package com.myexample.cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import org.junit.Assert;
import org.springframework.core.io.ClassPathResource;

public class StepDefinitions {
    private String content;

    @When("I read content from {string}")
    @SneakyThrows
    public void documentOfTypeGeneratedForEdd(String fileName) {
        content = new String(new ClassPathResource("internal-test-data/" + fileName).getInputStream().readAllBytes());

    }

    @Then("the content is {string}")
    public void fileNameOfFormatGenerated(String expectedContent) {
        Assert.assertEquals(expectedContent, content);
    }
}
