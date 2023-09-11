package com.plugindemo;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;


public class ViewNodeDemo {

    public AnchorPane getView() {
        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
            JFXTextArea in = (JFXTextArea) anchorPane.lookup("#in");
            JFXTextArea out = (JFXTextArea) anchorPane.lookup("#out");
            JFXButton jfxButton = (JFXButton) anchorPane.lookup("#run");
            jfxButton.setOnAction(event -> {
                out.setText(in.getText());
            });

        }catch (Exception e){
            e.printStackTrace();
        }

        return anchorPane;
    }

}
