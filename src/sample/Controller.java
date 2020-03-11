package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button buttonSuma;

    @FXML
    Button buttonResta;

    @FXML
    Button buttonMultiplicacion;

    @FXML
    Button buttonDivision;

    @FXML
    TextField texto1;

    @FXML
    TextField texto2;

    @FXML
    TextField resultado;

    private Calculator c = new Calculator();

    public void buttonSumaAction() {

        resultado.setText("" + c.sumar(Integer.parseInt(texto1.getText()), Integer.parseInt(texto2.getText())));

    }

    public void buttonRestaAction() {

        resultado.setText("" + c.restar(Integer.parseInt(texto1.getText()), Integer.parseInt(texto2.getText())));

    }

    public void buttonDivisionAction() {

        resultado.setText("" + c.dividir(Integer.parseInt(texto1.getText()), Integer.parseInt(texto2.getText())));

    }

    public void buttonMultiplicacionAction() {

        resultado.setText("" + c.multiplicar(Integer.parseInt(texto1.getText()), Integer.parseInt(texto2.getText())));

    }


}
