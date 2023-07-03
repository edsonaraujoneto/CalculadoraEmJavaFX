package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controllerTelaCalculadora implements Initializable {

    @FXML
    private Button buttonApagar;

    @FXML
    private Button buttonCinco;

    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonDivisao;

    @FXML
    private Button buttonDois;

    @FXML
    private Button buttonIgual;

    @FXML
    private Button buttonMenos;

    @FXML
    private Button buttonMultiplicar;

    @FXML
    private Button buttonNove;

    @FXML
    private Button buttonOito;

    @FXML
    private Button buttonParenteses;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button buttonPonto;

    @FXML
    private Button buttonQuatro;

    @FXML
    private Button buttonSeis;

    @FXML
    private Button buttonSete;

    @FXML
    private Button buttonTres;

    @FXML
    private Button buttonUm;

    @FXML
    private Button buttonZero;

    @FXML
    private Label labelHistorico;

    @FXML
    private TextField textFieldSpaceBar;
    
    double numero,resultado;
    int tipo;
    
    public void calcular() {
        labelHistorico.setText("");
        switch (tipo) {
            case 1: {// Adição
                resultado = numero + Double.parseDouble(textFieldSpaceBar.getText());
                textFieldSpaceBar.setText(Double.toString(numero));
                break;
            }
            case 2: { // subtração
                resultado = numero - Double.parseDouble(textFieldSpaceBar.getText());
                textFieldSpaceBar.setText(Double.toString(numero));
                break;
            }
            case 3: { // multiplicação
                resultado = numero * Double.parseDouble(textFieldSpaceBar.getText());
                textFieldSpaceBar.setText(Double.toString(numero));
                break;
            }
            case 4: { // divisão
                resultado = numero /   Double.parseDouble(textFieldSpaceBar.getText());
                textFieldSpaceBar.setText(Double.toString(numero));
                break;
            }
        }
    }

    @FXML
    public void handleButtonApagar(ActionEvent event) {
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
    public void handleButtonCinco(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"5");
    }

    @FXML
    public void handleButtonClear(ActionEvent event) {
        textFieldSpaceBar.setText("");
    }

    @FXML
    public void handleButtonDivisao(ActionEvent event) {
        if (textFieldSpaceBar.getText().equals("")) { 
        }
        else {
            textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"/");
        }
    }

    @FXML
    public void handleButtonDois(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"2");
    }

    @FXML
    public void handleButtonIgual(ActionEvent event) {
        calcular();
    }

    @FXML
    public void handleButtonMenos(ActionEvent event) {
        if (textFieldSpaceBar.getText().equals("")) { 
        }
        else {
            textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"-");
        }
    }

    @FXML
    public void handleButtonMultiplicar(ActionEvent event) {
        if (textFieldSpaceBar.getText().equals("")) { 
        }
        else {
            textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"*");
        }
    }

    @FXML
    public void handleButtonNove(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"9");
    }

    @FXML
    public void handleButtonOito(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"8");
    }

    @FXML
    public void handleButtonParenteses(ActionEvent event) {

    }

    @FXML
    public void handleButtonPlus(ActionEvent event) {
        numero = Double.parseDouble(textFieldSpaceBar.getText());
        tipo = 1;
        textFieldSpaceBar.setText("");
        labelHistorico.setText(labelHistorico.getText()+numero+"+");
        
    }

    @FXML
    public void handleButtonPonto(ActionEvent event) {
        if (textFieldSpaceBar.getText().equals("")) { 
        }
        else {
            textFieldSpaceBar.setText(textFieldSpaceBar.getText()+".");
        }
    }

    @FXML
    public void handleButtonQuatro(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"4");
    }

    @FXML
    public void handleButtonSeis(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"6");
    }

    @FXML
    public void handleButtonSete(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"7");
    }

    @FXML
    void handleButtonTres(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"3");
    }

    @FXML
    public void handleButtonUm(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"1");
    }

    @FXML
    public void handleButtonZero(ActionEvent event) {
        textFieldSpaceBar.setText(textFieldSpaceBar.getText()+"0");
    }

    @Override
    public void initialize(URL url , ResourceBundle rb) {
    }
}
