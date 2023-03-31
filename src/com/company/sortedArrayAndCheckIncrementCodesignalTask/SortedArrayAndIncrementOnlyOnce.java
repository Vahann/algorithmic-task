package com.company.sortedArrayAndCheckIncrementCodesignalTask;

public class SortedArrayAndIncrementOnlyOnce {

    public static boolean solution(int[] sequence) {

//        int index = 0;
//        int step = 0;
//        boolean b=true;
//
//        if (sequence[0] >= sequence[1]) {
//            step++;
//            index++;
//            b=!b;
//        }
//
//        for (int i = index; i < sequence.length - 2; i++) {
//            if (sequence[i + 1] - sequence[i] != 1) {
//                if (sequence[i + 2] - sequence[i] == 1) {
//                    step++;
//                    b=!b;
//                }
//
//            }else {
//                step++;
//                b = !b;
//            }
//
//        }
//        //i=0
////        return step == 1 || step==0;
//        return b;


        int index=0;
        int step=0;
        boolean b=true;

//        if(sequence[0]>=sequence[1]){
//            step++;
//            index++;
//            b=!b;
//            // continue;
//
//        }
//
//        for(int i=index; i<sequence.length-2; i++){
//
//            if(sequence[i+1]-sequence[i]!=1){
//                if (sequence[i+2]-sequence[i]==1){
//                    step++;
//                    b=!b;
//                }else{
//                    return false;
//                }
//
//            }
//
//        }
//        //i=0
//        return step<2;
//    }
        //////////// 13/19
//        int index=0;
//        int step=0;
//        boolean b=true;
//        if(sequence.length==2) return true;
//
//        if(sequence[0]==sequence[1]){
//            step++;
//            index++;
//            b=!b;
//            if(sequence[sequence.length-2]==sequence[sequence.length-1] || (sequence[sequence.length-2]-sequence[sequence.length-1])<2){
//                step++;
//            }
//
//
//        }
//        if(step<2){
//
//            for(int i=index; i<sequence.length-2; i++){
//
//                if(sequence[i+1]-sequence[i]<=1){
//                    if (sequence[i+2]-sequence[i]>=1){
//                        step++;
//                        b=!b;
//                    }else{
//                        return false;
//                    }
//
//                }
//
//            }
//        }
//        //i=0
//        return step<2;
//        //return b;
        ////////16/19
        if(sequence.length==2) return true;
        if(sequence[0]>=sequence[1]){
            step++;
            index++;
        }
        if(sequence[sequence.length-2]>=sequence[sequence.length-1]){
            step++;
        }
        if(step<2){
            for (int i = index; i < sequence.length-1 ; i++) {

                if(sequence[i+1]-sequence[i]<=0){
                    step++;

                }
            }

            }
        return step<2;
        }
}