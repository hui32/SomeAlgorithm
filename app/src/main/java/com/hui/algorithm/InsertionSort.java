package com.hui.algorithm;

/**
 * 插入排序
 * Created by liuhui on 16/9/12.
 */
public class InsertionSort {
    public String TAG = "插入排序";
    static int orgs[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

    public static void sort(int[] orgs){
        int size = orgs.length;
        for (int i=0;i<size;i++){
            int temp = orgs[i];
            int j = i;
            for (;j>0&&orgs[j-1]>temp;j--){
                orgs[j] = orgs[j-1];
            }
            orgs[j] = temp;
        }

        for(int i=0;i<orgs.length;i++){
            System.out.print(orgs[i]+",");
        }
    }

    public static void main(String[] args){
        sort(orgs);
    }
}
