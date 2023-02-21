module eus.ehu.eivg.triangulomvcjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens eus.ehu.eivg.triangulomvcjavafx to javafx.fxml;
    opens eus.ehu.eivg.triangulomvcjavafx.controller to javafx.fxml;
    exports eus.ehu.eivg.triangulomvcjavafx;
}
