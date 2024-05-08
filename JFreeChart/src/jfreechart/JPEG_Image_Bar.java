/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfreechart;

import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Rita
 */
public class JPEG_Image_Bar {
    public static void main(String [] args) throws IOException{
    final String fiat = "FIAT";
final String audi ="AUDI";
final String ford = "FORD";
final String speed = "SPEED";
final String millage ="MILLAGE";
final String userrating ="USER RATING";
final String safety = "SAFETY";
final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

dataset.addValue(1.0 , fiat,speed);
dataset.addValue(3.0, fiat, userrating);
dataset.addValue(5.0,fiat,millage);
dataset.addValue(5.0,fiat,safety);

dataset.addValue(5.0 , audi,speed);
dataset.addValue(6.0, audi, userrating);
dataset.addValue(10.0,audi,millage);
dataset.addValue(4.0,audi,safety);

dataset.addValue(4.0 , ford,speed);
dataset.addValue(2.0, ford, userrating);
dataset.addValue(3.0,ford,millage);
dataset.addValue(6.0,ford,safety);

JFreeChart barChart = ChartFactory.createBarChart("CAR USAGE STATISTICS", "Category", "Score", dataset,PlotOrientation.VERTICAL,true,true,false);

int width = 640;
int height = 480;

File BarChart = new File("Bar Chart.jpeg");
ChartUtilities.saveChartAsJPEG(BarChart, barChart, width, height);
    }
    
}
