#Author: your.email@your.domain.com

@KarissaDahnke
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given I launch the FireFox Browser and I am ready to do some testing
    When I navigate to the Website Address "https://www.karissadahnkephotography.com/"
    Then I verify that I am on the correct Website Page by looking at the Header Link "Karissa Dahnke Photography"
    When I click on a category "<Category>" on the Karissa Dahnke Photography Website
    And I scroll down slightly
    And I wait "3" seconds
    

    Examples: 
      | Category  |
      | Concerts  |
      | Birds     |
      | Wrestling |
      