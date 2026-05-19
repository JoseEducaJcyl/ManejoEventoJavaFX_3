package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Se asigna el título de la ventana principal
        stage.setTitle("Boton y Label Evento");

        // Se crea una etiqueta (Label) con el texto inicial "Texto de ejemplo"
        Label label = new Label("Texto de ejemplo");

        // Se crea un botón con el texto "Boton"
        Button boton = new Button("Boton");

        // Se asigna una acción al botón cuando es presionado
        boton.setOnAction(e -> {
            // Cuando se pulsa el botón, se cambia el texto de la etiqueta
            label.setText("Boton pulsado");
        });

        // Se crea un panel de cuadrícula (GridPane) para organizar los elementos
        GridPane grid = new GridPane();
        // Se establece el espacio horizontal entre columnas: 10 píxeles
        grid.setHgap(10);
        // Se establece el espacio vertical entre filas: 10 píxeles
        grid.setVgap(10);

        // Se añade la etiqueta en la columna 0, fila 0
        grid.add(label, 0, 0);
        // Se añade el botón en la columna 1, fila 0 (a la derecha de la etiqueta)
        grid.add(boton, 1, 0);

        // Se crea la escena con el GridPane como raíz, de 300x300 píxeles
        Scene scene = new Scene(grid, 300, 300);
        // Se asigna la escena a la ventana
        stage.setScene(scene);
        // Se hace visible la ventana
        stage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}