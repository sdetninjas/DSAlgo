package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TreePage extends BasePage {
	//private WebDriver driver;
	
	

	@FindBy(xpath="//*[@href='tree']")
	private WebElement getStarted;
	
	@FindBy(xpath="//a[text()='Overview of Trees']")
	private WebElement overviewTree;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	private WebElement tryHere ;
	
	@FindBy(xpath="//*[@id='answer_form']/button")
	private WebElement run; 
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	private WebElement editor;
	
	@FindBy(xpath="//a[text()='Terminologies']")
	private WebElement terminologiesBtn ;
	
	@FindBy(xpath="//a[text()='Types of Trees']")
	private WebElement typesOfTressBtn ;
	
	
	@FindBy(xpath="//a[text()='Tree Traversals']")
	private WebElement treeTransversalBtn ;
	
	@FindBy(xpath="//a[text()='Traversals-Illustration']")
	private WebElement transversalIllustrationBtn ;
	
	@FindBy(xpath="//a[text()='Binary Trees']")
	private WebElement binaryTreesBtn ;
	

	@FindBy(xpath="//a[text()='Types of Binary Trees']")
	private WebElement typesOfBinaryTreesBtn ;
	
	@FindBy(xpath="//a[text()='Implementation in Python']")
	private WebElement implementationInPythonBtn ;
	
	@FindBy(xpath="//a[text()='Binary Tree Traversals']")
	private WebElement binaryTreeTraversalBtn ;
	
	@FindBy(xpath="//a[text()='Implementation of Binary Trees']")
	private WebElement implementationOfBinaryTreeBtn ;
	
	@FindBy(xpath="//a[text()='Applications of Binary trees']")
	private WebElement applicationsOfBinaryTreeBtn ;
	
	@FindBy(xpath="//a[text()='Binary Search Trees']")
	private WebElement binarySearchTree ;
	
	@FindBy(xpath="//a[text()='Implementation Of BST']")
	private WebElement implementationOfBstBtn ;
	
	@FindBy(xpath="//a[text()='Practice Questions']")
	private WebElement practiseQuesBtn ;	
	
	@FindBy(id="output")
	private WebElement output;
	
	
	@FindBy(id="id_username")
	private WebElement userName;

	
	@FindBy(id="id_password")
	private WebElement passWord;
	
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement logInBtn;
	
//	public TreePage(WebDriver driver) {
//		this.driver=driver;
//	}
	
	
//	public TreePage(WebDriver driver) {
//		this.driver=driver;
//		}


	@Override
	public void openPage() {
		driver.get(BASE_URL + "login");
		
	}
	
	public void enterLoginCreds(String username, String password) {
		userName.sendKeys(username);
		passWord.sendKeys(password);
		logInBtn.click();

		
	}
	public void clickGetStarted() {
		getStarted.click();
		
	}
	public void clickOnOverviewTrees() {
		overviewTree.click();
	}
	public void clickTryHere() {
		tryHere.click();
	}
	public void clickRun() {
		run.click();
	}
	public void clickEditor() {
		editor.click();
	}
	public void enterPyCode() {
		editor.sendKeys("print 'hello';");
	}
	public void enterInvaliPyCode() {
		editor.sendKeys("abcd");

	}
	public void clickTerminologies() {
		terminologiesBtn.click();
	}
	public void clickTypesOfTree() {
		typesOfTressBtn.click();
	}
	public void clickTreeTraversals() {
		treeTransversalBtn.click();
	}
	public void clickTraversalIllust() {
		transversalIllustrationBtn.click();
	}
	public void clickBinaryTree() {
		binaryTreesBtn.click();
	}
	public void clickTypesBinaryTree() {
		typesOfBinaryTreesBtn.click();
	}
	public void clickImplementPy() {
		implementationInPythonBtn.click();
	}
	public void clickBinaryTreeTravers() {
		binaryTreeTraversalBtn.click();
	}
	public void clickImplementBinaryTree() {
		implementationOfBinaryTreeBtn.click();
	}
	public void clickApplicatnBiTree() {
		applicationsOfBinaryTreeBtn.click();
	}
	public void clickBinarySearchTree() {
		binarySearchTree.click();
	}
	public void clickImplementatnBST() {
		implementationOfBstBtn.click();
	}
	public void clickPractiseQ() {
		practiseQuesBtn.click();
	}
	public String output() {
		String outputTxt = output.getText();
		return outputTxt;
	}
}
