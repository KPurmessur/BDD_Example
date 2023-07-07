Feature: Ebay Search Functionality
  In order to test the search functionality
  on Ebay's website, I want to verify the search
  conditions

  Scenario Outline: Search Products
    Given I have a search field on Ebay Page
    When I search for a product with name <product> and price <price>
    Then product with name <product> should be displayed

    Examples: List of products

      | product                   | price |
      | Microsoft Surface Pro     | 1000  |
      | HP Spectre x360 16        | 950   |
      | DELL Inspiron 7620 2-in-1 | 900   |

