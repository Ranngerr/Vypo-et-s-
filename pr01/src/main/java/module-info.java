module cz.cernysps.pr01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.cernysps.pr01 to javafx.fxml;
    exports cz.cernysps.pr01;
}