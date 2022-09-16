package FormacionBackend6.Controladores.Controllers;

import FormacionBackend6.Controladores.Persons.Person;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller1 {

    @GetMapping("user/{name}")
    public String user(@PathVariable String name) {

        return "Hola " + name;
    }

    @PostMapping("useradd")
    public Person useradd(@RequestBody Person p) {

        p.setAge(p.getAge() +1);

        return p;
    }

}
