module org.example.javamonitoringclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javamonitoringclient to javafx.fxml;
    exports org.example.javamonitoringclient;
}