package com.lyzsolar.carwash2.controllers;

import com.lyzsolar.carwash2.models.CarWash;
import com.lyzsolar.carwash2.models.Empleado;
import com.lyzsolar.carwash2.models.Vehiculo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CarwasheroController {

    @FXML
    private AnchorPane idText;

    @FXML
    private Button closeButton;

    @FXML
    private TextField IdcarText;

    @FXML
    private TextField tamañocarTex;

    @FXML
    private TextField paqueteText;

    @FXML
    private TextField preciopaqueteText;

    @FXML
    private TextField totalpago;

    @FXML
    private Button save;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickSaveButton(MouseEvent event) {
        String id = IdcarText.getText();
        String tamaño = tamañocarTex.getText();
        String paquete = paqueteText.getText();
        String preciopaquete = preciopaqueteText.getText();
        double total = Double.parseDouble(totalpago.getText());

        Vehiculo nuevoVehiculo = new Vehiculo(id,tamaño,paquete,preciopaquete, total);
        CarWash.addVehiculo(nuevoVehiculo);

        IdcarText.clear();
        tamañocarTex.clear();
        paqueteText.clear();
        preciopaqueteText.clear();
        totalpago.clear();
    }

}
