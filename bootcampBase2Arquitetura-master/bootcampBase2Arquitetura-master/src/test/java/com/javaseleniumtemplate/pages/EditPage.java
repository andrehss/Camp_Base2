package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class EditPage extends PageBase {

    //By viewSubmittedField = By.partialLinkText("view.php?id=9015"); // Neste caso esta sendo usado para pesquisa do Report Issue o código 0009015, tentar alterar para o clique no lapis
    By viewSubmittedField = By.linkText("View Issues");
    By searchTextField = By.name("search");
    By bugnoteTextField = By.name("bugnote_text");
    //By addNoteButton = By.xpath("//input[@value='Add Note']");
    By editButton = By.cssSelector("[title~=Edit]");
    By applyFilterButton = By.xpath("//input[@value='Apply Filter']");
    By updateInformationButton = By.xpath("//input[@value='Update Information']");

    public void clicarViewSubmittedField(){
        click(viewSubmittedField);
    }

    public void preencherSearchTextField(String idIssue){ sendKeys(searchTextField,idIssue);}

    public void clicarFilter (){ click(applyFilterButton);}

    public void clicarEditButton(){
        click(editButton);
    }

    public void preencherBugnoteTextField(String nota){
        sendKeys(bugnoteTextField,nota);
    }

    public void clicarUpdateInformationButton(){click(updateInformationButton);}




}
