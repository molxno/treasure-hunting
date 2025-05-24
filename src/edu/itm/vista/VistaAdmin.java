package edu.itm.vista;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class VistaAdmin {

    private final Scene miEscena;
    private final Stage miEscenario;
    private final StackPane miPanelPrincipal;

    public VistaAdmin() {
        miEscenario = new Stage();
        miPanelPrincipal = new StackPane();
        miPanelPrincipal.setAlignment(Pos.TOP_CENTER);

        Ellipse figEllipse = new Ellipse(200, 150);
        figEllipse.setFill(Color.web("#2a2de8"));

        Button btnEjemplo = new Button("Clic aquí");
        btnEjemplo.setFont(new Font(15));
        btnEjemplo.setTextFill(Color.web("#8cf0bb"));

        Label lblEtiqueta = new Label("Hola mundo cruel!");
        lblEtiqueta.setFont(new Font(25));
        lblEtiqueta.setTextFill(Color.web("#fc16e1"));

        Text txtTexto = new Text("Soy un texto");
        txtTexto.setFont(new Font(20));
        txtTexto.setFill(Color.web("#b0f2f7"));

        miPanelPrincipal.getChildren().add(figEllipse);
        miPanelPrincipal.getChildren().add(btnEjemplo);
        miPanelPrincipal.getChildren().add(lblEtiqueta);
        miPanelPrincipal.getChildren().add(txtTexto);

        btnEjemplo.setTranslateY(0);
        lblEtiqueta.setTranslateY(100);
        txtTexto.setTranslateY(200);

        miEscena = new Scene(miPanelPrincipal, 600, 480);
        miEscenario.setScene(miEscena);
    }

    public Stage getMiEscenario() {
        return miEscenario;
    }
}
