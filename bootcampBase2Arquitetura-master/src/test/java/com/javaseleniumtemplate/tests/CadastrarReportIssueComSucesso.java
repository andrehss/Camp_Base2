package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CadastrarReportIssueComSucesso extends TestBase {

    LoginFlows loginFlows;
    CadastroPage cadastroPage;

    @Test
    public void cadastrarReportComSucesso() throws IOException {

        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();


        String usuario = "andre.silva";
        String senha = "M@nti$B@se22#";

        //Dados atribuidos as variaveis extraidos do sistema
        String categoriaId = "[All Projects] Apptest";
        String reproducibility = "sometimes";
        String severity = "trivial";
        String profileId = "PC Windows 10";
        String handlerId = "andre.silva";
        String summary = "Base2";
        String description = "Base2 - Camp Automação de Testes de Software";
        String mensagemSuccessful = "Operation successful.";

        loginFlows.efetuarLogin(usuario,senha);
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

        Assert.assertTrue(cadastroPage.pegarHtml().contains(mensagemSuccessful));
    }
}
