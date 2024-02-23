package com.pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataStructurePage extends BasePage{
	private By outputMember = By.cssSelector("#output");
	private By signIn = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
	private By userName = By.name("username");
	private By password = By.name("password");
	private By login = By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");

	private By codeMirrorPath = By.className("CodeMirror");
	private By classMirrorLine = By.className("CodeMirror-line");
	private By codeTextArea = By.cssSelector("textarea");
	private By getStarted = By.xpath("//a[@href='data-structures-introduction']");
	private By practiceQuestionLink = By.xpath("//a[@href='/data-structures-introduction/practice']");
	private By timeComplexity = By.xpath("//a[@href='time-complexity']");
	private By tryHere = By.xpath("//a[@href='/tryEditor']");
	private By pythonEditParent = By.xpath("//div[@class='code-area']");
	private By pythonEdit = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div");
	private By pythonEdit2 = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div");
	private By pythonCode = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span[1]");
	private By run = By.xpath("//button[contains(text(), 'Run')]");
	private By positiveMsg = By.xpath("//*[@id=\"output\"]");
	private By negativeMsg = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span[2]");
	private By practiceQuestionpage = By.xpath("//div[@id='content']");

	@Override
	public void openPage() {
		driver.get(BASE_URL+"login");
		waitFor();
		driver.findElement(signIn).click();	
	}
	public void getStartedPageText(String elementType, String valueToCheck) {
		try {
			findElementWithRoleName(elementType, valueToCheck);
		} catch (NoSuchElementException ex) {
			ex.printStackTrace();
			throw ex;
		}
	}
	public void tryHereClick() {
		driver.findElement(tryHere).click();
	}
	public void pythonCodeOpen() {
		driver.findElement(pythonCode).isDisplayed();
	}
	public void runClick() {
		driver.findElement(run).click();
	}
	public void positiveMsgPage() {
		driver.findElement(positiveMsg).isDisplayed();
	}
	public void negativeMsgPage() {
		driver.findElement(negativeMsg).isDisplayed(); 
	}

	public void enterPythonCode(String valueToEditor) {
		
		/* getting codemirror element */
		WebElement codeMirror = driver.findElement(codeMirrorPath);

		/* getting the first line of code inside codemirror and clicking it to bring it in focus */
		WebElement codeLine = codeMirror.findElements(classMirrorLine).get(0);
		codeLine.click();

		/* sending keystokes to textarea once codemirror is in focus */
		WebElement txtbx = codeMirror.findElement(codeTextArea);
		txtbx.sendKeys(valueToEditor);
	}

	public void validatePythonResponse() {
		/* getting codemirror element */
		WebElement txtbx = driver.findElement(outputMember);
		Assert.assertTrue(txtbx.getText().contains("Hello world!"));

	}
	public void timeComplexityClick()
	{
		driver.findElement(timeComplexity).click();
	}

	public void practiceQuestionClick()
	{
		driver.findElement(practiceQuestionLink).click();
	}
	
	public void getStartedClick() {
		waitFor();
		waitFor();
		driver.findElement(getStarted).click();
	}
	public void get(String string) {
		// TODO Auto-generated method stub

	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void getAlertText() {
		driver.switchTo().alert().getText();
	}
	public void acceptAlertText() {
		driver.switchTo().alert().accept();
	}

	public void loginNow(String userNameValue, String passwordValue) {
		openPage();
		waitFor();
		inputUsername(userNameValue);
		inputPassword(passwordValue);
		loginClick();

	}
	public void inputUsername(String userNameValue) {

		driver.findElement(userName).sendKeys(userNameValue);

	}

	public void inputPassword(String passwordValue) {

		driver.findElement(password).sendKeys(passwordValue);

	}

	public void siginClick() {

		driver.findElement(signIn).click();
	}

	public void loginClick() {

		driver.findElement(login).click();
	}

	public WebElement findElementWithRoleName(String elementType, String checkTextValue) {
		return driver.findElement(By.xpath("//"+elementType+"[contains(text(), '" + checkTextValue + "')]"));
	}

	public void checkNoAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
			wait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			if (e instanceof NoAlertPresentException || e instanceof TimeoutException) {
			} else {
				throw e;
			}
		}
	}
	
	
	public void checkAlertError() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
		    System.out.println(alert.getText());
		    Assert.assertTrue(alert.getText().contains("NameError: name 'aaaa' is not defined on line 1"));
		    alert.accept();
		} catch (Exception e) {
			if (e instanceof NoAlertPresentException || e instanceof TimeoutException) {
				throw e;
			}
			throw e;
		}
	}
	public void checkBlankPage() {
		Assert.assertTrue(driver.findElement(practiceQuestionpage).getText().isBlank());		
	}
}