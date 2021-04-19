package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);

    }
    @FXML
    private TextField nameField;

    @FXML
    private Button byeButton;

    @FXML
    private Button helloButton;

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(byeButton)) {
            System.out.println("Bye, " + nameField.getText());
        }
        else if (e.getSource().equals(helloButton)){
            System.out.println("Hello, " + nameField.getText());

        }
    }

    @FXML
    public void handleKeyReleased(){
        String string = nameField.getText();
        boolean disable = string.isEmpty() || string.trim().isEmpty();
        byeButton.setDisable(disable);
        helloButton.setDisable(disable);
    }
}