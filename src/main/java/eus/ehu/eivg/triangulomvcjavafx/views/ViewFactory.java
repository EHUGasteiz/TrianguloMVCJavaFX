package eus.ehu.eivg.triangulomvcjavafx.views;

import eus.ehu.eivg.triangulomvcjavafx.TrianguloMVCApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {
    public static void mostrarVistaTrianguloTexto() throws IOException {
        mostrarVentanaMVC("views/VistaTrianguloTexto.fxml", "Vista Triangulo Texto", 0, 0);
    }

    public static void mostrarVistaTrianguloGrafico() throws IOException {
        mostrarVentanaMVC("views/VistaTrianguloGrafico.fxml", "Vista Triangulo Gráfico", 0, 300);
    }

    public static void mostrarVistaTrianguloCompleta() throws IOException {
        mostrarVentanaMVC("views/VistaTrianguloCompleta.fxml", "Vista Triangulo Completa", 650, 0);
    }



    private static void mostrarVentanaMVC(String vista, String titulo, int xPos, int yPos) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TrianguloMVCApplication.class.getResource(vista));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setOnCloseRequest(e -> System.exit(0));
        stage.setTitle(titulo);
        stage.setX(xPos);
        stage.setY(yPos);
        stage.show();
    }

}
