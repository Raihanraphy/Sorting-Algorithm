/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmanproject;
import java.util.Comparator;
/**
 *
 * @author HP
 */
public class NodeComparator implements Comparator<Node> {
    public int compare(Node n1, Node n2) { 
        return n1.capacity-n2.capacity;
    }
}

