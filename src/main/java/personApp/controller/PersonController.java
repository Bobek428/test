package personApp.controller;

import personApp.model.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/personsController")
public class PersonController {
    List<Person> myPersons = new ArrayList<Person>();

    @RequestMapping("/add/{imie}/{nazwisko}/{wiek}")
    public void addPerson(@PathVariable("imie") String imie, @PathVariable("nazwisko") String nazwisko, @PathVariable("wiek") Long wiek){
        Person person = new Person(imie, nazwisko, wiek);
        myPersons.add(person);
    }

    @RequestMapping("/getAllPersons")
    @ResponseBody
    public List<Person> getPerson(){
    return myPersons;
    }


}
