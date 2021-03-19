Feature: As a user i should add product to bag and checkout



  @addProduct
  Scenario: Add product to the bag

    Given home page "https://www2.next.co.uk/"
    When i enter "dress" in search field
    And click search button
    Then i redirected to the appropriate product page with expectedMessage "Dress"
   # When I scroll down to choose product
    When i click the particular product
    Then i should be redirected to appropriate product page
    When i add product to the bag
    Then  selected product should be added to bag

