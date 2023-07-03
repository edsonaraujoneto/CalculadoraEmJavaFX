package view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculadora extends Application{
    private static Scene scene1;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root1 = FXMLLoader.load (getClass().getResource("/fxml/TelaCalculadora.fxml"));
        scene1 = new Scene(root1);

        stage.setTitle("Calculadora");
        stage.setResizable(false);
        stage.setScene(scene1);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }    
}
