module com.mycompany.exemplotelas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.exemplotelas to javafx.fxml;
    exports com.mycompany.exemplotelas;
}
