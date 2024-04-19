package com.lyzsolar.carwash2.controllers;

import com.lyzsolar.carwash2.models.CarWash;
import com.lyzsolar.carwash2.models.Servicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class NuevosPaquetesController {

    @FXML
    private ListView<String> VerNuevosPaquetes;

    @FXML
    private Button Exit;

    @FXML
    void OnMouseClickExitButton(MouseEvent event) {
        Stage stage = (Stage) Exit.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void initialize () {
        cargarPaquetes();
    }
    private void cargarPaquetes() {
        ObservableList<String> listaPaquetes = FXCollections.observableArrayList();

        for (Servicio paquete : CarWash.getServicios()) {
            listaPaquetes.add(paquete.getNombre());
        }
        VerNuevosPaquetes.setItems(listaPaquetes);

        VerNuevosPaquetes.setOnMouseClicked(mouseEvent -> {
            String paqueteSelecionado = VerNuevosPaquetes.getSelectionModel().getSelectedItem();

            if (paqueteSelecionado !=  null){
                Servicio paqueteElegido = encontrarPaquetePorNombre(paqueteSelecionado);

                if (paqueteElegido != null){
                    mostrarDetalles(paqueteElegido);
                }
            }
        });
    }
    private Servicio encontrarPaquetePorNombre (String nombre) {
        for (Servicio paquete : CarWash.getServicios()) {
            if (paquete.getNombre().equals(nombre)) {
                return paquete;
            }
        }
        return null;
    }
    private void mostrarDetalles (Servicio paquete) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Detalles Del Paquete");
        alert.setHeaderText(null);
        alert.setContentText(
                        "Nombre: " +  paquete.getNombre() + "\n" +
                        "Precio: " + paquete.getPrecioPaq() + "\n" +
                        "Descripción: " + paquete.getDescripcion()
        );
        alert.showAndWait();
    }
}
