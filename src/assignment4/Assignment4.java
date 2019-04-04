package assignment4;
import java.util.Random;
import java.io.*;


public class Assignment4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outcome.txt")));
    for(int i=0;i<1000;i++){
    Random rand=new Random();    
    fout.println(rand.nextInt(50)+1);
    }
    fout.close();
    }
}