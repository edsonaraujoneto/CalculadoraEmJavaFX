package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Calculation;

public class controllerScreenCalculator implements Initializable {

    @FXML
    private Button buttonDeletekey;

    @FXML
    private Button buttonClean;
    
    @FXML
    private Button buttonDivision;
    
    @FXML
    private Button buttonEqual;
    
    @FXML
    private Button buttonSubtration;
    
    @FXML
    private Button buttonMultiplication;
    
    @FXML
    private Button buttonBracket;
    
    @FXML
    private Button buttonAddition;
    
    @FXML
    private Button buttonDot;
    
    @FXML
    private Button buttonZero;
    
    @FXML
    private Button buttonOne;
    
    @FXML
    private Button buttonTwo;
    
    @FXML
    private Button buttonThree;
    
    @FXML
    private Button buttonFour;
    
    @FXML
    private Button buttonFive;

    @FXML
    private Button buttonSix;
    
    @FXML
    private Button buttonSeven;
    
    @FXML
    private Button buttonEight;
    
    @FXML
    private Button buttonNine;

    @FXML
    private Label labelHistoric;

    @FXML
    private TextField textFieldSpaceBar;
    
    Calculation calculation = new Calculation();
    
    double number,answer;
    int type;
    
    public void calcular() {
        labelHistoric.setText(labelHistoric.getText()+textFieldSpaceBar.getText());
        switch (type) {
            case 1: {// Addition
                answer = calculation.addition(number, Double.parseDouble(textFieldSpaceBar.getText()));
                textFieldSpaceBar.setText(Double.toString(answer));
                break;
            }
            case 2: { // Subtration
                answer = calculation.subtration(number, Double.parseDouble(textFieldSpaceBar.getText()));
                textFieldSpaceBar.setText(Double.toString(answer));
                break;
            }
            case 3: { // Multiplication
                answer = calculation.multiplication(number, Double.parseDouble(textFieldSpaceBar.getText()));
                textFieldSpaceBar.setText(Double.toString(answer));
                break;
            }
            case 4: { // Division
                answer = calculation.division(number, Double.parseDouble(textFieldSpaceBar.getText()));
                textFieldSpaceBar.setText(Double.toString(answer));
                break;
            }
        }
    }

    @FXML
    public void handleButtonDeleteKey(ActionEvent event) {
        labelHistoric.setText("");
        int lenght = textFieldSpaceBar.getText().length();
        int number = textFieldSpaceBar.getText().length() - 1;
        String store = "";
        
        if (lenght > 0) {
            StringBuilder back = new StringBuilder(textFieldSpaceBar.getText());
            back.deleteCharAt(number);
            store = back.toString();
            textFieldSpaceBar.setText(store);
        }
    }


    @FXML
    public void handleButtonClean(ActionEvent event) {
        textFieldSpaceBar.setText("");
        labelHistoric.setText("");
    }

    @FXML
    public void handleButtonDivision(ActionEvent event) {
        labelHistoric.setText("");
        number = Double.parseDouble(textFieldSpaceBar.getText());
        type = 4;
        textFieldSpaceBar.setText("");
        labelHistoric.setText(labelHistoric.getText()+number+"/");
    }

    @FXML
    public void handleButtonEqual(ActionEvent event) {
        calcular();
    }
    
    @FXML
    public void handleButtonSubtration(ActionEvent event) {
        labelHistoric.setText("");
        number = Double.parseDouble(textFieldSpaceBar.getText());
        type = 2;
        textFieldSpaceBar.setText("");
        labelHistoric.setText(labelHistoric.getText()+number+"-");
    }
    
    @FXML
    public void handleButtonMultiplication(ActionEvent event) {
        labelHistoric.setText("");
        number = Double.parseDouble(textFieldSpaceBar.getText());
        type = 3;
        textFieldSpaceBar.setText("");
        labelHistoric.setText(labelHistoric.getText()+number+"*");
    }
    
    
    @FXML
    public void handleButtonBracket(ActionEvent event) {

    }

    @FXML
    public void handleButtonAddition(ActionEvent event) {
        labelHistoric.setText("");
        number = Double.parseDouble(textFieldSpaceBar.getText());
        type = 1;
        textFieldSpaceBar.setText("");
        labelHistoric.setText(labelHistoric.getText()+number+"+");
        
    }
    
    @FXML
    public void handleButtonDot(ActionEvent event) {
        if (textFieldSpaceBar.getText().equals("")) { 
        }
        else {
            textFieldSpaceBar.setText(textFieldSpaceBar.getText()+".");
        }
    }
    
    @FXML
    public void handleButtonZero(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"0");
    }

    @FXML
    public void handleButtonOne(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"1");
    }
    
    
    @FXML
    public void handleButtonTwo(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"2");
    }
    
    @FXML
    void handleButtonThree(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"3");
    }
    
    @FXML
    public void handleButtonFour(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"4");
    }
    
    @FXML
    public void handleButtonFive(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"5");
    }

    @FXML
    public void handleButtonSix(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"6");
    }

    @FXML
    public void handleButtonSeven(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"7");
    }
    
    @FXML
    public void handleButtonEight(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"8");
    }
    
    @FXML
    public void handleButtonNine(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"9");
    }

    @Override
    public void initialize(URL url , ResourceBundle rb) {
        textFieldSpaceBar.requestFocus();
    }
}
