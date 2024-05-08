/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Rita
 */
public class PieChartSample extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Group());
        stage.setTitle("Fruits");
        stage.setWidth(500);
        stage.setHeight(500);
        
        ObservableList <PieChart.Data> pieChartData=FXCollections.observableArrayList(
         new PieChart.Data("Grape", 13),
         new PieChart.Data("Apple", 25),
         new PieChart.Data("Plums", 10),
         new PieChart.Data("Pine-Apple", 22),
         new PieChart.Data("Orange", 30));
        
        PieChart chart = new PieChart (pieChartData);
        chart.setTitle("Imported Fruits");
        
        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
        
        Label label = new Label();
        
        for (PieChart.Data data : chart.getData()) {
        data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,new EventHandler<MouseEvent>() {

        @Override public void handle(MouseEvent e) {
    
            label.setTranslateX(e.getSceneX());
            label.setTranslateY(e.getSceneY());
            label.setText(String.valueOf(data.getPieValue()) + "%");
            System.out.println(data.getPieValue());

        }
});
}
        }
    
    public static void main(String [ ] args){
    launch(args);
    }
}
