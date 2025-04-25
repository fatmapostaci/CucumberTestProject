@DataTable
Feature: Data Table Test

  @ToDoList
  Scenario: Todo list
    Given user goes to url "https://webdriveruniversity.com/To-Do-List/index.html"
    When user enters todos
      | Prepare Breakfast        |
      | Wash the dishes          |
      | Take care of baby        |
      | Help your kid's homework |
      | Study Selenium           |
      | Sleep                    |
      | Get Up                   |
      | Go to school             |

  @FormMap
  Scenario: Form Page Map
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    When user enters username and comment
      | john_doe  | Hello John   |
      | tom_zoey  | Hi, everyone |
      | ken_known | Goodbye      |
      | ali_can   | Merhaba!!!   |

    Then user closes the browser

  @FormListOfList
  Scenario: Form Page List
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    When user enters username password and comment
      | john_doe  | 1234 | Hello John   |
      | tom_zoey  | 5678 | Hi, everyone |
      | ken_known | 9012 | Goodbye      |
      | ali_can   | 3456 | Merhaba!!!   |
      | fatma_yan | 789  | Günaydın!!!  |

    Then user closes the browser

  @FormListOfListWithTitle
  Scenario: Form Page List with Title
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    When user enters username password and comment with heading
      | name      | pass | comm         |
      | john_doe  | 1234 | Hello John   |
      | tom_zoey  | 5678 | Hi, everyone |
      | ken_known | 9012 | Goodbye      |
      | ali_can   | 3456 | Merhaba!!!   |
      | fatma_yan | 789  | Günaydın!!!  |

    Then user closes the browser

    #Mentoring
    #URL : https://the-internet.herokuapp.com/login
    #--> Task 01: Geçersiz parola ve kullanıcı ismi ile login olmaya çalışıldığında Your username is invalid! mesajı alınmalıdır
    #Test dataları
    #Kullanıcı Adı     Şifre
    #William             101012!
    #Henry                245784*
    #-Boş-                 -Boş-
    #tomsmith             HGHGHG
    #Anna                    SuperSecretPassword!

  @DataTableExample01
  Scenario: Geçersiz parola ve kullanıcı ismi ile login olma
    Given user goes to url "https://the-internet.herokuapp.com/login"
    When user enters username and password on eviltesterpage
      | William  | 101012!              |
      | Henry    | 245784*              |
      | _        | _                    |
      | tomsmith | HGHGHG               |
      | Anna     | SuperSecretPassword! |
  Then user closes the browser







    #
    #4:56
    #:zap: URL : https://demoqa.com/automation-practice-form
    #--> Task 02: Formda doldurulması gereken alanlara geçerli veriler girildiğinde Thanks for submitting the form mesajı alınmalıdır
    #Test dataları
    #Name     surname     Gender     Mobile
    #Allan       Keller          male       1010121346
    #Helin       Kaygas       female     5544454545
    #Ali           zambak       male        5056588989