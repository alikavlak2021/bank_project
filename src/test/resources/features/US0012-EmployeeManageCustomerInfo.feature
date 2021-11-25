@employee_manage_customer

Feature:

  Scenario Outline: Manage Customer Information
    Given user is on the main  page
    And user verifies the GMIBANK text
    And user navigates the sign in page
    And user enters Username "<UserName>"
    And user enters Password "<Password>"
    And user clicks sign in button
    And user navigates the default page
    And user clicks the My Operations
    And user clicks the Manage Customers
    And user navigates the Customers page
    Then user verifies "First Name", "Last Name", "Middle Initial", "Email", "Mobile Phone Number", "Phone Number", "Address", "Create Date"
    And user sees View option and clicks
    Then user verifies the Edit button is visible
    And user sees Edit button and clicks
    Then the Edit button should be clickable
    And user navigates the Create or Edit Customer page
    And user edits First Name "<first_name>"
    And user edits Last Name "<last_name>"
    And user edits Email "<email>"
    And user edits Mobile Phone Number "<mobile_phone_number>"
    And user clicks Save button
    Then user sees  the green message that includes "translation-not-found" in the "Manage Customers" page
    And user sees Delete button and clicks
    Then user verifies the "Confirm delete operation" message

    Examples:
      | UserName     | Password | first_name | last_name | email          | mobile_phone_number |
      | bf_employee1 | Magic46. | Ali        | Can       | alican@qa.team | 777-964-2534        |