package kata5;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame{

private Histogram histogram;
    
public HistogramDisplay(Histogram histogram) {
super("Histograma");
this.histogram = histogram;
this.setContentPane(createPanel());
this.pack();
}

public void execute() {
setVisible(true);
}
private JPanel createPanel() {
ChartPanel chartpanel = new ChartPanel(createChart(createDataSet()));
chartpanel.setPreferredSize(new  Dimension(500,400));
return chartpanel;
}

private JFreeChart createChart(DefaultCategoryDataset dataset) {
    JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChar","Dominios mails",
            "Nº de mails", dataset, PlotOrientation.VERTICAL, false , false,rootPaneCheckingEnabled);
    return chart;
}
private DefaultCategoryDataset createDataSet(){
    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    for(Object key : this.histogram.keySet()){
        dataSet.addValue(this.histogram.get(key), "", key.toString());
    }
    return dataSet;
            
}
}