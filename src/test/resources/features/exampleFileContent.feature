@system
Feature: Example file content

  Scenario: Filename has expected content
    When I read content from "example.txt"
    Then the content is "My example content"