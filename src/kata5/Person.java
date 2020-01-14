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
public class Person {
    
    private final Integer id;
    private final String name;
    private final String lastName;
    private final String department;

    public Person(Integer id, String name, String lastName, String departament) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.department = departament;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    
}
