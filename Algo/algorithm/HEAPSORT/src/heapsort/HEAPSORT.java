/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

/**
 *
 * @author HP
 */
public class HEAPSORT {

    public static void main(String[] args) {
        int a[]={12,54,2,34,125,34,67,99,123,678};
        sort(a,0,a.length);
        for(int c=0;c<a.length;c++){
            System.out.print(a[c]+" ");
        }
    }
    public static void sort(int a[],int m,int n){
        //rearrange to heapify
        for(int r=(n/2)-1;r>=0;r--){
            heapify(a,r,n);
        }
        for(int c=n-1;c>=0;c--){
            int temp=a[0];
            a[0]=a[c];
            a[c]=temp;
            heapify(a,0,c);
        }
    }
    public static void heapify(int a[],int m,int n){
        int largest = m;
        int l=2*m+1;
        int r=2*m+2;
        if(r<n){
            if(a[largest]<a[r]){
            largest= r;
            }
        }
        if(l<n){
            if(a[largest]<a[l]){
            largest= l;
            }
        }
        if(largest!=m){
            int temp=a[m];
            a[m]=a[largest];
         
            a[largest]=temp;
            heapify(a,largest,n);
        }
    } 
    
}