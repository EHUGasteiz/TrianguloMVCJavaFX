package eus.ehu.eivg.triangulomvcjavafx.controller;

import eus.ehu.eivg.triangulomvcjavafx.model.TrianguloRectangulo;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;

public class TrianguloGraficoCompletoController implements Initializable {
    private final TrianguloRectangulo model = TrianguloRectangulo.getTrianguloRectangulo();

    private NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());

    @FXML
    private ToggleGroup colorGroup;
    @FXML
    private Group drawGroup;

    @FXML
    private RadioButton rbBlue;

    @FXML
    private RadioButton rbGreen;

    @FXML
    private RadioButton rbRed;

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

    private void repintarTriangulo() {
        double base = model.getBase().doubleValue();
        double altura = model.getAltura().doubleValue();

        // coordinates of the points of polygon
        double[] points = { 0.0, 0.0, 0.0, altura, base, altura};

        // create a polygon
        Polygon polygon = new Polygon(points);
        var color = getSelectedColor();
        polygon.setFill(color);
        drawGroup.getChildren().setAll(polygon);
    }

    private Color getSelectedColor() {
        var selectedButton = (RadioButton)colorGroup.getSelectedToggle();
        var color = switch (selectedButton.getText()) {
            case "Red" -> Color.RED;
            case "Green" -> Color.GREEN;
            default -> Color.BLUE;
        };
        return color;
    }
}
