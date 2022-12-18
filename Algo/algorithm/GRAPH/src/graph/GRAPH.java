/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author HP
 */
import java.util.*;
import java.io.*;

public class GRAPH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File s = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\GRAPH\\src\\graph\\t.txt");

        Scanner sc = new Scanner(s);
        // TODO code application logic here
        int i = sc.nextInt();
        int m[][] = new int[i][i];
        while(sc.hasNext()) {
            m[sc.nextInt()][sc.nextInt()] = 1;

        }
        System.out.print("  ");
        for(int c=0;c<i;c++){
            System.out.print(c+" ");
        }
        System.out.println("");
        for (int c = 0; c < i; c++) {
            System.out.print(c+" ");
            for (int d = 0; d < i; d++) {
                if(m[c][d]==1){
                System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }

}
