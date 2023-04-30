package test;

class Solution {
    public static void main(String[] args) {
        int[] p1={10,2,2,3};
        int[] p2={3,8,4,5};
//        [5,6,1,10]
//        [5,1,10,5]
        isWinner(p1,p2);
    }
    public static int isWinner(int[] p1, int[] p2) {

        int p1s=0,p2s=0;
        if(p1.length<3){
            for(int i=0;i<p1.length;i++){
                p1s+=p1[i];
                p2s+=p2[i];
            }
        }else{
            p1s=p1[0]+p1[1];
            p2s=p2[0]+p2[1];
            for(int i=2;i<p1.length;i++){
                if(p1[i-1]==10||p1[i-2]==10){
                    p1s=2*p1[i]+p1s;
                }else{
                    p1s+=p1[i];
                }
            }
            for(int i=2;i<p1.length;i++){
                if(p2[i-1]==10||p2[i-2]==10){
                    p2s=2*p2[i]+p2s;
                }else{
                    p2s+=p2[i];
                }
            }
        }


        if(p1s>p2s)return 1;
        else if(p1s<p2s)return 2;
        else return 0;
    }
}
