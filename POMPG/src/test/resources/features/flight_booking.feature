Feature: Latam Airlines Flight Booking

  As a traveler,
  I want to book a one-way flight on the Latam Airlines website,
  So that I can make travel arrangements efficiently.

  Background:
    Given I am initiating a flight booking process on the Latam Airlines website 1 ""

  Scenario Outline: Book a one-way flight
    When the user searches for a one-way flight from "<origin>" to "<destination>" on "<date>" for "<passengers>" passengers
    And selects a flight
    But does not purchase seats or luggage
    And adds passenger information and confirms it
    Then they should see a message with the details of the purchase

    Examples:
      | origin       | destination   | date       | passengers |
      | Santiago     | Lima          | 2024-06-15 | 3          |
      | Buenos Aires | Sao Paulo     | 2024-07-20 | 4          |
      | Mexico City  | Miami         | 2024-08-10 | 2          |

  Scenario: Change the flight during the purchase process
    When the user searches for a one-way flight from "<origin>" to "<destination>" on "<date>" for "<passengers>" passengers
    And selects a flight
    When the user changes the selected flight to a new one
    Then they should see the updated flight details

  Scenario: Purchase seat during the purchase process
    When the user searches for a one-way flight from "<origin>" to "<destination>" on "<date>" for "<passengers>" passengers
    And selects a flight
    When the user selects seat options and chooses a seat
    Then they should see the selected seat reflected in the booking

  Scenario: Purchase luggage during the purchase process
    When the user searches for a one-way flight from "<origin>" to "<destination>" on "<date>" for "<passengers>" passengers
    And selects a flight
    When the user adds luggage to the booking
    Then they should see the cost of the selected luggage
