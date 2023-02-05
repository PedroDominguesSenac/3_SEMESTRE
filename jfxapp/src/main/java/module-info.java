module br.senac.jfxapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.senac.jfxapp to javafx.fxml;
    exports br.senac.jfxapp;
}
