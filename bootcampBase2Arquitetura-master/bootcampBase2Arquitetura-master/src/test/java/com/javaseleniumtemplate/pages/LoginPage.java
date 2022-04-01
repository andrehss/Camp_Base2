package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    //Mapping
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@value='Login']");
    By cookieButton = By.xpath("//*[@aria-label='dismiss cookie message']");
    By sucessUser = By.className("italic");

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

    public void clicarEmAceitarCookies(){
        click(cookieButton);
    }

    public String retornaUserLogin(){
        return getText(sucessUser);
    }
    
}
