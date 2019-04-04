
package assignment4;
import java.io.*;
import java.util.*;

public class p2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       Scanner scan=new Scanner(System.in);
       int[] intArray=new int[1000];
       int i=0;
       BufferedReader input=new BufferedReader(new FileReader(new File("/Volumes/li-y92/Assignment4/outcome.txt")));
       String strin=input.readLine();
       while(strin!=null && i < 1000){
         intArray[i]= Integer.parseInt(strin);
         i++;
         strin=input.readLine(); 
       }  
        int[] arr=new int[51];
        
        int x = 0; 
        
 
        
        arr[x]=frequency(intArray,arr);
                
        int[] freArray= Arrays.copyOfRange(arr, 1, arr.length);
        char nextstep=0;
        System.out.println(Arrays.toString(freArray));
        System.out.println("Press n to see frequency of a number");
        System.out.println("press c to see frequency of a range of numbers");
        nextstep=scan.next().charAt(0);
        if(nextstep=='n'){
        System.out.println("Which number's frequency you want to know?");
        x=scan.nextInt();
        System.out.println(frequency(intArray,arr));}
        if(nextstep=='c'){
        int firstnum=0;
        int lastnum=0;
        System.out.println("Input first number");
        firstnum=scan.nextInt();
        System.out.println("Input last number");
        lastnum=scan.nextInt();
        System.out.println("");
        System.out.println(checkfrequency(freArray,firstnum,lastnum));
        
        
        }
    }
    static int frequency(int[] intArray,int[] arr){ 
        for (int i=0; i <intArray.length;i++){
        arr[intArray[i]]++;
        } 
        return 0;
    }
    static int checkfrequency(int[] freArray,int firstnum,int lastnum){
       for(int i=-1;i<lastnum-firstnum;i++){
       int number=firstnum+1+i;
       System.out.println("The frequency of "+number+" is:");
       System.out.println(freArray[firstnum+i]);
       }
       return 0;
       
    }
    
}
