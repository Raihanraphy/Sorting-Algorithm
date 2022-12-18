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
public class Node {
    int ascii;
    int capacity;
    String code="";
    Node left, right, parent;
    
    public Node (int a){
        ascii=a;
        capacity=0;
        left=null;
        right=null;
        parent=null;
    }
}
