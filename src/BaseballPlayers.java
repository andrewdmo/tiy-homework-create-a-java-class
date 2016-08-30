/**
 * Created by andrewdmo on 8/4/16.
 */

//class setup:
public class BaseballPlayers {

    //initial properties:
    String name;
    String position;
    int salary;
    boolean chewsTobacco;
    boolean takesSteroids;

    //toString:
    public String toString() {
        return "\n\nName: " + this.name + "\nPosition: " + position + "\nSalary: $" + this.salary + "\nChews tobacco?: " + this.chewsTobacco + "\nTakes steroids?: " + this.takesSteroids;
    }

    //method1:
    public void minorProfile(String name, String position, int salary) {

        //constructor:
        this.name = name;
        this.position = position;
        this.salary = 40000;
        this.chewsTobacco = false;
        this.takesSteroids = false;
    }

    //method2:
    public void calledUp(BaseballPlayers baseballPlayer) {

        this.name = "Mr. " + name;
        this.position = "Relief " + Character.toLowerCase(position.charAt(0)) +
            (position.length() > 1 ? position.substring(1) : "");
        this.salary = salary + 1000000;
        this.chewsTobacco = !chewsTobacco;
        this.takesSteroids = !takesSteroids;
    }
}
