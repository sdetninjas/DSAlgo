package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage{
	//private String URL=BASE_URL+"/home";
	private By signIn = By.xpath("//a[@href='/login']");
	private By userName = By.name("username");
	private By password = By.name("password");
	private By login = By.xpath("//input[@wfd-id='id4']");
	private By dataStructre = By.xpath("//a[@class='nav-link dropdown-toggle']");
	private By arrays = By.xpath("//a[contains(text(),'Arrays')]");
	private By arraysPage = By.xpath("//h4[contains(text(), 'Array')]");
	
	private By linkedList = By.xpath("//a[contains(text(),'Linked List')]");
	private By linkedListPage = By.xpath("//h4[contains(text(), 'Linked List')]");
	private By stack = By.xpath("//a[contains(text(), 'Stack')]"); 
	private By stackPage = By.xpath("//h4[contains(text(), 'Stack')]");
	private By queue = By.xpath("//a[contains(text(), 'Queue')]");
	private By queuePage = By.xpath("//h4[contains(text(), 'Queue')]");
	private By tree = By.xpath("//a[contains(text(), 'Tree')]");
	private By treePage = By.xpath("//h4[contains(text(), 'Tree')]");
	private By graph = By.xpath("//a[contains(text(), 'Graph')]");
	private By graphPage = By.xpath("//h4[contains(text(), 'Graph')]");
	
//	private By getStarted = By.xpath("/html/body/div[2]/div[1]/div/div/a");
//	private By getStartedPage = By.xpath("/html/body/div[2]/h4");
//	private By timeComplexity = By.xpath("/html/body/div[2]/ul/a");
//	private By timeComplexityPage = By.xpath("/html/body/div[2]/div/div[2]/strong/p");
//	private By tryHere = By.xpath("/html/body/div[2]/div/div[2]/a");
//	private By pythonPage = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]"); 
//	private By pythonCode = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span[1]");
//	private By run = By.xpath("//*[@id=\"answer_form\"]/button");
//	private By possitiveMsg = By.xpath("//*[@id=\"output\"]");
//	private By negativeMsg = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span[2]");
//	
	
	
	@Override
	public void openPage() {
		driver.get(BASE_URL+"login");
		waitFor();
		driver.findElement(signIn).click();	
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
	
	
	public void datastructureClick() {
		
		driver.findElement(dataStructre).click();
		waitFor();
	}
	public void arraysClick() {
		driver.findElement(arrays).click();
		waitFor();
	}
	
	public void getArrayInnerText(String valueToCheck) {
     	try {
     		By searchElement = By.xpath("//h4[contains(text(), '"+valueToCheck+"')]");
     		driver.findElement(searchElement);
     		System.out.println(driver.findElement(searchElement).getText().toString());
         	if(!driver.findElement(searchElement).getText().toString().equals(valueToCheck)) {
         		throw new NoSuchElementException("No such element");
         	}
     	} catch (NoSuchElementException ex) {
     	    ex.printStackTrace();
     	    throw ex;
     	}

	}
//	//public void getStartedClick() {
//		//driver.findElement(getStarted).click();
//	}
//	//public void getStartedView() {
//		driver.findElement(getStartedPage);
//		System.out.println(driver.findElement(getStartedPage).getText().toString());
//	}
//	public void timeComplexityClick() {
//		driver.findElement(timeComplexity).click();
//	}
//	public void timeComplexityPageClick() {
//		driver.findElement(timeComplexityPage);
//		System.out.println(driver.findElement(timeComplexityPage).getText().toString());
//	}
//	public void tryHereClick() {
//		driver.findElement(tryHere).click();
//	}
//	public void pythonPageOpen() {
//		driver.findElement(pythonPage).isDisplayed();
//	}
//	public void pythonCodePage(String valueToCheck) {
//		try {
//     		driver.findElement(pythonCode);
//     		System.out.println(driver.findElement(pythonCode).getText().toString());
//         	if(!driver.findElement(pythonCode).getText().toString().equals(valueToCheck)) {
//         		throw new NoSuchElementException("No such element");
//         	}
//     	} catch (NoSuchElementException ex) {
//     	    ex.printStackTrace();
//     	    throw ex;
//     	}
//
//	}
//	public void runClick() {
//		driver.findElement(run).click();
//	}
//	public void possitiveMsgView() {
//	 driver.findElement(possitiveMsg).isDisplayed();	
//	}
//	
	public void linkedListClick() {
		driver.findElement(linkedList).click();
		waitFor();
	}
	public void stack() {
		driver.findElement(stack).click();
		waitFor();
	}
	public void queue() {
		driver.findElement(queue).click();
		waitFor();
	}
	public void tree() {
		driver.findElement(tree).click();
		waitFor();
	}
	public void graph() {
		driver.findElement(graph).click();
		waitFor();
	}
	
	public void loginNow(String userNameValue, String passwordValue) {
		openPage();
		waitFor();
		inputUsername(userNameValue);
		inputPassword(passwordValue);
		loginClick();
	}
//
//	public void newDriver() {
//		// TODO Auto-generated method stub
//		driver = new ChromeDriver();
//	}
//
//	public void quit() {
//		// TODO Auto-generated method stub
//		driver.quit();
//	}
}