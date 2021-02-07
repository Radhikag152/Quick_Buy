Feature: Buy items in amazon

#@dataFile:C:\Users\Radhika\Desktop\from_git\username_passwd.xlsx
#@sheetName:Sheet1
#@key:1
  Scenario: Buy items in amazon online
    Given get "https://www.amazon.in/Fastrack-Denim-Analog-Womens-Watch-6180SL01/dp/B07N3Q6W6K/ref=sr_1_180?crid=1XAPK1RNB5D7N&dchild=1&keywords=fastrack+watches+for+women&qid=1611985847&sprefix=fast%2Caps%2C411&sr=8-180"
	Given refresh page till buy button visibile
#	Given click on "page.buynow.button"
#	Given sendKeys "<email>" into "emailPhone.sigin.input"
#	Given click on "login.continue.button"
#	Given sendKeys "<password>" into "login.passwd.input"
#	Given click on "login.signin.button"
#	Given wait for "<milliseconds>"
	