package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class EditPage extends PageBase {

    By viewSubmittedField = By.partialLinkText("View Submitted Issue");
    
    By bugnoteTextField = By.name("bugnote_text");
    By addNoteButton = By.xpath("//input[@value='Add Note']");


    public void clicarViewSubmittedField(){
        click(viewSubmittedField);
    }

    public void preencherBugnoteTextField(String nota){
        sendKeys(bugnoteTextField,nota);
    }

    public void clicarAddNoteButton(){
        click(addNoteButton);
    }


}
