package lc_2423;

import java.util.HashMap;

public class Solution1 {
//    public static boolean equalFrequency(String word) {
//        char[] w = word.toCharArray();
//        HashMap<Character, Integer> ha = new HashMap<>();
//        for (int i = 0; i < word.length(); i++) {
//            if(!ha.containsKey(w[i])){
//                ha.put(w[i],1);
//            }else {
//                ha.compute(w[i],(k,v)->++v);
//            }
//        }
//        int[] subnum=new int[ha.size()];
//        int j=0;
//        for (int val: ha.values()){
//            subnum[j]=val;
//            ++j;
//        }
//        boolean flag=true;
//        for (int i = 0; i < subnum.length; i++) {
//            if(1!=subnum[i]) {
//                flag=false;
//                break;
//            }
//        }
//        if(flag){
//            return true;
//        }
//        flag = true;
//        for (int k=0;k< subnum.length;++k){
//            --subnum[k];
//            if(subnum[k]==0) {
//                //看其他字母个数是否相等
//                if (k == 0) {
//                    for (int i = 2; i < subnum.length; i++) {
//                        if (subnum[1] != subnum[i]) {
//                            flag = false;
//                            break;
//                        }
//                    }
//                    if (flag) {
//                        return true;
//                    }
//                }
//            }else {
//                    for (int i = 1; i < subnum.length ; i++) {
//                        if(i!=k && subnum[0]!=subnum[i]) {
//                            flag=false;
//                            break;
//                        }
//                    }
//                    if(flag){
//                        return true;
//                    }
//                }
//            }
//            for (int l = 0; l < subnum.length; l++) {
//                if(subnum[k]!=subnum[l]) {
//                    flag = false;
//                    ++subnum[k];
//                    break;
//                }
//                flag=true;
//            }
//            if(flag){
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        String s="cccd";
//        System.out.println(equalFrequency(s));
    }
}
