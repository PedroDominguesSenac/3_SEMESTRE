module br.senac.jfxapp2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens br.senac.jfxapp2 to javafx.fxml;
    exports br.senac.jfxapp2;
}
