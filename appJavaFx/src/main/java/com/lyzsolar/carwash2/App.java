package com.lyzsolar.carwash2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class App extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("homes.view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("CarWash - Home");
        stage.setScene(scene);
        stage.show();
    }
}