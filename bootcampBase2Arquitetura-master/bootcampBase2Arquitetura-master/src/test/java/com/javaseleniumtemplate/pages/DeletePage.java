package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class DeletePage extends PageBase {

    By deleteButton = By.xpath("//input[@value='Delete']");
    By backToIssueField = By.linkText("Back To Issue");
    By deleteIssueButton = By.xpath("//input[@value='Delete Issues']");

    public void clicarEmBackToIssue(){click(backToIssueField);}
    public void clicarEmDeleteButton() {click(deleteButton);}
    public void clicarEmDeleteIssueButton(){click(deleteIssueButton);}
}
