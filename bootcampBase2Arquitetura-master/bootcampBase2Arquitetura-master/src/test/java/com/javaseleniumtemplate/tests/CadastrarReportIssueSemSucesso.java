package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroPage;
import org.junit.Assert;
import org.junit.Test;

public class CadastrarReportIssueSemSucesso extends TestBase {

    LoginFlows loginFlows;
    CadastroPage cadastroPage;

    @Test
    public void cadastrarReportSemSucesso(){

        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();

        String usuario = "andre.silva";
        String senha = "M@nti$B@se22#";

        String mensagemDeErroReport = "APPLICATION ERROR";

        loginFlows.efetuarLogin(usuario,senha);
        cadastroPage.clicarReportIssueField();
        cadastroPage.clicarSelectProject();
        cadastroPage.clicarSubmitReportField();
        cadastroPage.pegarMensagemDeErroReport();

        Assert.assertTrue(cadastroPage.pegarMensagemDeErroReport().contains(mensagemDeErroReport));

    }
}
