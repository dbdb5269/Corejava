package com.ch04;

/**
 * Created by dubo on 16/9/21.
 */
public class Sort {
    public void sort(int[] a) {
        int temp = 0;
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    //选择排序
    public void selectSort(int [] a) {
        int n = a.length;
        for(int k=0; k<n-1; k++) {
            int min = k;
            for(int i=k+1; i<n; i++) {
                if(a[i] < a[min]) {
                    min = i;
                }
            }
            if(k != min) {
                int temp = a[k];
                a[k] = a[min];
                a[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Sort bubblesort = new Sort();
        int a[] = {21, 32, 45, 12, 98, 70, 65, 36, 46, 11};
        bubblesort.sort(a);
        for (int k = 0; k < 10; k++) {
            System.out.print(a[k]+" ");

        }
        System.out.println();
        int a2[] = {21, 32, 45, 12, 98, 70, 65, 36, 46, 111};
        bubblesort.selectSort(a2);
        for (int k = 0; k < 10; k++) {
            System.out.print(a2[k]+" ");

        }

    }

}
