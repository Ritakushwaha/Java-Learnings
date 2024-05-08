/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfreechart;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import static org.jfree.chart.demo.PieChartDemo1.createDemoPanel;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Rita
 */
public class PieChart_AWT extends ApplicationFrame {
    
    public PieChart_AWT(String title) {
        super(title);
        setContentPane(createDemoPanel());
    }
    
    public static PieDataset createDataset(){
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("IPhone 5s",new Double(20));
        dataset.setValue("Samsung",new Double(20));
        dataset.setValue("Micromax",new Double(40));
        dataset.setValue("Redmi",new Double(10));
        dataset.setValue("Gionee",new Double(10));
        return dataset;
        
    }
    
    private static JFreeChart createChart (PieDataset dataset){
    JFreeChart chart = ChartFactory.createPieChart("Mobile Sale",dataset,true,true, false );
    return chart;
    }
    
    public static JPanel createDemoPanel(){
    JFreeChart chart = createChart(createDataset());
    return new ChartPanel(chart);
    }
    
    public static void main(String [] args){
        PieChart_AWT demo = new PieChart_AWT("Mobile Sale");
        demo.setSize(560,367);
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }
}
