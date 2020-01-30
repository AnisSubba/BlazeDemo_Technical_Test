Feature: Book Destination
  As a User i want to be able to Select departure and destination city,
  select the flight i want to take and fill out the details needed
  to get booked for my journey.

@Scenario Outline:
  Scenario: As a user I am able to select departure and destination city
    Given I am on the travel home page
    When I select my departure city location
    And I select my destination location
    Then I click the submit button

    Scenario: As a User I can choose the flight I find suitable
      Given I clicked the submit button
      When I can see all the list of suitable flight
      Then I click on the suitable flight which will open the detail page

      Scenario: As a User I am able to fill out the detail
        Given I clicked on the suitable flight which will open the detail page
        When I fill out the detail
        And I click on remember me and purchase flight
        Then I will be able to see the confirmation page