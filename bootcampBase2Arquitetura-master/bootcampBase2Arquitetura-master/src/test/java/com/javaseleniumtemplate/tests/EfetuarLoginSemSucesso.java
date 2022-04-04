package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class EfetuarLoginSemSucesso extends TestBase {

    LoginFlows loginFlows;
    LoginPage loginPage;

    @Test
    public void efetuarLoginSemSucesso(){
        loginFlows = new LoginFlows();
        loginPage = new LoginPage();

        String usuario = "andre.silva";
        String senha = "senhaerrada";
        String mensagemDeErroLogin = "Your account may be disabled or blocked or the username/password you entered is incorrect.";

        loginFlows.efetuarLogin(usuario,senha);

        Assert.assertEquals(loginPage.pegarMessagemDeErroLogin(),mensagemDeErroLogin);
    }
}
