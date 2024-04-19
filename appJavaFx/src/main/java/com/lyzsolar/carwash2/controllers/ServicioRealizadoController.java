package com.lyzsolar.carwash2.controllers;

import com.gluonhq.charm.glisten.control.TextField;
import com.lyzsolar.carwash2.models.CarWash;
import com.lyzsolar.carwash2.models.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ServicioRealizadoController {

    @FXML
    private Button exit;

    @FXML
    private ListView<String> VerServicios;
    @FXML
    private Button totalButton;

    @FXML
    private TextField totalservicioText;

    @FXML
    void OnMouseClickTotalButton(MouseEvent event) {

    }
    @FXML
    void OnMouseClickExitButton(MouseEvent event) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void initialize () {
        cargarServicios();
    }
    private void cargarServicios() {
        ObservableList<String> listaServicios = FXCollections.observableArrayList();

        for (Vehiculo vehiculo : CarWash.getVehiculos()) {
            listaServicios.add(vehiculo.getId());
        }
        VerServicios.setItems(listaServicios);

        VerServicios.setOnMouseClicked(mouseEvent -> {
            String servicioSelecionado = VerServicios.getSelectionModel().getSelectedItem();

            if (servicioSelecionado !=  null){
                Vehiculo servicioElegido = encontrarServicioPorNombre(servicioSelecionado);

                if (servicioElegido != null){
                    mostrarDetalles(servicioElegido);
                }
            }
        });
    }
    private Vehiculo encontrarServicioPorNombre (String id) {
        for (Vehiculo vehiculo : CarWash.getVehiculos()) {
            if (vehiculo.getId().equals(id)) {
                return vehiculo;
            }
        }
        return null;
    }
    private void mostrarDetalles (Vehiculo vehiculo) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Detalles Del Servicio");
        alert.setHeaderText(null);
        alert.setContentText(
                "ID: " + vehiculo.getId() + "\n" +
                        "Tamaño: " + vehiculo.getTamaño() + "\n" +
                        "Paquete: " + vehiculo.getPaquete() + "\n" +
                        "Precio del paquete: " + vehiculo.getPrecioPaquete() + "\n" +
                        "Total: " + vehiculo.getTotal()
        );
        alert.showAndWait();
    }
}
