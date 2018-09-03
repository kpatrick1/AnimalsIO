package us.kpatrick;
/**
 * This class is used to add a Cat Dog or Student
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnimalsIO {

    /**
     * Add a Cat Object
     * @return Cat Object
     */
    public Cat addCat()  {
        System.out.print("Enter your Cat's Name: ");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        String name = "";
        Integer mouseskilled = 0;
        try {
            name = in.readLine();
        } catch (Exception e) {
            System.out.println("Characters are required for the name");
        }

        System.out.println("Enter mice killed: ");
        try {
            mouseskilled = Integer.parseInt(in.readLine());
        } catch (Exception e) {
            System.out.println("Integer is required");
        }
        return new Cat(mouseskilled, name);
    }

    /**
     * This method will add a new instance of a Dog
     * @return This returns a new instance of a Dog
     */
    public Dog addDog() {
        System.out.print("Enter your Dog's Name: ");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        String name = "";
        Boolean friendly = false;
        try {
            name = in.readLine();
        } catch (Exception e){
            System.out.println("Characters are required for the name");
        }

        System.out.println("Is Dog Friendly (True/False): ");
        try{
            friendly = Boolean.parseBoolean(in.readLine());
        } catch (Exception e){
            System.out.println("True or False is Required for Friendly Status");
        }
        return new Dog(friendly, name);
    }

    /**
     * This method will add a new instance of a student
     * @return This returns a new instance of a Student
     */
    public Student addStudent()  {
        System.out.print("Enter your Student's Name: ");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        String name = "";
        Integer age = 0;
        try {
            name = in.readLine();
        }catch (Exception e) {
            System.out.println("Characters are required for the name.");
        }
        System.out.println("What is the students age: ");
        try {
            age = Integer.parseInt(in.readLine());
        } catch (Exception e) {
            System.out.println("Integers are required for age");
        }

        return new Student(age, name);
    }
}
