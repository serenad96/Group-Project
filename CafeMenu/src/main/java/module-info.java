module com.mycompany.cafemenu {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cafemenu to javafx.fxml;
    exports com.mycompany.cafemenu;
}
