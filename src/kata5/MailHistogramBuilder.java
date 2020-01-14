/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram<>();
        
        for (Mail mail : mailList){
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }
    
}
