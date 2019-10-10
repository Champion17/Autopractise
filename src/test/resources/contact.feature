Feature: sending message to the customer

  @contact_customer
  Scenario:contact customer

    Given user navigates to Automation practise page
    Then user should be on the Automation practise home page
    When user clicks on the contact us button
    Then user should be on the contact us page
    When user selects customer service on the subject heading
    And user enters the valid email
    And user enters the order reference number
    And user types the message
    And user clicks the send button
    Then user should receive the successfull message

  