package FormacionBackend6.Controladores.Persons;

import lombok.Data;

@Data
public class Person {

    private String name,
            city;

    private int age;

    //Constructores, uno  con parametros y otro vacio
    public Person( String name, String city, int age){

        this.name = name;
        this.city = city;
        this.age = age;
    }

    public Person(){

    }
}
