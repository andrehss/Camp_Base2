package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class CloseIssuePage extends PageBase {

    By closeButton = By.xpath("//input[@value='Close']");
    By comboBoxResolutionField = By.name("resolution");
    By addNoteCloseIssueField = By.name("bugnote_text");
    By closeIssueButton = By.xpath("//input[@value='Close Issue']");
    By statusIssue = By.className("issue-status");

    public String pegarStatusIssue(){return getText(statusIssue);}

    //public String pegarStatusIssueTeste(){return getText(statusIssueTeste);}

    public void selecionarComboBoxResolution(String resolution){comboBoxSelectByVisibleText(comboBoxResolutionField,resolution);}
    public void preencherAddNoteCloseIssue(String note){sendKeys(addNoteCloseIssueField,note);}
    public void clicarEmCloseButton() {
        click(closeButton);
    }
    public void clicarEmCloseIssueButton(){click(closeIssueButton);}
}
