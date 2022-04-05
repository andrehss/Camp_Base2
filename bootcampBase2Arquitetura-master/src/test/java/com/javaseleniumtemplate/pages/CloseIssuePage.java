package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class CloseIssuePage extends PageBase {

    //Mapping
    By statusIssue = By.className("issue-status");

    //Actions
    public String pegarStatusIssue(){
        return getText(statusIssue);
    }

}
