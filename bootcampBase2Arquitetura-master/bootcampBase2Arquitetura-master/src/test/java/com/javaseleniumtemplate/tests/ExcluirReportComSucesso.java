package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.DeletePage;
import com.javaseleniumtemplate.pages.EditPage;
import com.javaseleniumtemplate.pages.PreencherViewIssuePage;
import org.junit.Test;

public class ExcluirReportComSucesso extends TestBase {

    LoginFlows loginFlows;
    PreencherViewIssuePage preencherViewIssuePage;
    DeletePage deletePage;

    @Test
    public void excluirReportComSucesso(){

        loginFlows = new LoginFlows();
        preencherViewIssuePage = new PreencherViewIssuePage();
        deletePage = new DeletePage();

        String usuario = "andre.silva";
        String senha = "12345@Mantis@";
        String idIssue = "0009013";

        loginFlows.efetuarLogin(usuario,senha);
        preencherViewIssuePage.clicarEmViewSubmittedField();
        preencherViewIssuePage.preencherSearchTextField(idIssue);
        preencherViewIssuePage.clicarEmApplyFilter();
        preencherViewIssuePage.clicarEditButton();
        deletePage.clicarEmBackToIssue();
        deletePage.clicarEmDeleteButton();
        deletePage.clicarEmDeleteIssueButton();

    }
}
