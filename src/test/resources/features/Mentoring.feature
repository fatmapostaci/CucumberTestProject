

@Mentoring
Feature: Verify Title

  #Mentoring_01 --> Belirli bir kelimenin başlıkta olup olmadığını doğrulama
  #Scenario : Verify that a specifik word exists in the title
  #I navigate to https://testpages.eviltester.com/styled/index.html
  #The page title should contain HTML
  @Mentoring01
  Scenario:  Verify that a specific word exists in the title
    Given Go to eviltester
    And Page title should contain HTML
    Then Close driver

  #Mentoring_02 -->  Belirli bir kişinin tabloda olup olmadığını doğrulama
  #Scenario : Verify that a specific name exists in the table
  #I navigate to https://testpages.eviltester.com/styled/index.html
  #Click Table Test Page link
  #The table should contain a row with name Aleister
  @Mentoring02
  Scenario: Verify that a specific name exists in the table
    Given Go to eviltester
    When Click TableTestPage Link
    And Table Should Contain Aleister
    Then Close driver

  @Mentoring02
  Scenario: Verify that a specific name exists in the table
    Given Go to eviltester
    When Click TableTestPage Link
    And Table Should Contain "Aleister"
    Then Close driver

  # Mentoring_03 --> Belirli bir kişinin amount bilgisini doğrulama
  #Scenario: Verify the amount of a specific person
  #I navigate to https://testpages.eviltester.com/styled/index.html
  #Click Table Test Page link
  #The amount for Bob should be 23
  @Mentoring03
  Scenario: Verify the amount of a specific person
    Given Go to eviltester
    When Click TableTestPage Link
    Then The amount for Bob should be twenty three
    Then Close driver

  #Mentoring_04 -->  Tabloda kaç satır olduğunu kontrol etme
  #Scenario: Verify number of rows in the table
  #I navigate to https://testpages.eviltester.com/styled/index.html
  #Click Table Test Page link
  #The table should have 4 rows
  @Mentoring04
  Scenario: Verify number of rows in the table
    Given Go to eviltester
    When Click TableTestPage Link
    Then Table should have 4 rows
    Then Close driver

#Mentoring_05 -->  Belirli bir amount değerinin tabloda geçtiğini kontrol etme
#Scenario: Verify if an amount value exists in the table
#I navigate to https://testpages.eviltester.com/styled/index.html
#Click Table Test Page link
#The table should contain the amount 33.3
  @Mentoring05
  Scenario: Verify if an amount value exists in the table
    Given Go to eviltester
    When Click TableTestPage Link
    Then Table should contain "33.3" amount
    Then Close driver


#Mentoring_06 -->  Tabloda olmayan bir ismin bulunmadığını kontrol etme
#Scenario : Verify that a name does not exist in the table
#I navigate to https://testpages.eviltester.com/styled/index.html
#Click Table Test Page link
#The table should not contain a row with name Charlie
  @Mentoring06
  Scenario: Verify that a name does not exist in the table
    Given Go to eviltester
    When Click TableTestPage Link
    Then Table should not contain a row with name "Charlie"
    Then Close driver
