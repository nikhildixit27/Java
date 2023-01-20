/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person givePerson = this.persons.get(0);
        
        for(Person person : persons){
            if(givePerson.getHeight()> person.getHeight()){
                givePerson = person;
            }
        }
        return givePerson;
    }
    
    public Person take(){
        if(this.isEmpty()){
            return null;
        }
        Person takePerson = this.persons.get(0);
        for(Person person : persons){
            if(takePerson.getHeight()> person.getHeight()){
                takePerson = person;
            }
        }
        this.persons.remove(takePerson);
        return takePerson;
    }
}
