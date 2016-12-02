package com.johnson;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class jenkins_test extends UiAutomatorTestCase {
	public void testBrowserGoogle() throws UiObjectNotFoundException{
		UiDevice.getInstance().pressHome();
		UiObject browser=new UiObject(new UiSelector().text("Chrome"));
		browser.clickAndWaitForNewWindow();
		UiObject edit=new UiObject(new UiSelector().className("android.widget.EditText"));
		edit.click();
		UiDevice.getInstance().pressDelete();
		edit.setText("www.google.com");
		UiDevice.getInstance().pressEnter();
	}
}
