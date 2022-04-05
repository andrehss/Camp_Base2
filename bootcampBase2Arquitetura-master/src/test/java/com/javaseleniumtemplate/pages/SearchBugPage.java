package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class SearchBugPage extends PageBase {

    //Mapping
    By idBugField = By.xpath("//input[@value='Issue #']");
    By jumpButton = By.xpath("//input[@value='Jump']");
    By messageErrorSearchBug = By.className("form-title");

    //Actions
    public void preencherIdBug(String idBug){
        sendKeys(idBugField,idBug);
    }

    public void clicarBotaoJump(){
        click(jumpButton);
    }

    public String pegarMensagemErroSearchBug(){
        return getText(messageErrorSearchBug);
    }
}
