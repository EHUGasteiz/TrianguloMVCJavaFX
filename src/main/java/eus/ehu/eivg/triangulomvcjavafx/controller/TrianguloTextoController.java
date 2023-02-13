package eus.ehu.eivg.triangulomvcjavafx.controller;

import eus.ehu.eivg.triangulomvcjavafx.model.TrianguloRectangulo;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;

public class TrianguloTextoController implements Initializable {
    private final TrianguloRectangulo model = TrianguloRectangulo.getTrianguloRectangulo();

    private NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtBase;

    @FXML
    private TextField txtHipotenusa;

    @FXML
    void setAltura(ActionEvent event) {
        // TODO: modificar la altura del modelo (Utilizar nf.parse para evitar problemas con el formato de los números)
    }

    @FXML
    void setBase() {
        // TODO: modificar la base del modelo (Utilizar nf.parse para evitar problemas con el formato de los números)
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       // TODO: aplicar el MVC para que el controlador sepa cuando hay que actualizar la vista y la vista muestre los datos del modelo
    }
}

