package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.EditPage;
import org.junit.Test;

public class EditarReportComSucesso extends TestBase {

    LoginFlows loginFlows;
    EditPage editPage;

    @Test
    public void editarReportComSucesso(){
        loginFlows = new LoginFlows();
        editPage = new EditPage();

        String usuario = "andre.silva";
        String senha = "12345@Mantis@";
        String idIssue = "0009015";
        String nota = "Reta final CAMP BASE2, Let's GO!!!";

        loginFlows.efetuarLogin(usuario,senha);

        editPage.clicarViewSubmittedField();
        editPage.preencherSearchTextField(idIssue);
        editPage.clicarFilter();
        editPage.clicarEditButton();
        editPage.preencherBugnoteTextField(nota);
        editPage.clicarUpdateInformationButton();

        //editPage.clicarViewSubmittedField();
    }
}
