package com.lyzsolar.carwash2.controllers;

import com.lyzsolar.carwash2.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectController {

    @FXML
    private Button employer;

    @FXML
    private Button service;
    @FXML
    private Button exit;
    @FXML
    private Button VerEmpleados;
    @FXML
    private Button verServicio;
    Stage agregarLavador = new Stage();
    Stage agregarServicio = new Stage();
    Stage listaEmpleados = new Stage();
    Stage listaPaquetes = new Stage();

    @FXML
    void onMouseClickEmployerButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarLavador.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        agregarLavador.setTitle("Agregar Lavador");
        agregarLavador.setScene(scene);
        agregarLavador.show();
    }

    @FXML
    void onMouseClickServiceButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarServicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        agregarServicio.setTitle("Agregar Servicio");
        agregarServicio.setScene(scene);
        agregarServicio.show();
    }
    @FXML
    void onMouseClickExitButton(MouseEvent event) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }
    @FXML
    void onMouseClickVerEmpleadosButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("EmpleadosView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        listaEmpleados.setTitle("Lista De Empleados");
        listaEmpleados.setScene(scene);
        listaEmpleados.show();
    }
    @FXML
    void onMouseClickVerServiciosButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("NuevosPaquetes.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        listaPaquetes.setTitle("Lista De Servicios");
        listaPaquetes.setScene(scene);
        listaPaquetes.show();
    }
}