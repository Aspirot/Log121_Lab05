module etsmtl.log.lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens etsmtl.log121.lab05 to javafx.fxml;
    exports etsmtl.log121.lab05;
}