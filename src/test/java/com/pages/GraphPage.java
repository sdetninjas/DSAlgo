package com.pages;

import org.openqa.selenium.By;

public class GraphPage extends BasePage {
	private By signIn = By.xpath("//a[@href='/login']");
	private By userName = By.name("username");
	private By password = By.name("password");
	private By login = By.xpath("//input[@wfd-id='id4']");
	private By getStarted = By.xpath("//a[@href='graph']");
	private By getStartedPage = By.xpath("//h4[@class='bg-secondary text-white']");
	private By graph = By.xpath("//p[text()='Graph' and @align='center']");
	private By graphpage = By.xpath("//p[text()='Graph' and @align='center']");
	private By tryHere = By.xpath("//a[@class='btn btn-info']");
	private By graphRepresentation = By.xpath("//a[@href=\"/graph/graph-representations/\"]");
	private By graphRepresentationPage = By.xpath("//p[text()= 'Graph' and @align='center']");
	private By tryHere2 = By.xpath("//a[@class='btn btn-info']");
	
	@Override
	public void openPage() {
		// TODO Auto-generated method stub
		driver.get(BASE_URL + "login");
	}
	
	
}
