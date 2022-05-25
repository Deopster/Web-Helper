package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //FXMLLoader loader = new FXMLLoader(Main.class.getResource("sample/sample.fxml"));
        primaryStage.setTitle("Программа v1.3");
        primaryStage.setScene(new Scene(root, 1680, 820));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
