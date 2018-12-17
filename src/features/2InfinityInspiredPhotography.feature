#Author: your.email@your.domain.com

@Infinity
@Test1
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given I launch the FireFox Browser and I am ready to do some testing
    When I navigate to the Website Address "http://www.infinityinspiredphotography.com/"
    Then I verify that I am on the correct Website Page by looking at the Header Link "Infinity Inspired Photography, L.L.C."
    When I click on the link "<Link1>" on the Infinity Inspired Photography Page
    And I wait "3" seconds
    And I click on the link "<Link2>" on the Infinity Inspired Photography Page
    And I wait "3" seconds
    And I click on the link "<Link3>" on the Infinity Inspired Photography Page
    And I wait "3" seconds
    And I click on the link "<Link4>" on the Infinity Inspired Photography Page
    And I wait "3" seconds
    

    Examples: 
      | Link1   | Link2           | Link3              | Link4    |
      | Gallery | Wedding Pricing | Additional Pricing | About US | 
	
	@Test2
   Scenario Outline: Title of your scenario outline2
   
    Given I launch the FireFox Browser and I am ready to do some testing
    When I navigate to the Website Address "http://www.infinityinspiredphotography.com/"
    Then I verify that I am on the correct Website Page by looking at the Header Link "Infinity Inspired Photography, L.L.C."
    When I click on the link "<Link>" on the Infinity Inspired Photography Page
    And I fill out my first name "<First Name>"
    And I fill out my last name "<Last Name>"
    And I enter my Email Address "<Email Address>"
    And I enter my Phone Number "<Phone Number>"
    And I enter a Subject "<Subject>"
    And I enter a Message "<Message>"
    And I wait "5" seconds

    Examples: 
      | Link       | First Name | Last Name | Email Address        | Phone Number | Subject              | Message                                                                             |
      | Contact Us | Alex       | Dahnke    | adahnke@gmail.com    | 9205732341   | The Gunslinger       | The man in black fled across the desert and the gunslinger followed                 |
      | Contact Us | Karissa    | Dahnke    | karidahnke@gmail.com | 9202793369   | The Greatest Showman | So trade that typical for something colorful and if it's crazy, live a little crazy |