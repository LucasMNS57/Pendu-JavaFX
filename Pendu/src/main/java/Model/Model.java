package Model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Model {

    @FXML
    private String saisiL;

    @FXML
    private TextField saisiM;

    @FXML
    private TextField motdec;

    private String wordToGuess;

public void Model() {
    Charset charset = StandardCharsets.UTF_8;
    try {
        List<String> lines = Files.readAllLines(Path.of("/Users/lucasgremese/Downloads/Pendu/src/main/java/liste/liste_francais.txt"), charset);
        int randomIndex = (int) (Math.random() * lines.size());
        wordToGuess = lines.get(randomIndex);
    } catch (IOException ex) {
        System.out.format("I/O error: %s%n", ex);
    }
}


    @FXML
    void saisiLtxt(ActionEvent event, String word) {
        if (saisiL == word) {

        }
    }

    @FXML
    void saisiMtxt(ActionEvent event) {

    }


}
