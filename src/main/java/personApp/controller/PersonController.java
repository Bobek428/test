package personApp.controller;

import org.springframework.web.bind.annotation.*;
import personApp.model.Person;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/personsController")
public class PersonController {
    List<Person> myPersons = new ArrayList<Person>();

    @RequestMapping(method  = RequestMethod.POST, value = "/addPerson")
    public void addPerson(@RequestBody Person person){
        myPersons.add(person);
    }

    @RequestMapping("/getAllPersons")
    @ResponseBody
    public List<Person> getPerson(){
    return myPersons;
    }




}
