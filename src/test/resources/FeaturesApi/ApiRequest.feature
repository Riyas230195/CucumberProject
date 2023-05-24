Feature: Api Request type testing

Scenario: To check GET request for Queryparameter
Given User enters baseURI "http://reqres.in/" and create requestObject for GETRequest
When User adds the headers for GETRequest
When User adds the QueryParameter for GETRequest
And User create "GET" responseObject to for GETRequest
#Then user should validate the statuscode 200 for GETRequest

Scenario: To check GET request1 for Pathparameter
Given User enters baseURI "http://reqres.in/" and create requestObject for GETRequest1
When User adds the headers for GETRequest1
When User adds the QueryParameter for GETRequest1
And User create "GET" responseObject to for GETRequest1
#Then user should validate the statuscode 200 for GETRequest

Scenario: To check POST request
Given User enters baseURI "http://reqres.in/" and create requestObject for PostRequest
When User adds the headers for PostRequest
When User adds the JSON Body 
And User create "POST" responseObject to for PostRequest
#Then user should validate the statuscode 201 for PostRequest




