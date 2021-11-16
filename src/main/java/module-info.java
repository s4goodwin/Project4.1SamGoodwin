module bsu.comp152.project4_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens bsu.comp152.project4_1 to javafx.fxml;
    exports bsu.comp152.project4_1;
}