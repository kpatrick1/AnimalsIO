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
        AnimalsIO io = new AnimalsIO();

        //Lines to Replace
        zoo.add(io.addDog());
        zoo.add(io.addCat());
        zoo.add(io.addStudent());
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
