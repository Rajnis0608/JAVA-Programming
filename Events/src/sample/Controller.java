package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
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
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;


    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(byeButton)) {
            System.out.println("Bye, " + nameField.getText());
        }
        else if (e.getSource().equals(helloButton)){
            System.out.println("Hello, " + nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Backgroung Thread";
                    System.out.println("I'm going to sleep on the: " + s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" : "Backgroung Thread";
                            System.out.println("I'm updating the label on the: " + s);
                            ourLabel.setText("We did something!");
                        }
                    });
                } catch (InterruptedException event) {
                    //We dont care about this
                }
            }
        };

        new Thread(task).start();


        if(ourCheckBox.isSelected()){
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased(){
        String string = nameField.getText();
        boolean disable = string.isEmpty() || string.trim().isEmpty();
        byeButton.setDisable(disable);
        helloButton.setDisable(disable);
    }

    public void handleChange() {
        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));

    }
}