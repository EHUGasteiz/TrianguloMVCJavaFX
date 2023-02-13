package eus.ehu.eivg.triangulomvcjavafx;

import eus.ehu.eivg.triangulomvcjavafx.views.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class TrianguloMVCApplication extends Application {
    public static void main(String[] args) {
       launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory.mostrarVistaTrianguloTexto();
        ViewFactory.mostrarVistaTrianguloGrafico();
        ViewFactory.mostrarVistaTrianguloCompleta();
    }
}
