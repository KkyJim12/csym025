module com.csym025.csym025 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.csym025.csym025 to javafx.fxml;
    exports com.csym025.csym025;
}