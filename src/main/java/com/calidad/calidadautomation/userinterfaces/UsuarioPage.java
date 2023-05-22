package com.calidad.calidadautomation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class UsuarioPage extends PageObject {
    public static final Target INPUT_TEXT = Target.the("INPUT TEXT").locatedBy("//*[@id='APjFqb']");
   public static final Target LINK_HOMEPAGE_UDEA = Target.the("LINK UDEA").locatedBy("//*[@id='rso']/div[1]/div/div/div/div/div/div/div/div[1]/a/h3");
    public static final Target TEXT_VALIDATION = Target.the("TEXTO EN LA HOMEPAGE").locatedBy("//*[@id='layoutContainers']/div/div[2]/div/div[4]/section/div[2]/footer/div/div[1]/div/div[3]/p[3]");

}