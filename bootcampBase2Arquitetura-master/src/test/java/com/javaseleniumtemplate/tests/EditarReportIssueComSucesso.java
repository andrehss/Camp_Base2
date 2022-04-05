package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.EditPage;
import com.javaseleniumtemplate.pages.PreencherViewIssuePage;
import com.javaseleniumtemplate.pages.SearchBugPage;
import org.junit.Test;

public class EditarReportIssueComSucesso extends TestBase {

    LoginFlows loginFlows;
    EditPage editPage;
    SearchBugPage searchBugPage;

    @Test
    public void editarReportComSucesso(){
        loginFlows = new LoginFlows();
        editPage = new EditPage();
        searchBugPage = new SearchBugPage();

        String usuario = "andre.silva";
        String senha = "M@nti$B@se22#";

        /* Poderá ser atribuido a variavel idIssue somente algum valor que já tenha sido criado.
        Dados para o teste: 0009512, 0009513, 0009514, 0009515, 0009516, 0009517, 0009518 */
        String idIssue = "0009012";

        //Dados atribuidos as variaveis extraidos do sistema
        String nota = "Reta final CAMP BASE2, Let's GO!!!";
        String prioridade = "low";
        String status = "closed";

        loginFlows.efetuarLogin(usuario,senha);
        searchBugPage.preencherIdBug(idIssue);
        searchBugPage.clicarBotaoJump();
        editPage.clicarEditButton();
        editPage.selecionarComboBoxPriority(prioridade);
        editPage.preencherBugnoteTextField(nota);
        editPage.selecionarComboBoxStatus(status);
        editPage.clicarUpdateInformationButton();

    }
}
