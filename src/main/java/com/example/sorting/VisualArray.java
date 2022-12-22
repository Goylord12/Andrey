package com.example.sorting;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.text.Text;
import javafx.util.Duration;

import javax.swing.*;

public class VisualArray {
    public static Float[] arrayFirst;
    private String first;
    private String second;
    private BubbleSort bubbleSort;
    private Sort sort;
    public static boolean isSorted = true;

    @FXML
    private Text firstArray;

    @FXML
    private Button start;

    @FXML
    private Label middleArray;

    @FXML
    private Label resultArray;

    @FXML
    public Text secondArray;

    @FXML
    private Label sourceArray;

    @FXML
    private Text thirdArray;

    @FXML
    void onStart(ActionEvent event)throws InterruptedException  {
        Sort.setVisualArray(this);
        firstArray.setText(MainWindow.firstTextArray);
        thirdArray.setText(MainWindow.visualArray);
        sort = new Sort();
        isSorted = true;
        MainWindow.createArray = new CreateArray(firstArray.getText());
        Sort.stringArray = "";
//        while(isSorted){
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1
            ), time-> {
                if(MainWindow.orientationFirst){
                    sort.InsertionSortVisual(MainWindow.createArray.getArray());
                }
                if(MainWindow.orientationSecond){
                    sort.BubbleSortVisual(MainWindow.createArray.getArray());
                }


                    }));
            timeline.playFromStart();
//        }
    }
}
