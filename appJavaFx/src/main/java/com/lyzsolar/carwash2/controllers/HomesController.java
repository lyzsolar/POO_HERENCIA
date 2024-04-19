
package com.lyzsolar.carwash2.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.carwash2.App;
import com.lyzsolar.carwash2.models.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HomesController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitButton;

    @FXML
    private Button beginButton;

    @FXML
    private TextField usuario;

    @FXML
    private PasswordField contraseña;
    Usuario administrador = new Usuario();
    Usuario lavador = new Usuario();
    Stage callMenu = new Stage();
    Stage menuLavador = new Stage();
    @FXML
    void OnMouseClickExitButton(MouseEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
    @FXML
    void OnMouseClickBeginButton(MouseEvent event) {
        String nombreUsuario = usuario.getText();
        String contrasena = contraseña.getText();

        try{
            if (nombreUsuario.equals(administrador.getUsuario()) && contrasena.equals(administrador.getContrasena())){
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Select.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                callMenu.setTitle("Menu Administrador");
                callMenu.setScene(scene);
                callMenu.show();
            } else if (nombreUsuario.equals(lavador.getUsuario2()) && contrasena.equals(lavador.getContrasena2())){
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("menu-lavador-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                menuLavador.setTitle("Menu Lavador");
                menuLavador.setScene(scene);
                menuLavador.show();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    void initialize() {
    }
}
