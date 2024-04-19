package com.lyzsolar.carwash2.controllers;

import com.lyzsolar.carwash2.models.CarWash;
import com.lyzsolar.carwash2.models.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class EmpleadosController {

    @FXML
    private Button exit;
    @FXML
    private ListView<String> VerEmpleados;

    @FXML
    void OnMouseClickExitButton(MouseEvent event) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }
    @FXML

    public void initialize() {
        cargarListaEmpleados();
    }
    private void cargarListaEmpleados() {
        ObservableList<String> listaEmpleados = FXCollections.observableArrayList();

        for (Empleado empleado : CarWash.getLavadores()) {
            listaEmpleados.add(empleado.getName());
        }
        VerEmpleados.setItems(listaEmpleados);

        VerEmpleados.setOnMouseClicked(mouseEvent -> {
            String empleadoSelecionado = VerEmpleados.getSelectionModel().getSelectedItem();

            if (empleadoSelecionado !=  null){
                Empleado empleadoElegido = encontrarEmpleadoPorNombre(empleadoSelecionado);

                if (empleadoElegido != null){
                    mostrarDetalles(empleadoElegido);
                }
            }
        });
    }
    private Empleado encontrarEmpleadoPorNombre (String name) {
        for (Empleado empleado : CarWash.getLavadores()) {
            if (empleado.getName().equals(name)) {
                return empleado;
            }
        }
        return null;
    }
    private void mostrarDetalles (Empleado empleado) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Detalles del empleado");
        alert.setHeaderText(null);
        alert.setContentText(
                "ID: " + empleado.getId() + "\n" +
                "Nombre: " + empleado.getName() + "\n" +
                        "Apellido Paterno: " + empleado.getLastName() + "\n" +
                        "Apellido Materno: " + empleado.getSecondName()
        );
        alert.showAndWait();
    }
}
