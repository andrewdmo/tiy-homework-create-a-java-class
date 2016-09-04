/**
 * Created by andrewdmo on 8/4/16.
 */

//class setup:
public class BaseballPlayer {

    //initial properties:
    String name;
    String position;
    int salary;
    boolean chewsTobacco;
    boolean takesSteroids;

    //constructor:
    public BaseballPlayer(String name, String position) {
        this.name = name;
        this.position = position;
        this.salary = 0;
        this.chewsTobacco = false;
        this.takesSteroids = false;
    }

    public String toString() {
        return "\nName: " + this.name + "\nPosition: " + position + "\nSalary: $" + this.salary + "\nChews tobacco?: " + this.chewsTobacco + "\nTakes steroids?: " + this.takesSteroids;
    }

    //method 1:
    public String minorLeaguer() {
        name = "Rookie " + this.name;
        position = "Relief " + this.position;
        salary = 40000;
        this.chewsTobacco = !chewsTobacco;
        this.takesSteroids = false;
        return toString();
    }
    //method2:
    public String calledUp () {
        this.name = "Mr." + name.substring(6);
        this.position = "Starting" + position.substring(6);
        this.salary = salary + 1000000;
        this.chewsTobacco = !chewsTobacco;
        this.takesSteroids = !takesSteroids;
        return toString();
    }

}
        //toString:
//        return ("\n\nName: " + this.name + "\nPosition: " + position + "\nSalary: $" + this.salary + "\nChews tobacco?: " + this.chewsTobacco + "\nTakes steroids?: " + this.takesSteroids);





//    public BaseballPlayer (String name, String position, int salary, boolean chewsTobacco, boolean takesSteroids){
//        this.name = name;
//        this.position = position;
//        this.salary = salary;
//        this.chewsTobacco = chewsTobacco;
//        this.takesSteroids = takesSteroids;

//takesSteroids
//    //toString:
//    public String toString() {
//        return "\n\nName: " + this.name + "\nPosition: " + position + "\nSalary: $" + this.salary + "\nChews tobacco?: " + this.chewsTobacco + "\nTakes steroids?: " + this.takesSteroids;
//    }






