package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class CityController {
    public void initData(Constants.Event eventIndex){
        String[] data = HISTORICAL_DATA[eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
    }
}
