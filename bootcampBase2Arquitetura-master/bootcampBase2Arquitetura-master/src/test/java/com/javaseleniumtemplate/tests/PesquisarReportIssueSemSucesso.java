package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.SearchBugPage;
import org.junit.Assert;
import org.junit.Test;

public class PesquisarReportIssueSemSucesso extends TestBase {

    LoginPage loginPage;
    SearchBugPage searchBugPage;
    @Test
    public void pesquisarIssueSemSucesso(){

        loginPage = new LoginPage();
        searchBugPage = new SearchBugPage();

        String usuario = "andre.silva";
        String senha = "M@nti$B@se22#";
        String idBug = "0009014";
        String messagemSearchBug = "APPLICATION ERROR";

        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
        searchBugPage.preencherIdBug(idBug);
        searchBugPage.clicarBotaoJump();

        Assert.assertTrue(searchBugPage.pegarMensagemErroSearchBug().contains(messagemSearchBug));
    }
}
