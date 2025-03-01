package com.comp2059.app.view;

import com.comp2059.app.controller.SecondStageController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * This class is to load second interface.
 * @author Yuening Xie
 * @version 1.0
 * @since  15 November 2022
 */
public class SecondStage {
    public static void load(Stage stage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(SecondStage.class.getResource("/com/comp2059/app/fxml/SecondStageView.fxml")));
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
