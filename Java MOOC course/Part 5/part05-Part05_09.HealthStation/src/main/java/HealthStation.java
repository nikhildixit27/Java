
public class HealthStation {

    private int count;
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.count++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.feed();
    }
    
    public int weighings(){
        return this.count;
    }
}
