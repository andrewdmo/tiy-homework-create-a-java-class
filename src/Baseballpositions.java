/**
 * Created by andrewdmo on 8/4/16.
 */

//class setup:
public class Baseballpositions {
    String name;
    String position;
    int salary;
    boolean minorleague;
    boolean chewstobacco;

    //method1:
    public Baseballpositions(String name, String position, int salary, boolean minorleague, boolean chewstobacco) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.minorleague = minorleague;
        this.chewstobacco = chewstobacco;
    }
    //method2:
    public int salaryplussigningbonus() {
        return this.salary + 10000;
    }

    //method3:
    public boolean publicknows() {
        boolean publicknowledge = !chewstobacco;
        return publicknowledge;
    }

    //method4:
    //public String alterboolean() {
     //   if (minorleague  == true)
     //       return "Yes";
     //   if (publicknowledge == true)

      //  }
      //  else {return "No";
     //   }
    //}

    @Override
    public String toString() {
        String a =  "Name: " + name + "\nPosition: " + position + "\nSalary (plus signing bonus): $" + salary + " ($" + salaryplussigningbonus() + ")" + "\nPlayed in the minors? " + minorleague + "\nChews tobacco? "+ chewstobacco;
        return a;
    }
}