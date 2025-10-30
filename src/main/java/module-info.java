module processjob.atm_simulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens processjob.atm_simulator to javafx.fxml;
    exports processjob.atm_simulator;
}