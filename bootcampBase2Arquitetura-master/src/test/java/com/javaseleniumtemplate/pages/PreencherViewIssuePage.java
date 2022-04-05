package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class PreencherViewIssuePage extends PageBase {

    //Mapping
    By viewSubmittedField = By.linkText("View Issues");
    By searchTextField = By.name("search");
    By applyFilterButton = By.xpath("//input[@value='Apply Filter']");
    By advancedFiltersField = By.linkText("Advanced Filters");

    //Actions
    public void clicarEmViewSubmittedField(){
        click(viewSubmittedField);
    }

    public void clicarEmAdvancedFiltersField(){
        click(advancedFiltersField);
    }

    public void preencherSearchTextField(String idIssue){
        sendKeys(searchTextField,idIssue);
    }

    public void clicarEmApplyFilter(){
        click(applyFilterButton);
    }

}
