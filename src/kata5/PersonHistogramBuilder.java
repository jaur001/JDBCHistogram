/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.util.List;

/**
 *
 * @author USUARIO
 */
public class PersonHistogramBuilder {
    
    public static Histogram<String> build(List<Person> personList,String parameter) {
        Histogram<String> histogram = new Histogram<>();
        
        for (Person person : personList){
            if(parameter.toLowerCase().equals("name")){
                histogram.increment(person.getName());
            } else {
               histogram.increment(parameter.toLowerCase().equals("lastname")?person.getLastName():person.getDepartment());
            }
            
            
        }
        
        return histogram;
    }
}
