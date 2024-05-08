/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfreechart;

import java.io.File;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Rita
 */
public class JPEG_Image_Pie {
    
    public static void main(String [] args)throws Exception{
    DefaultPieDataset dataset = new DefaultPieDataset();
    dataset.setValue("IPhone 5s", new Double(20));
    dataset.setValue("Samsung", new Double(20));
    dataset.setValue("Micromax", new Double(20));
    dataset.setValue("Redmi", new Double(20));
    dataset.setValue("Moto", new Double(20));
    
    JFreeChart chart = ChartFactory.createPieChart("Mobile Sale", dataset, true, true, false);
    int width = 640; /* Width of the image */
    int height = 480; /* Height of the image */
    File pieChart = new File( "PieChart.jpeg" );
    ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height);
    }
}
