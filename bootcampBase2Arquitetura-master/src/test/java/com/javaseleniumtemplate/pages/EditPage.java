package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class EditPage extends PageBase {

    //Mapping
    By bugnoteTextField = By.name("bugnote_text");
    By updateInformationButton = By.xpath("//input[@value='Update Information']");
    By comboBoxStatusField = By.name("status");
    By comboBoxPriorityField = By.name("priority");
    By userMonitorIssueField = By.name("username");
    By addUserMonitorIssueButton = By.xpath("//div[@id='monitoring_open']/table[@class='width100']//input[@value='Add']");
    By messageErrorAddUserMonitoringIssueField = By.className("form-title");
    By editButton = By.xpath("//input[@value='Edit']");

    //Actions
    public void preencherBugnoteTextField(String nota){
        sendKeys(bugnoteTextField,nota);
    }

    public void selecionarComboBoxPriority(String prioridade){
        comboBoxSelectByVisibleText(comboBoxPriorityField, prioridade);
    }

    public void selecionarComboBoxStatus(String status){
        comboBoxSelectByVisibleText(comboBoxStatusField,status);
    }

    public void clicarUpdateInformationButton(){
        click(updateInformationButton);
    }

    public void preencherUserMonitorIssue(String usuarioMonitorIssue){
        sendKeys(userMonitorIssueField,usuarioMonitorIssue);
    }

    public void clicarAddUserMonitorIssue(){
        click(addUserMonitorIssueButton);
    }

    public void clicarEditButton(){
        click(editButton);
    }

    public String pegarMessageErrorAddUserMonitoringIssue(){
        return getText(messageErrorAddUserMonitoringIssueField);
    }

}
