package cz.prudiksps.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {

    @FXML
    private Label lblS1;

    @FXML
    private Label lblS2;

    @FXML
    private Label lblS3;

    @FXML
    private Label lblS4;

    @FXML
    private TextArea txtIP1;

    @FXML
    private TextArea txtIP2;

    @FXML
    private TextArea txtIP3;

    @FXML
    private TextArea txtIP4;

    @FXML
    private TextArea txtM1;

    @FXML
    private TextArea txtM2;

    @FXML
    private TextArea txtM3;

    @FXML
    private TextArea txtM4;

    @FXML
    void onBtnVypocti(ActionEvent event) {
        int ip1, ip2, ip3, ip4, m1, m2, m3, m4, s1, s2, s3, s4;

        ip1 = Integer.parseInt(txtIP1.getText());
        ip2 = Integer.parseInt(txtIP2.getText());
        ip3 = Integer.parseInt(txtIP3.getText());
        ip4 = Integer.parseInt(txtIP4.getText());

        m1 = Integer.parseInt(txtM1.getText());
        m2 = Integer.parseInt(txtM2.getText());
        m3 = Integer.parseInt(txtM3.getText());
        m4 = Integer.parseInt(txtM4.getText());

        s1 = ip1 & m1;
        s2 = ip2 & m2;
        s3 = ip3 & m3;
        s4 = ip4 & m4;

        lblS1.setText(String.valueOf(s1));
        lblS2.setText(String.valueOf(s2));
        lblS3.setText(String.valueOf(s3));
        lblS4.setText(String.valueOf(s4));
    }

}