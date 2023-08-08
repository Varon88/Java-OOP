// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
public class Serialization {
    public static void main(String[] args) {
        //declaration of an object
        Emp e1 = new Emp();
        e1.emloyeeNumber = "09876";
        e1.employeeName = "jeff";

        try {
            FileOutputStream fileOut =new FileOutputStream("Users\\varonrasiah\\Desktop\\new.txt"); //writes to the file using variable fileout
            ObjectOutputStream o1 = new ObjectOutputStream(fileOut); //specifies the location of serialization through the object o1
            o1.writeObject(e1); //the method serializes the object and writes it on to fileout
            o1.close(); // following lines close the respective write based methodes
            fileOut.close();
            System.out.println("serialized data successfully stored.");

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
