Feature: Buy items in amazon

@dataFile:resources/data/logintestdata.xls
@sheetName:LoginSheet
@key:login
  Scenario Outline: Sample Tests
    Given get "<url_required>"
	Given click on "page.buynow.button"
	Given sendKeys "uname" into "emailPhone.sigin.input"
	Given click on "login.continue.button"
	Given sendKeys "passwd" into "login.passwd.input"
	Given click on "login.signin.button"
	Given wait for "<milliseconds>"
	
	Examples:
	|milliseconds|url_required|
	|100000|https://www.amazon.in/Fastrack-Denim-Analog-Womens-Watch-6180SL01/dp/B07N3Q6W6K/ref=sr_1_180?crid=1XAPK1RNB5D7N&dchild=1&keywords=fastrack+watches+for+women&qid=1611985847&sprefix=fast%2Caps%2C411&sr=8-180|
