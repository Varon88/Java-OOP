import java.io.*;
public class Deserialization{
    //used to indicate the possible exceptions (throw function).
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Emp e2 = null;

        try{
            FileInputStream f1 = new FileInputStream("Users\\varonrasiah\\Desktop\\new.txt"); //reads file contents to f1
            ObjectInputStream o2 = new ObjectInputStream(f1); //instantiates object o2 based on the contents of f1
            e2 = (Emp) o2.readObject(); //deserialization of the contents of f1
            o2.close();
            f1.close();

        }
        finally {
            System.out.println(e2.emloyeeNumber);
            System.out.println(e2.employeeName);
        }

    }

}
