Feature: Google Search

  @Smoke
  Scenario: Sample Test
    Given get 'https://www.flipkart.com/'
    When I login to Flipkart with username 'username' and password 'password'
#    When search for 'qaf github infostretch'
#    Then verify link with partial text 'qaf' is present