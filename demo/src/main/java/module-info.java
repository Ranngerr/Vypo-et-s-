module cz.prudiksps.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.prudiksps.demo to javafx.fxml;
    exports cz.prudiksps.demo;
}