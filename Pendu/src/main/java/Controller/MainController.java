package Controller;

import com.example.pendu.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Button Jouer;

    @FXML
    private TextField Pseudo;

    public void jouerbtn(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/View/"+ "Jeu.fxml" ));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) Jouer.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void pseudobtn(ActionEvent actionEvent) {

    }

}