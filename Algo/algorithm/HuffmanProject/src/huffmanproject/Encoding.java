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
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Encoding {
    public static void method(){
        try {
            FileReader f=new FileReader("C:\\Users\\HP\\Documents\\NetBeansProjects\\HuffmanProject\\src\\huffmanproject\\text.txt-/");
            BufferedReader br=new BufferedReader(f);
            Node [] freq=new Node [128];
            for (int i = 0; i < freq.length; i++) {
                freq[i]=new Node(i);
                
            }
            int v;
            while((v=br.read())!=-1){
                freq[v].capacity++;
            }
//            for (int i = 97; i < 123; i++) {
//                System.out.println(freq[i].capacity);
//                
//            }
            
            //freq=NodeMergeSort.MergeSort(freq);
            
            for (int i = 120; i < 128; i++) {
                System.out.print(freq[i].capacity+"\t");
            }
            System.out.println();
            
            //this priority queue make the priority upon the
            //capacity variable; add the latest node after the previous nodes
            PriorityQueue <Node> pq= new PriorityQueue <> (128, new NodeComparator());
            for (int i = 0; i < freq.length; i++) {
                if(freq[i].capacity!=0){
                    pq.add(freq[i]);
                }
            }
                    
//            for (int i = 0; i < 20; i++) {
//
//                Node x=new Node(-1);
//                x.capacity=2;
//                pq.add(x);
//            }
            
//            while(pq.isEmpty()!=true){
//                Node t=pq.peek();
//                pq.poll();
//                System.out.println(t.capacity+"\t"+t.ascii);            
//            }
                    
                    
            //System.out.println(pq.peek().capacity);
            Node root=null;
            for(;;) {
                if(pq.size()==1){
                    break;
                }
                Node l=pq.poll();
                Node r = pq.poll();    
                Node p=new Node(-1);        
                
                //zero for left
                //one for right
                p.left=l;
                //l.code="0"+l.code;
                p.right=r;
                //r.code="1"+r.code;
                //r.parent=p;
                //l.parent=p;
                p.capacity=l.capacity+r.capacity;
                root=p;
                pq.add(p);    
            }
            
            //pr(root);
            for(Node i=root;i!=null;i=i.left){
                System.out.println(i.capacity);
            }
            
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(q.size()!=0){
                Node o=q.poll();
                if(o.left==null && o.right==null){
                    //freq[o.ascii].code=o.code;
                }
                else{
                    o.left.code=o.code+0;
                    q.add(o.left);
                    o.right.code=o.code+1;
                    q.add(o.right);
                }
            }
            
            pr(root);
            
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int i = 97; i < 123; i++) {
                System.out.println(freq[i].capacity+"\t"+freq[i].ascii+"\t"+freq[i].code);
            }
            
            
        


    } catch (Exception e) {
            }
    
    }
    
    public static void pr(Node root){
        if(root.left==null && root.right==null){
            System.out.println(root.capacity+"\t"+root.ascii+"\t"+root.code);
            return;
        }
      
        System.out.println(root.capacity+"\t"+root.ascii+"\t"+root.code);
    
        pr(root.left);
        pr(root.right);
    }    
}

