Feature: Google Search

  @Smoke
  Scenario: Sample Test
    Given get 'https://www.flipkart.com/'
    When I login to Flipkart with username 'ajaiaugustine94@gmail.com' and password 'flippass@123'
    When Order the product 'Samsung Galaxy M31 (Space Black, 64 GB)' from Flipkart
#    Then verify link with partial text 'qaf' is present