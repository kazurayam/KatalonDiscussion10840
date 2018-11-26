import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.nio.file.Path
import java.nio.file.Paths
import com.kms.katalon.core.configuration.RunConfiguration

WebUI.openBrowser('')

Path projectDir = Paths.get(RunConfiguration.getProjectDir())
Path html = projectDir.resolve('New folder/Workilo __ Create Listing.html')
String htmlStr = html.toUri().toURL().toExternalForm()
WebUI.comment("htmlStr is ${htmlStr}")

WebUI.navigateToUrl(htmlStr)

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
