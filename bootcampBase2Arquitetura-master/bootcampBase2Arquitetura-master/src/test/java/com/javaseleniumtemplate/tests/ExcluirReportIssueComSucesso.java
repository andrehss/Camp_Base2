package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.DeletePage;
import com.javaseleniumtemplate.pages.SearchBugPage;
import org.junit.Test;

public class ExcluirReportIssueComSucesso extends TestBase {

    LoginFlows loginFlows;
    SearchBugPage searchBugPage;
    DeletePage deletePage;

    @Test
    public void excluirReportComSucesso(){

        loginFlows = new LoginFlows();
        searchBugPage = new SearchBugPage();
        deletePage = new DeletePage();

        String usuario = "andre.silva";
        String senha = "M@nti$B@se22#";
        String idIssue = "0009435";

        loginFlows.efetuarLogin(usuario,senha);
        searchBugPage.preencherIdBug(idIssue);
        searchBugPage.clicarBotaoJump();
        deletePage.clicarEmDeleteButton();
        deletePage.clicarEmDeleteIssueButton();

    }
}
