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
public class NodeMergeSort {
    public static Node [] MergeSort (Node [] a){
        if(a.length==1)
            return a;
        int mid=a.length/2;
        
        Node [] newL=new Node[mid];
        Node [] newR=new Node[a.length-mid];
        
        for(int i=0;i<a.length;i++){
            if(i<mid)
                newL[i]=a[i];
            else
                newR[i-mid]=a[i];
        }
        
        newL=MergeSort(newL);
        newR=MergeSort(newR);
        
        return Merge(newL,newR);       
    }
    

    
    private static Node [] Merge (Node [] a, Node[] b){
        Node [] nArr=new Node [a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i].capacity>b[j].capacity){
                nArr[k]=b[j];
                j++;
                k++;
            }
            
            else{
                nArr[k]=a[i];
                i++;
                k++;
            }
        }
        while(i<a.length){
            nArr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            nArr[k]=b[j];
            j++;
            k++;
        }
        return nArr;
    }
}

