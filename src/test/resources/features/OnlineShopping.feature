@pa @OnlineShopping
Feature:E-commerce website for online shopping

Background:Navigated to url
When  User navigated to home application Url


@LandingPageURL
Scenario: User able to open the browser, navigated to url and validate Url
Then  Landing page URL validated 

@LandingPageTitle
Scenario: User able to open the browser,navigated to url and validate Title
Then  Landing page title validated

@ProductCatagories
Scenario: User able to open the browser,navigated to url and product catagories are displayed
Then  All product catagories are displayed

@LPLogovalidation
Scenario: User able to open the browser,navigated to url and landing page logo is displayed
Then  Landing page logo is displayed

@LogoHeight
Scenario: User able to open the browser,navigated to url and landing page logo height validated
Then  Landing page logo height validated

@LogoWidth
Scenario: User able to open the browser,navigated to url and landing page logo width validated
Then  Landing page logo width validated

@Signinpagetitle
Scenario: User navigated to url and click on signin button
When  Click On Sign in button 
Then Sign in page title validated

@SearchResult
Scenario: User navigated to url , Search for product and the list for product displayed

When   Search for product "Dress"
Then  list for product is displayed

@Twittervalidation
Scenario: User navigated to url,click on twitter and validate

When   Click on twitter
Then  Twitter social media page displayed

@newSletter
Scenario: User navigated to url,enter email in newsletter and validate email subsciption is successful 

When   enter "abc963@gmail.com" in newsletter and click on proceed
Then  Email subscription successful is validated


















 
  
