package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.CadastroPage;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;
    CadastroPage cadastroPage;
    //Tests
    @Test
    public void efetuarLoginEmailInvalido() throws IOException {

        //Objects instances
        loginPage = new LoginPage();
        cadastroPage = new CadastroPage();

        //Parameteres
        String usuario = "andre.silva";
        String senha = "12345@Mantis@";
        String usuarioLogado = "andre.silva";
        String categoriaId = "[All Projects] Apptest";
        String reproducibility = "sometimes";
        String severity = "trivial";
        String profileId = "PC Windows 10";
        String handlerId = "andre.silva";
        String summary = "Base2";
        String description = "Base2 - Camp Automação de Testes de Software";

        //Test
        //loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaUserLogin().contains(usuarioLogado));

        cadastroPage.clicarReportIssueField();
        cadastroPage.clicarSelectProject();

        cadastroPage.comboBoxSelectCategoryId(categoriaId);
        cadastroPage.comboBoxSelectReproducibility(reproducibility);
        cadastroPage.comboBoxSelectSeverity(severity);
        cadastroPage.comboBoxSelectProfileId(profileId);
        cadastroPage.comboBoxSelectHandlerId(handlerId);
        cadastroPage.preencherSummaryField(summary);
        cadastroPage.preencherDescriptionField(description);
        cadastroPage.clicarSubmitReportField();

        cadastroPage.pegarHtml();
    }

}
