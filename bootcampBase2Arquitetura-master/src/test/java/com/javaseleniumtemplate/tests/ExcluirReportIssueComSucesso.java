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

        /* Poderá ser atribuido a variavel idIssue somente algum valor que já tenha sido criado.
        Massa de Dados: 0009511, 0009512, 0009513, 0009514, 0009515, 0009516, 0009517, 0009518 */
        String idIssue = "0009511";

        loginFlows.efetuarLogin(usuario,senha);
        searchBugPage.preencherIdBug(idIssue);
        searchBugPage.clicarBotaoJump();
        deletePage.clicarEmDeleteButton();
        deletePage.clicarEmDeleteIssueButton();

    }
}
