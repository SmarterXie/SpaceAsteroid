package com.comp2059.app.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

/**
 * This class is to load end game interface.
 * @author Jiafang Sun
 * @version 1.0
 * @since  18 November 2022
 */
public class EndGameStage {
    public static void load(Stage stage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(EndGameStage.class.getResource("/com/comp2059/app/fxml/EndGameView.fxml")));
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
