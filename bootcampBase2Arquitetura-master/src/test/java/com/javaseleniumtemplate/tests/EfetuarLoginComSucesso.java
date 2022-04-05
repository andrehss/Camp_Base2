package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class EfetuarLoginComSucesso extends TestBase {

    LoginFlows loginFlows;
    LoginPage loginPage;

    @Test
    public void efetuarLoginComSucesso(){

        loginFlows = new LoginFlows();
        loginPage = new LoginPage();

        String usuario = "andre.silva";
        String senha = "M@nti$B@se22#";
        String usuarioLogado = "andre.silva";

        loginFlows.efetuarLogin(usuario,senha);

        Assert.assertEquals(loginPage.retornaUserLogin(),usuarioLogado);
    }
}
