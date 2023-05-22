#Autor:Anderson
  #languege:en

  Feature: Consulta la pagina principal de la U de A
    como estudiante de la U de A necesito buscar homepage de la U en
    google para ingresar al sitio oficial de la UdeA

  Scenario: Buscar la pagina oficial de la UdeA en el motor de busqueda de Google
    Given que me encuentro en la pagina principal de google
    When escriba la palabra U de A
    Then puedo ver el link de la pagina oficial
