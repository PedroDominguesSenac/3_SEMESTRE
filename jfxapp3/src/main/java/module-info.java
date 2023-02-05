module br.senac.jfxapp3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens br.senac.jfxapp3 to javafx.fxml;
    exports br.senac.jfxapp3;
}
