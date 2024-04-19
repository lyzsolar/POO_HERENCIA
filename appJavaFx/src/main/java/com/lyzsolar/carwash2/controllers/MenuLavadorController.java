package com.lyzsolar.carwash2.controllers;

import com.lyzsolar.carwash2.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuLavadorController {

    @FXML
    private Button servicio;

    @FXML
    private Button servicioRealizado;

    @FXML
    private Button exit;
    Stage carwashero = new Stage();
    Stage servicioRealzado = new Stage();

    @FXML
    void OnMouseClickExitButton(MouseEvent event) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseClickServicioButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Carwashero-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        carwashero.setTitle("Servicios");
        carwashero.setScene(scene);
        carwashero.show();
    }

    @FXML
    void OnMouseClickServicioRealizadoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ServicioRealizado.view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        servicioRealzado.setTitle("Servicios Realizados");
        servicioRealzado.setScene(scene);
        servicioRealzado.show();
    }

}
