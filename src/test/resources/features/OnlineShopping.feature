@pa @OnlineShopping
Feature:E-commerce website for online shopping

Background: Navigated to url
When  User navigated to home application Url


@LandingPageURL
Scenario: User able to open the browser, navigated to url and validate Url
Then  Landing page URL after redirection will be "http://automationpractice.com/index.php"

@LandingPageTitle
Scenario: User able to open the browser,navigated to url and validate Title
Then  Landing page title validated with "My Store"

@ProductCatagories
Scenario: User able to open the browser,navigated to url and product catagories are displayed
Then  All product catagories are displayed

@LPLogoValidation
Scenario: User able to open the browser,navigated to url and landing page logo is displayed
Then  Landing page logo is displayed

@LogoHeightTest
Scenario: User able to open the browser,navigated to url and landing page logo height validated
Then  Landing page logo height validated with "99"

@LogoWidthTest
Scenario: User able to open the browser,navigated to url and landing page logo width validated
Then  Landing page logo width validated with "350"

@SigninPageTitle
Scenario: User navigated to url and click on signin button
When  Click On Sign in button 
Then Sign in page title validated with "Login - My Store"

@SearchResult
Scenario: User navigated to url , Search for product and the list for product displayed

When   Search for product "Dress"
Then  list for product is displayed

@Twittervalidation
Scenario: User navigated to url,click on twitter and validate

When   Click on icon twitter from the bottom of page
Then  Twitter social media page displayed

@NewsLetterValidation
Scenario: User navigated to url,enter email in newsletter and validate email subsciption is successful 

When   enter email id in newsletter emailfield and click on proceed
Then  Email subscription successful is validated


















 
  
