package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class CadastroPage extends PageBase {

    By reportIssueField = By.linkText("Report Issue");
    By selectProjectButton = By.className("button");
    By comboId = By.name("category_id");

    public void clicarReportIssueField(){click(reportIssueField);}
    public void clicarSelectProject(){click(selectProjectButton);}

    public void comboBoxSelectCategoryId(String categoriaId) {
        comboBoxSelectByVisibleText(comboId, categoriaId);
    }




}
