package com.lyzsolar.carwash2.controllers;

import com.lyzsolar.carwash2.models.CarWash;
import com.lyzsolar.carwash2.models.Empleado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgregarLavadorController {

    @FXML
    private TextField idText;

    @FXML
    private TextField nameText;

    @FXML
    private TextField lastname;

    @FXML
    private TextField secondname;

    @FXML
    private Button save;

    @FXML
    private Button Exit;

    @FXML
    void onClickExitButton(MouseEvent event) {
        Stage stage = (Stage) Exit.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickSaveButton(MouseEvent event) {
        String id = idText.getText();
        String name = nameText.getText();
        String lastName = lastname.getText();
        String secondName = secondname.getText();

        Empleado nuevoEmpleado = new Empleado(id,name,lastName,secondName);
        CarWash.addEmpleado(nuevoEmpleado);

        idText.clear();
        nameText.clear();
        lastname.clear();
        secondname.clear();
    }
}
