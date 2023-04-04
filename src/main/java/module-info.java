module minesweeper.minesweeper {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens minesweeper.minesweeper to javafx.fxml;
    exports minesweeper.minesweeper;
}