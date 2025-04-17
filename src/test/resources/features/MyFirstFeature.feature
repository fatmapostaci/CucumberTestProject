Feature: Google Search Ozelligi
  Burada acıklama yapabilirsiniz
  Ve devamı....

  Scenario: Google arama sayfası testi
    When Kullanıcı google ana sayfasını ziyaret eder
    Then sayfa title ı google içerir
    And Search box ın görünürlügünü dogrular
    And Ekrana Dry yazar
    And browserı kapatır