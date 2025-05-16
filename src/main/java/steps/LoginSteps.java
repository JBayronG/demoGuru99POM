package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.LoginPage;


public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser(){
        loginPage.open();
    }

    @Step
    public void escribirUsuario(String usuario){
        loginPage.setTxtUser(usuario);
    }

    @Step
    public void escribirPassword(String pass){
        loginPage.setTxtPass(pass);
    }

    @Step
    public void clicLogin(){
        loginPage.clickBtnLogin();
    }

    @Step
    public void validarMensaje(String mensajeEsperado){
        String mensajeObtenido = loginPage.obtenerMensaje();
        assert mensajeObtenido.contains(mensajeEsperado) : "Mensaje esperado no coincide. Esperado: " + mensajeEsperado + ", pero fue: " + mensajeObtenido;
    }
}

