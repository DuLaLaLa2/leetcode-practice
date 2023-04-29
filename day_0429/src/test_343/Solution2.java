package test_343;

public class Solution2 {
    public static void main(String[] args) {
        int[] n = {1,2,4,3};
        countOperationsToEmptyArray(n);
    }
    public static long countOperationsToEmptyArray(int[] nums) {
        double min = 1e10;
        int cnt=0;
        int[] aux = new int[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<min)
                min=nums[i];
        }
        if(nums[0]==min){
            //删除首元素
            for (int j = 0; j < nums.length-1; j++) {
                aux[j] = nums[j+1];
            }
            cnt=1;
            if(aux.length>0){
                cnt+=countOperationsToEmptyArray(aux);
            }
        }else {
            //首元素放末尾去
            int tp=nums[0];
            for (int j=0;j<nums.length-1;j++){
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=tp;
            cnt++;
            cnt+=countOperationsToEmptyArray(nums);
        }
        return cnt;
    }
}
