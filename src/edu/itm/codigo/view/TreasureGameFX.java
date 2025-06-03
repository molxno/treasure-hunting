package edu.itm.codigo.view;

import edu.itm.codigo.application.TreasureGame;
import java.util.NoSuchElementException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TreasureGameFX extends Application {

    private TreasureGame game;
    private Button[][] botones;

    @Override
    public void start(Stage primaryStage) {
        // 1. Pedir tamaño del tablero
        TextInputDialog sizeDialog = new TextInputDialog("5");
        sizeDialog.setHeaderText("Buscando el Tesoro");
        sizeDialog.setContentText("Ingrese tamaño del tablero (número de filas = columnas):");
        int n;
        try {
            String input = sizeDialog.showAndWait().orElseThrow();
            n = Integer.parseInt(input);
            if (n <= 0) {
                showAlert(Alert.AlertType.ERROR, "Entrada inválida", "Debe ingresar un número entero **mayor que cero**.");
                return;
            }
        } catch (NumberFormatException | NoSuchElementException e) {
            showAlert(Alert.AlertType.ERROR, "Entrada inválida", "Debe ingresar un número entero **mayor que cero**.");
            return;
        }

        // 2. Inicializar lógica y UI
        game = new TreasureGame(n, n);
        botones = new Button[n][n];
        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Button btn = new Button("-");
                btn.setMinSize(50, 50);
                int fila = i, col = j;
                btn.setOnAction(e -> manejarClick(btn, fila, col, primaryStage));
                botones[i][j] = btn;
                grid.add(btn, j, i);
            }
        }

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Buscando el Tesoro");
        primaryStage.show();
    }

    private void manejarClick(Button btn, int fila, int col, Stage stage) {
        int resultado = game.intentar(fila, col);
        if (resultado == -1) {
            showAlert(Alert.AlertType.WARNING, "Coordenada inválida",
                    "La posición [" + fila + ", " + col + "] está fuera del tablero.");
            return;
        }

        if (resultado == 1) {
            btn.setText(":D");
            btn.setStyle("-fx-background-color: gold;");
            // 3. Mensaje de victoria
            Alert win = new Alert(Alert.AlertType.INFORMATION);
            win.setHeaderText("¡Felicidades encontraste el tesoro!");
            win.setContentText("Lo encontraste en [" + fila + ", " + col + "].\n¿Quieres jugar de nuevo?");
            ButtonType yes = new ButtonType("Sí");
            ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
            win.getButtonTypes().setAll(yes, no);
            win.showAndWait().ifPresent(resp -> {
                if (resp == yes) {
                    stage.close();
                    start(new Stage());
                } else {
                    stage.close();
                }
            });
        } else {
            btn.setText("X");
            btn.setStyle("-fx-background-color: red;");
        }
    }

    private void showAlert(Alert.AlertType tipo, String titulo, String msg) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}
