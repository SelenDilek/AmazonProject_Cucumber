@RegressionTest
Feature: Login Test
  Scenario: Go to amazon website and test login page

    Given Amazon sitesine git
    And login butonuna tikla
    And Isim gir
    And Sifre gir
    When submit butonuna tiklandiginda
    Then success mesajini verify et
