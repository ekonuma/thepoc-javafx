module com.ekonuma.thepocjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.ekonuma.thepocjavafx to javafx.fxml;
    exports com.ekonuma.thepocjavafx;
}