Feature: Menu
  As a user
  I should navigate through header links appropriately


  @menu
  Scenario Outline: Validate menu/sub menu re-direction

    Given home page "https://www.next.co.uk/"
    When click to menu "<menuOption>"/"<subMenuOption>"
    Then i should be in the appropriate product lists page with header as "<productListsTitle>"
    Examples:
      | menuOption | subMenuOption | productListsTitle |
      | MEN        | Jeans         | Jeans             |
      | WOMEN      | Jeans         | Jeans             |
      | BOYS       | Jeans         | Jeans             |
      | GIRLS      | Jeans         | Jeans             |

