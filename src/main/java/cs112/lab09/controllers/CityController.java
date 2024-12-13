package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class CityController {
    @FXML
    ImageView imageView;
    @FXML
    Label locationLabel;
    @FXML
    Label dateLabel;
    @FXML
    Label descriptionLabel;
    @FXML
    Label revisedDescriptionLabel;
    @FXML
    Hyperlink hyperlinkLabel;

    public void handleCloseButton(){

        Stage stage = (Stage)imageView.getScene().getWindow();
        stage.close();
        
    }

    public void initData(Constants.Event eventIndex){
        String[] data = Constants.HISTORICAL_DATA[eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
        imageView.setImage(event.getImage());
        locationLabel.setText(event.getLocation());
        dateLabel.setText(event.getEventDay().toString());
        descriptionLabel.setText(event.getDescription());
        revisedDescriptionLabel.setText(event.getRevisedDescription());
        hyperlinkLabel.setText(event.getCitation());


    }

}
