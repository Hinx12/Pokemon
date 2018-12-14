Feature: Completing route 1
  As a gamer
  I want to be able to play route 2's components
  So that I can have an enjoyable experience

Scenario: Waiting for pokemon to reach 10/10
  Given I have clicked on route 2
  When I wait for 10 pokemons to be defeated
  Then the pokemon counter should read 10/10

Scenario: Pewter City icon clicking
  Given the pokemon counter reads 10/10
  When I click the Pewter City red hexagon
  Then I should be able to click on the Pewter City Shop Button
  And I should be able to click on the Pewter City Gym Button

Scenario: Battling the pewter Gym
  Given the Pewter City Gym button is clickable
  And I am strong enough to beat the Gym Leader
  When I click the Gym button at Pewter City
  Then I should be able to beat the gym leader



