package com.hui.algorithm;

/**
 * 快速排序法
 * Created by liuhui on 16/9/12.
 */
public class QuickSort {
    public String TAG = "快速排序";
    static int orgs[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

    public static void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）
            int temp; // 记录临时中间值
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end))
                    i++;
                while ((numbers[j] > base) && (j > start))
                    j--;
                if (i <= j) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j)
                quickSort(numbers, start, j);
            if (end > i)
                quickSort(numbers, i, end);
        }
    }
    public static void main(String[] args){
        quickSort(orgs,0,orgs.length-1);
        for(int i=0;i<orgs.length;i++){
            System.out.print(orgs[i]+",");
        }
    }

}
