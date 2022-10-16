module com.mycompany.projectth01 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projectth01 to javafx.fxml;
    exports com.mycompany.projectth01;
}
