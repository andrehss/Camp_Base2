package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.EditPage;
import com.javaseleniumtemplate.pages.PreencherViewIssuePage;
import org.junit.Test;

public class EditarReportComSucesso extends TestBase {

    LoginFlows loginFlows;
    PreencherViewIssuePage preencherViewIssuePage;
    EditPage editPage;

    @Test
    public void editarReportComSucesso(){
        loginFlows = new LoginFlows();
        preencherViewIssuePage = new PreencherViewIssuePage();
        editPage = new EditPage();

        String usuario = "andre.silva";
        String senha = "12345@Mantis@";
        String idIssue = "0009013";
        String nota = "Reta final CAMP BASE2, Let's GO!!!";
        String prioridade = "low";
        String status = "closed";

        loginFlows.efetuarLogin(usuario,senha);

        preencherViewIssuePage.clicarEmViewSubmittedField();
        preencherViewIssuePage.preencherSearchTextField(idIssue);
        preencherViewIssuePage.clicarEmApplyFilter();
        preencherViewIssuePage.clicarEditButton();

        editPage.selecionarComboBoxPriority(prioridade);
        editPage.preencherBugnoteTextField(nota);
        editPage.selecionarComboBoxStatus(status);
        editPage.clicarUpdateInformationButton();

    }
}
