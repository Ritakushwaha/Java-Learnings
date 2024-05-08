/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfreechart;

/**
 *
 * @author Rita
 */
import java.io.*;
import java.util.StringTokenizer;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
public class ChartGenerationBasedOnFile {
    public static void main( String[ ] args )throws Exception
{
String mobilebrands[ ] = {
"IPhone 5s" ,
"SamSung Grand" ,
"MotoG" ,
"Nokia Lumia"
};
InputStream in = new FileInputStream( new File( "C:/temp/test.txt" ) );
BufferedReader reader = new BufferedReader(new InputStreamReader(in ) );
StringBuilder out = new StringBuilder();
String line;
DefaultPieDataset dataset = new DefaultPieDataset();
while (( line = reader.readLine() ) != null )
{
out.append( line );
}
StringTokenizer s = new StringTokenizer( out.toString(), "," );
int i=0;
while( s.hasMoreTokens( ) && ( mobilebrands [i] != null ) )
{
dataset.setValue(mobilebrands[i], Double.parseDouble(s.nextToken() ));
i++;
}
JFreeChart chart = ChartFactory.createPieChart(
"Mobile Sales", // chart title
dataset, // data
true, // include legend
true,
false);
int width = 560; /* Width of the image */
int height = 370; /* Height of the image */
File pieChart = new File( "pie_Chart.jpeg" );
ChartUtilities.saveChartAsJPEG( pieChart, chart, width, height);
}
}
