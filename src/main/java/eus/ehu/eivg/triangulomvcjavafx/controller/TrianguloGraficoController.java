package eus.ehu.eivg.triangulomvcjavafx.controller;

import eus.ehu.eivg.triangulomvcjavafx.model.TrianguloRectangulo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import java.net.URL;
import java.util.ResourceBundle;

public class TrianguloGraficoController implements Initializable {

    private final TrianguloRectangulo model = TrianguloRectangulo.getTrianguloRectangulo();
    @FXML
    private Group drawGroup;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO: aplicar el MVC para que muestre el triángulo de manera adecuada
    }

    private void repintar() {
        double base = model.getBase().doubleValue();
        double altura = model.getAltura().doubleValue();

        // coordinates of the points of polygon
        double[] points = { 0.0, 0.0, 0.0, altura, base, altura};

        // create a polygon
        Polygon polygon = new Polygon(points);
        polygon.setFill(Color.BLUE);
        drawGroup.getChildren().setAll(polygon);
    }
}
