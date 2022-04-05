package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.*;
import org.junit.Assert;
import org.junit.Test;

public class AdicionarUserMonitoringSemSucesso extends TestBase {

    LoginFlows loginFlows;
    DeletePage deletePage;
    EditPage editPage;
    SearchBugPage searchBugPage;

    @Test
    public void adicionarUserMonitoringSemSucesso(){

        loginFlows = new LoginFlows();
        deletePage = new DeletePage();
        editPage = new EditPage();
        searchBugPage = new SearchBugPage();

        String usuario = "andre.silva";
        String senha = "M@nti$B@se22#";

        /* Poderá ser atribuido a variavel idIssue somente algum valor que já tenha sido criado.
        Massa de Dados: 0009511, 0009512, 0009513, 0009514, 0009515, 0009516, 0009517, 0009518 */
        String idIssue = "0009511";

        String usuarioMonitorIssue = "andre";
        String mensagemErroAddUserMonitoringIssue = "APPLICATION ERROR";

        loginFlows.efetuarLogin(usuario,senha);
        searchBugPage.preencherIdBug(idIssue);
        searchBugPage.clicarBotaoJump();
        editPage.preencherUserMonitorIssue(usuarioMonitorIssue);
        editPage.clicarAddUserMonitorIssue();

        Assert.assertTrue(editPage.pegarMessageErrorAddUserMonitoringIssue().contains(mensagemErroAddUserMonitoringIssue));

    }
}
