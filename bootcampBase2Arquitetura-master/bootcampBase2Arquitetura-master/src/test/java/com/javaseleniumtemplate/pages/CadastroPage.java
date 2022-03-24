package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CadastroPage extends PageBase {

    By reportIssueField = By.linkText("Report Issue");
    By selectProjectButton = By.className("button");




    public void clicarReportIssueField(){click(reportIssueField);}
    public void clicarSelectProject(){click(selectProjectButton);}



     //   comboCategoria.selectByVisibleText("[Todos os Projetos] app_14");
     //   comboFrequencia.selectByVisibleText("aleatório");
     //   comboGravidade.selectByVisibleText("mínimo");
     //   resumoField.sendKeys("Estou aprendendo automação de teste");
     //   descricaoField.sendKeys("Prática para testar conhecimentos obtidos durante a Apresentação da Base2 ministrada por José Mario");
     //   passosField.sendKeys("Criar Tarefa\nSelecionar Categoria\nSelecionar Frequencia\nSelecionar Gravidade\nPreencher Resumo" +
     //           "\nPreencher Descrição\nPreencher passos para reproduzir");

    /*By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@value='Login']");
    By cookieButton = By.xpath("//*[@aria-label='dismiss cookie message']");
    By sucessUser = By.className("italic");

    //Actions
    public void preenhcerUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }

    public void clicarEmAceitarCookies(){
        click(cookieButton);
    }

    public String retornaUserLogin(){
        return getText(sucessUser);
    }*/
}
