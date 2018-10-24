
package javaapplication16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication16 {

    public static void main(String[] args) {
        
    

    Scanner s=new Scanner (System.in);
    BufferedReader dataIn =new BufferedReader (new InputStreamReader(System.in));
    String name="";
    System.out.println("pleas Enter Yuor Name : ");
    try{
    name= dataIn.readLine();
   }catch(IOException e){
        System.out.println("Error!");
   }
        System.out.println("HELLO WORD");
    String nama;
        System.out.println("masukan nama anda : ");
    nama = s.nextLine();
    
        System.out.println("HELLO WORLD @"+nama);
}
}
