package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CloseIssuePage;
import com.javaseleniumtemplate.pages.PreencherViewIssuePage;
import org.junit.Assert;
import org.junit.Test;

public class FinalizarReportIssueComSucesso extends TestBase {

    LoginFlows loginFlows;
    PreencherViewIssuePage preencherViewIssuePage;
    CloseIssuePage closeIssuePage;

    @Test
    public void finalizarReportComSucesso(){

        String usuario = "andre.silva";
        String senha = "M@nti$B@se22#";
        String idIssue = "0009435";
        String statusIssue = "closed";

        loginFlows = new LoginFlows();
        preencherViewIssuePage = new PreencherViewIssuePage();
        closeIssuePage = new CloseIssuePage();

        loginFlows.efetuarLogin(usuario,senha);
        preencherViewIssuePage.clicarEmViewSubmittedField();
        preencherViewIssuePage.clicarEmAdvancedFiltersField();
        preencherViewIssuePage.preencherSearchTextField(idIssue);
        preencherViewIssuePage.clicarEmApplyFilter();

        Assert.assertEquals(closeIssuePage.pegarStatusIssue(),statusIssue);

    }
}
