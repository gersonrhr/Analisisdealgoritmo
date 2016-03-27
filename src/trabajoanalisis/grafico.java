package trabajoanalisis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JTable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class grafico {

    public static void main(String[] args) {

//        XYSeries series = new XYSeries("Producto A");
//
//        // Introduccion de datos
//        series.add(1, 1);
//        series.add(2, 6);
//        series.add(3, 3);
//        series.add(4, 10);
//
//        XYSeriesCollection dataset = new XYSeriesCollection();
//        dataset.addSeries(series);
//
//        JFreeChart chart = ChartFactory.createXYLineChart(
//                "Ventas 2014", // Título
//                "Tiempo (x)", // Etiqueta Coordenada X
//                "Cantidad", // Etiqueta Coordenada Y
//                dataset, // Datos
//                PlotOrientation.VERTICAL,
//                true, // Muestra la leyenda de los productos (Producto A)
//                false,
//                false
//        );
//
//        // Mostramos la grafica en pantalla
//        ChartFrame frame = new ChartFrame("Ejemplo Grafica Lineal", chart);
//        frame.pack();
//        frame.setVisible(true);

    }
    
    public void graficar(JTable a){
     XYSeries series = new XYSeries("t/n");
     
        // Introduccion de datos
        int i =0;
        while (a.getValueAt(i, 1)!=null){
            System.out.println(a.getValueAt(i, 1).toString());
            System.out.println(i);
            series.add(Integer.parseInt(a.getValueAt(i, 0).toString()), Integer.parseInt(a.getValueAt(i, 1).toString()));
            System.out.println("Se ha agregado " + Integer.parseInt(a.getValueAt(i, 0).toString()) + " y " +a.getValueAt(i, 1).toString() );
            i++;

        }
//        series.add(1, 1);
//        series.add(2, 6);
//        series.add(3, 3);
//        series.add(4, 10);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Grafica", // Título
                "n", // Etiqueta Coordenada X
                "tiempo", // Etiqueta Coordenada Y
                dataset, // Datos
                PlotOrientation.VERTICAL,
                true, // Muestra la leyenda de los productos (Producto A)
                false,
                false
        );

        // Mostramos la grafica en pantalla
        ChartFrame frame = new ChartFrame("Grafica", chart);
        frame.pack();
        frame.setVisible(true);
    
    }
    

}