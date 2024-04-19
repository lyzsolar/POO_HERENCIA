package com.lyzsolar.carwash2.controllers;

import com.lyzsolar.carwash2.models.CarWash;
import com.lyzsolar.carwash2.models.Empleado;
import com.lyzsolar.carwash2.models.Servicio;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgregarServicioController {

    @FXML
    private TextField precioText;

    @FXML
    private TextField nombreText;

    @FXML
    private TextField descripText;

    @FXML
    private Button save;

    @FXML
    private Button exit;

    @FXML
    void onClickExitButton(MouseEvent event) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickSaveButton(MouseEvent event) {
        String nombre = nombreText.getText();
        double precioPaq = Double.parseDouble(precioText.getText());
        String descripcion = descripText.getText();

        Servicio nuevoServicio = new Servicio(nombre,precioPaq,descripcion);
        CarWash.addServicio(nuevoServicio);

        nombreText.clear();
        precioText.clear();
        descripText.clear();
    }

}
