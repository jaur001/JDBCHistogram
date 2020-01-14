/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

/**
 *
 * @author USUARIO
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonLoader {
    public static List<Person> read(){
        List<Person> lista = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:Prueba.db");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM PEOPLE");
            while(rs.next()) {
                Integer id = rs.getInt(1);
                String name = rs.getString(2);
                String lastName = rs.getString(3);
                String department = rs.getString(4);

                lista.add(new Person(id, name, lastName, department));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
            if (connection != null) {
            connection.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
} 
        
        return lista;
    }
}
