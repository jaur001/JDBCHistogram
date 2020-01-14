
package kata5;

import java.util.List;

public class Kata5 {

    
    public static void main(String[] args) {
        List<Person> list = PersonLoader.read();
        for(Person i : list){
            System.out.println(i.getId());
            System.out.println(i.getName());
            System.out.println(i.getLastName());
            System.out.println(i.getDepartment());
        }
        Histogram histogram = PersonHistogramBuilder.build(list,"LASTNAME");
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
