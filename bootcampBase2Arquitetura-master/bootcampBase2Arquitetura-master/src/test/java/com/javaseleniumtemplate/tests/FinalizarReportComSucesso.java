package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CloseIssuePage;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.PreencherViewIssuePage;
import org.junit.Assert;
import org.junit.Test;

public class FinalizarReportComSucesso extends TestBase {

    LoginFlows loginFlows;
    PreencherViewIssuePage preencherViewIssuePage;
    CloseIssuePage closeIssuePage;


    @Test
    public void finalizarReportComSucesso(){

        String usuario = "andre.silva";
        String senha = "12345@Mantis@";
        String idIssue = "0009013";
        String resolution = "suspended";
        String note = "Chamado FINALIZADO sem solução";
        String statusIssue = "closed";

        loginFlows = new LoginFlows();
        preencherViewIssuePage = new PreencherViewIssuePage();
        closeIssuePage = new CloseIssuePage();

        loginFlows.efetuarLogin(usuario,senha);
        preencherViewIssuePage.clicarEmViewSubmittedField();
        preencherViewIssuePage.clicarEmAdvancedFiltersField();
        preencherViewIssuePage.preencherSearchTextField(idIssue);
        preencherViewIssuePage.clicarEmApplyFilter();

        //closeIssuePage.pegarStatusIssue();

        //closeIssuePage.clicarEmCloseButton();
        //closeIssuePage.selecionarComboBoxResolution(resolution);
        //closeIssuePage.preencherAddNoteCloseIssue(note);
        //closeIssuePage.clicarEmCloseIssueButton();

        /*preencherViewIssuePage.clicarEmViewSubmittedField();
        preencherViewIssuePage.clicarEmAdvancedFiltersField();
        preencherViewIssuePage.preencherSearchTextField(idIssue);
        preencherViewIssuePage.clicarEmApplyFilter();
        preencherViewIssuePage.clicarEmIdViewIssue();*/

        Assert.assertTrue(closeIssuePage.pegarStatusIssue().contains(statusIssue));
        //Assert.assertTrue(closeIssuePage.pegarStatusIssue().contains(statusIssue));


    }
}
