package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class DeletePage extends PageBase {

    //Mapping
    By deleteButton = By.xpath("//input[@value='Delete']");
    By deleteIssueButton = By.xpath("//input[@value='Delete Issues']");

    public void clicarEmDeleteButton() {
        click(deleteButton);
    }

    public void clicarEmDeleteIssueButton(){
        click(deleteIssueButton);
    }

}
