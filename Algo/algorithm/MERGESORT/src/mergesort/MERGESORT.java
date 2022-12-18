/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author HP
 */
public class MERGESORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int a[] = {12, 456, 34, 11, 56, 45, 2};
        sort(a, 0, a.length - 1);
        for (int c = 0; c < a.length; c++) {
            System.out.print(a[c] + " ");
        }
        System.out.println("Time taken : " + (System.currentTimeMillis() - startTime) + " millisecond(s).");
    }

    public static void sort(int a[], int L, int R) {
        if (L < R) {
            int M = (L + R) / 2;
            sort(a, L, M);
            sort(a, M + 1, R);
            merge(a, L, M, R);
        }
    }

    public static void merge(int a[], int L, int M, int R) {
        int leftsize = M - L + 1;
        int rightsize = R - M;
        int left[] = new int[leftsize];
        int right[] = new int[rightsize];
        for (int c = 0; c < leftsize; c++) {
            left[c] = a[c + L];
        }
        for (int c = 0; c < rightsize; c++) {
            right[c] = a[c + M + 1];
        }
        int i = 0, j = 0, k = L;
        while (i < leftsize && j < rightsize) {
            if (left[i] < right[j]) {
                a[k] = left[i++];
            } else {
                a[k] = right[j++];
            }
            k++;
        }
        while (i < leftsize) {
            a[k] = left[i++];
            k++;
        }
        while (j < rightsize) {
            a[k] = right[j++];
            k++;
        }
    }

}
