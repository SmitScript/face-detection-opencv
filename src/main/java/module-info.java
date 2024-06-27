module com.susmit.facedetection {
    requires javafx.controls;
    requires javafx.fxml;
    requires opencv;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.swing;

    opens com.susmit.facedetection to javafx.fxml;
    exports com.susmit.facedetection;
}