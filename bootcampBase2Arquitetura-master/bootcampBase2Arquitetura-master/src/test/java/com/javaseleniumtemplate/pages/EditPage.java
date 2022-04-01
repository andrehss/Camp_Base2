package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class EditPage extends PageBase {

    By bugnoteTextField = By.name("bugnote_text");
    By updateInformationButton = By.xpath("//input[@value='Update Information']");
    By comboBoxStatusField = By.name("status");
    By comboBoxPriorityField = By.name("priority");

    public void preencherBugnoteTextField(String nota){
        sendKeys(bugnoteTextField,nota);
    }

    public void selecionarComboBoxPriority(String prioridade){comboBoxSelectByVisibleText(comboBoxPriorityField, prioridade);}

    public void selecionarComboBoxStatus(String status){comboBoxSelectByVisibleText(comboBoxStatusField,status);}

    public void clicarUpdateInformationButton(){click(updateInformationButton);}






}
