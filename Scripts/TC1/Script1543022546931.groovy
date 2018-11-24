import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('file:///Users/urayamakazuaki/katalon-workspace/KatalonDiscussion10840/New%20folder/Workilo%20__%20Create%20Listing.html')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Workilo  Create Listing/h3_service or gig details'), 10)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Workilo  Create Listing/a_Rotate Image'), 10)

WebUI.click(findTestObject('Object Repository/Page_Workilo  Create Listing/a_Rotate Image'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Workilo  Create Listing/i_X_fa fa-rotate-left  button_'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Workilo  Create Listing/i_X_fa fa-rotate-right  button'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Workilo  Create Listing/i_X_fa fa-rotate-right  button'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Workilo  Create Listing/i_X_fa fa-rotate-left  button_'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Workilo  Create Listing/button_Cancel'))

WebUI.closeBrowser()
