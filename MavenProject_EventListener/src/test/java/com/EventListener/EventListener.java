package com.EventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventListener implements WebDriverEventListener {

	 @Override
	    public void afterAlertAccept(WebDriver arg0) {
	        System.out.println("Alert Accepted");
	    }

	    @Override
	    public void afterAlertDismiss(WebDriver arg0) {
	        System.out.println("Alert Dismissed");
	    }

	    @Override
	    public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
	        System.out.println("The value in the element after changing : "+arg2[0]);
	    }

	    @Override
	    public void afterClickOn(WebElement arg0, WebDriver arg1) {
	        System.out.println("Element clicked");
	    }

	    @Override
	    public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	        System.out.println("Element found");
	    }

	    @Override
	    public void afterNavigateBack(WebDriver arg0) {
	        System.out.println("Navigating back to : "+arg0.getCurrentUrl());
	    }

	    @Override
	    public void afterNavigateForward(WebDriver arg0) {
	        System.out.println("Navigating forward to : "+arg0.getCurrentUrl());
	    }

	    @Override
	    public void afterNavigateRefresh(WebDriver arg0) {
	        System.out.println("Url after refreshing : "+arg0.getCurrentUrl());
	    }

	    @Override
	    public void afterNavigateTo(String arg0, WebDriver arg1) {
	        System.out.println("navigating to url : "+arg0);
	    }

	    @Override
	    public void afterScript(String arg0, WebDriver arg1) {
	        System.out.println("Executed javascript : "+arg0);
	    }

	    @Override
	    public void beforeAlertAccept(WebDriver arg0) {
	        System.out.println("Before accepting alert");
	    }

	    @Override
	    public void beforeAlertDismiss(WebDriver arg0) {
	        System.out.println("Before dismissing alert");
	    }

	    @Override
	    public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
	        System.out.println("Before changing the value : "+arg2[0]);
	    }

	    @Override
	    public void beforeClickOn(WebElement arg0, WebDriver arg1) {
	        System.out.println("Trying to click on the element");
	    }

	    @Override
	    public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	        System.out.println("Trying to find the element");
	    }

	    @Override
	    public void beforeNavigateBack(WebDriver arg0) {
	        System.out.println("Url before navigating back : "+arg0.getCurrentUrl());

	    }

	    @Override
	    public void beforeNavigateForward(WebDriver arg0) {
	        System.out.println("Url before navigating forard");
	    }

	    @Override
	    public void beforeNavigateRefresh(WebDriver arg0) {
	        System.out.println("Url before refreshing page : "+arg0.getCurrentUrl());
	    }

	    @Override
	    public void beforeNavigateTo(String arg0, WebDriver arg1) {
	        System.out.println("Current Url : "+arg1.getCurrentUrl());
	    }

	    @Override
	    public void beforeScript(String arg0, WebDriver arg1) {
	        System.out.println("Executing javascript : " +arg0);
	    }

	    @Override
	    public void onException(Throwable arg0, WebDriver arg1) {
	        System.out.println("Exception throwed : "+arg0.getMessage());
	    }

		@Override
		public void beforeSwitchToWindow(String windowName, WebDriver driver) {
//			System.out.println("windows switching to " +arg0);
			
		}

		@Override
		public void afterSwitchToWindow(String windowName, WebDriver driver) {
//			System.out.println("Exception throwed : " +arg0);
			
		}

		@Override
		public <X> void beforeGetScreenshotAs(OutputType<X> target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeGetText(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterGetText(WebElement element, WebDriver driver, String text) {
			// TODO Auto-generated method stub
			
		}

}
