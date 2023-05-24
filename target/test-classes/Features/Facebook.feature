Feature: Facebook Functionality Testing

Scenario Outline: Facebook login credential testing
Given User should be in the login page
When User should enter the "<username>" and "<password>"
And User should click the login button
Then User should verify the successful message



Examples:
| username | password  |
| anand    | anand@123 |
| siva     | abi@123   |
| abi      | ananda@123|