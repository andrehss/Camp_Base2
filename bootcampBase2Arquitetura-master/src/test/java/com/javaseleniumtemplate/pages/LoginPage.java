package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    //Mapping
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@value='Login']");
    By sucessUserField = By.className("italic");
    By messagemErrorLoginField = By.cssSelector("[color='red']");

    //Actions
    public void preencherUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }

    public String retornaUserLogin(){
        return getText(sucessUserField);
    }

    public String pegarMessagemDeErroLogin(){return getText(messagemErrorLoginField);}

}
