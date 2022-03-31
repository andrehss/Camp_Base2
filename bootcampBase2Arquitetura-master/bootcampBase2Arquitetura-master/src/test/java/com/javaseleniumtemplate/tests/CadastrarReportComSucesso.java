package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CadastrarReportComSucesso extends TestBase {

    LoginFlows loginFlows;
    CadastroPage cadastroPage;
    GlobalParameters globalParameters;

    @Test
    public void cadastrarReportComSucesso() throws IOException {
        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();
        globalParameters = new GlobalParameters();

        String usuario = "andre.silva";
        String senha = "12345@Mantis@";
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
