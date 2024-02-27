package com.pages;

import org.openqa.selenium.By;

public class StackPage extends BasePage{
	private By signIn = By.xpath("//a[@href='/login']");
	private By userName = By.name("username");
	private By password = By.name("password");
	private By login = By.xpath("//input[@wfd-id='id4']");
	private By getStarted = By.xpath("//a[@href='stack']");
	private By stackPage = By.xpath("//h4[@class=\"bg-secondary text-white\"]");
	private By operationalInStack = By.xpath("");
	private By operationalInStackPage = By.xpath("//p[@class='bg-secondary text-white' and @align='center']");
	private By tryHere = By.xpath("//a[@href='/tryEditor']");
	private By application = By.xpath("//a[@href='/stack/stack-applications/']");
	private By applicationPage = By.xpath("//p[text()='Stack' and @align='center']");
	private By tryHere1 = By.xpath("//a[@href='/tryEditor']");
	private By implementation = By.xpath("/stack/implementation/");
	private By implementationPage = By.xpath("//p[@class='bg-secondary text-white' and @align='center']");
	private By tryHere2 = By.xpath("//a[@href='/tryEditor']");
	private By practiceQuestion = By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	private By practiceQuestionPage = By.xpath("//a[@class='navbar-brand']");
	
	
	
	@Override
	public void openPage() {
		// TODO Auto-generated method stub
		
	}
}
