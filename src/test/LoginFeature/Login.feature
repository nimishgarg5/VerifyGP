Feature: Login to grid point and verify

  @Test1
  Scenario: Verify the login page and login
    Given Open Chrome and start application
    Then verify the login page and verify
    Then Enter username and click on next
    Then Enter Password and login
    Then verify the home page afer login successfully

    @Test2
  Scenario: verify the comm tool
    Given Logged in the application and on home page
    Then go to Confriguration tab and verify it check endpoint,site ,template is visible
    Then enter site name and select endPoiny and click on enter button
    Then verify the page bu search endpoint-Id, Site-Id, configuration module,testing module
    Then click on configuration module and click on use control config
    Then Verify the Page by checking show XML,full view,smartview,General Tab is there

