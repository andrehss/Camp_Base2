package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroPage;
import com.javaseleniumtemplate.pages.DeletePage;
import com.javaseleniumtemplate.pages.EditPage;
import com.javaseleniumtemplate.pages.PreencherViewIssuePage;
import org.junit.Assert;
import org.junit.Test;

public class AdicionarUserMonitoringSemSucesso extends TestBase {

    LoginFlows loginFlows;
    PreencherViewIssuePage preencherViewIssuePage;
    DeletePage deletePage;
    EditPage editPage;
    @Test
    public void adicionarUserMonitoringSemSucesso(){

        loginFlows = new LoginFlows();
        preencherViewIssuePage = new PreencherViewIssuePage();
        deletePage = new DeletePage();
        editPage = new EditPage();

        String usuario = "andre.silva";
        String senha = "M@nti$B@se22#";
        String idIssue = "0009436";
        String usuarioMonitorIssue = "andre";
        String mensagemErroAddUserMonitoringIssue = "APPLICATION ERROR";

        loginFlows.efetuarLogin(usuario,senha);
        preencherViewIssuePage.clicarEmViewSubmittedField();
        preencherViewIssuePage.preencherSearchTextField(idIssue);
        preencherViewIssuePage.clicarEmApplyFilter();
        preencherViewIssuePage.clicarEditButton();
        deletePage.clicarEmBackToIssue();
        editPage.preencherUserMonitorIssue(usuarioMonitorIssue);
        editPage.clicarAddUserMonitorIssue();

        Assert.assertTrue(editPage.pegarMessageErrorAddUserMonitoringIssue().contains(mensagemErroAddUserMonitoringIssue));

    }
}
