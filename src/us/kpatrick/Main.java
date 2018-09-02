package us.kpatrick;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *This class is the main program
 *@author kpatr author
 *@version 1.0.0 revision
 */
public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    /**
     * Main program start point
     * @param args base arguments getting loaded
     */
    public static void main(String[] args) {

        ArrayList<Talkable> zoo = new ArrayList<>();

        //Lines to Replace
        zoo.add(addDog());
        zoo.add(addCat());
        zoo.add(addStudent());
        //zoo.add(new Dog(true, "Pete"));
        //zoo.add(new Cat(9, "Anne Belly"));
        //zoo.add(new Student(19, "Joe John Johnson"));
        //End Lines to Replace

        for (Talkable thing: zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    /**
     * This method will add a new instance of a CAT
     * @return This returns a new instance of a CAT
     */
    public static Cat addCat()  {
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
    public static Dog addDog() {
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
    public static Student addStudent()  {
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


    /**
     * This method shows what the person says
     * @author kpatr
     * @param p a talkable object
     */
    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }
}
