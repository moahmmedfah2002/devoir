module com.ensa.devoir {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.persistence;
    requires static lombok;
    requires spring.data.jpa;
    requires spring.context;
    requires spring.beans;

    opens com.ensa.devoir to javafx.fxml;
    exports com.ensa.devoir;
}