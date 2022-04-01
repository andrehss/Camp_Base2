package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.*;

public class CadastroPage extends PageBase {

    By reportIssueField = By.linkText("Report Issue");
    By selectProjectButton = By.className("button");
    By categoryIdComboBox = By.name("category_id");
    By reproducibilityComboBox = By.name("reproducibility");
    By severityComboBox = By.name("severity");
    By profileIdComboBox = By.name("profile_id");
    By handlerIdComboBox = By.name("handler_id");
    By summaryField = By.name("summary");
    By descriptionField = By.name("description");
    By submitReportField = By.xpath("//input[@value='Submit Report']");

    public void clicarReportIssueField(){click(reportIssueField);}
    public void clicarSelectProject(){click(selectProjectButton);}

    public void comboBoxSelectCategoryId(String categoriaId) {
        comboBoxSelectByVisibleText(categoryIdComboBox, categoriaId);
    }
    public void comboBoxSelectReproducibility(String reproducibility){
        comboBoxSelectByVisibleText(reproducibilityComboBox, reproducibility);
    }
    public void comboBoxSelectSeverity(String severity){
        comboBoxSelectByVisibleText(severityComboBox,severity);
    }
    public void comboBoxSelectProfileId(String profile_id) {comboBoxSelectByVisibleText(profileIdComboBox,profile_id);}
    public void comboBoxSelectHandlerId(String handler_id) {comboBoxSelectByVisibleText(handlerIdComboBox,handler_id);}

    public void preencherSummaryField(String summary){sendKeys(summaryField,summary);}
    public void preencherDescriptionField(String description){sendKeys(descriptionField,description);}

    public void clicarSubmitReportField(){click(submitReportField);}

    public String pegarHtml() throws IOException{

        return driver.getPageSource();

    }












}
