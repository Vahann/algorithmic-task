package com.company.sortingArray;

public class SortedArray {

    public static int solution(int[] statues) {
        int min;
        int temp;
        int count=0;

        for(int i=0; i<statues.length; i++){
            for(int j=0; j<=i; j++){
                if(statues[i]<statues[j]){
                    temp=statues[i];
                    statues[i]=statues[j];
                    statues[j]=temp;
                }
            }
        }

        for(int i=0; i<statues.length-1; i++){
            int z=statues[i+1]-statues[i];
            if(z>1){
                count=z-1;
            }
        }

        return count;
    }
}
