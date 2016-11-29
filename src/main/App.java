package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    // El método start debe ser implementado en la aplicación
    // En el start se crea la interfaz de usuario
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("../fxml/Main.fxml"));
        //Scene scene = new Scene(root, 600, 400); // Se crea la scene

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/Main.fxml"));
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root, 600, 400); // Se crea la scene

        primaryStage.setTitle("Mi Canal");
        primaryStage.setResizable(false); // Se pone esto para que no pueda ser resizable
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Aquí solo se llama al launch
    public static void main(String[] args) {
        launch(args);
    }




}