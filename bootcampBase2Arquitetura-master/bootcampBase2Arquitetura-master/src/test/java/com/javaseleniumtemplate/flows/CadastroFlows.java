package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.CadastroPage;

public class CadastroFlows {

    CadastroPage cadastroPage;

    public CadastroFlows (){
        cadastroPage = new CadastroPage();
    }

    public void cadastrarReportIssue(){
        cadastroPage.clicarReportIssueField();
    }
}
