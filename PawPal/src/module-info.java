/**
 * 
 */
/**
 * 
 */
module PawPal {
	requires javafx.controls;
    requires javafx.fxml;
	requires org.junit.jupiter.api;

    opens pawpall.main to javafx.fxml;
    exports pawpall.main;
}