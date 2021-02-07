Feature: Google Search

  @Smoke
  Scenario: Sample Test
    Given get 'https://www.flipkart.com/'
    When I login to Flipkart with username 'username' and password 'password'
    When Order the product 'Samsung Galaxy M31 (Space Black, 64 GB)' from Flipkart
#    Then verify link with partial text 'qaf' is present