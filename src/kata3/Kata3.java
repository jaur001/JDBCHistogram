
package kata3;

public class Kata3 {

    
    public static void main(String[] args) {
        Histrogram<String> histogram = new Histrogram();
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("google.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        HistogramDisplay hist = new HistogramDisplay(histogram);
        hist.execute();
    }
    
}
