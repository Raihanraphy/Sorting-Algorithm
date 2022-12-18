/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmanproject;

/**
 *
 * @author HP
 */
import java.io.*;
import java.util.Random;
public class createFile {
    public static void method(){
    File f=new File("D:\\7GB.txt");
    //String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //int length=s.length();
        try {
            System.out.println(f.createNewFile());
            
            Random random=new Random();
            FileWriter w=new FileWriter(f);
            for (int g = 0; g < 1; g++) {
                for(int m=0; m < 1073741824; m++){
                    //String s=""+(char)random.nextInt(90);
                            w.write(""+(char)random.nextInt(128));
                            
                
                }
                
            }
            w.flush();
            w.close();
        } catch (Exception e) {
        }
        
               
        
        
    
    }
}

