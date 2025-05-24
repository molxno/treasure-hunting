package edu.itm.aplicacion;

import edu.itm.vista.VistaAdmin;

import javafx.stage.Stage;
import javafx.application.Application;

public class Principal extends Application {

    private VistaAdmin adminVista;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        adminVista = new VistaAdmin();
        stage = adminVista.getMiEscenario();
        stage.setTitle("Dios mio funciona");
        stage.show();
    }
}
