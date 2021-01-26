Feature: Google Search

  @Smoke
  Scenario: Sample Test
    Given get 'https://www.amazon.in/'
    When I login to amazon
#    When search for 'qaf github infostretch'
#    Then verify link with partial text 'qaf' is present