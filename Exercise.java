
package exercise;

import java.util.Scanner;

class Exercises{
    private String name;
    
    public Exercises(String name){
        this.name = name;
    }
    public String reps(){
        return "Rest";
    }
    public String getName(){
        return name;
    }
}
/**
 *
 * @author Serenna
 */
class PushUps extends Exercises{
       public PushUps(){
           super("Push Ups");
        }
       @Override
       public String reps(){
           return " 10 and repeat 5 times.";
       }
}
class JumpingJacks extends Exercises{
       public JumpingJacks(){
           super("Jumping Jacks");
        }
       @Override
       public String reps(){
           return " 50 and repeat 3 times.";
       }
}
class Squats extends Exercises{
       public Squats(){
           super("Squats");
        }
       @Override
       public String reps(){
           return " 25 and repeat 4 times.";
       }
}
class MountainClimbers extends Exercises{
       public MountainClimbers(){
           super("Mountain Climbers");
        }
       @Override
       public String reps(){
           return " 20 and repeat 4 times.";
       }
}
class JumpRope extends Exercises{
       public JumpRope(){
           super("Jump Rope");
        }
       @Override
       public String reps(){
           return " 15 and repeat 5 times.";
       }
}
class RestDay extends Exercises{
       public RestDay(){
           super("Rest Day");
        }
       
}
public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome what is your name?");
        String userName =  scnr.nextLine();
        System.out.println("Hi " + userName + ", this is what I recommend.\n");
        for(int i=1; i<2; i++){
            Exercises exercises = randomExercises();
            System.out.println("Exercise: " + i + 
                                    " " + exercises.getName() + "\n" +
                                    "Reps required:" + exercises.reps() + "\n");
        }    
    }
    public static Exercises randomExercises(){
        int randomNumber = (int) (Math.random() * 10) +2;
        System.out.println("How many days to do exercise: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new PushUps();
            case 2: 
                return new Squats();
            case 3:
                return new JumpingJacks();
            case 4:
                return new RestDay();
            case 5:
                return new MountainClimbers();
            case 6:
                return new JumpRope();
            default:
                return new Squats();
        } 
    }
    
}

