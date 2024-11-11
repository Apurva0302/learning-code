public class arrayissorted {
    public static boolean isarray(int []nums){

        int k=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>(nums[(i+1)%n])){
                k++;
            }
        }
        if(k>1){
            return false;
        }else{
            return true;
        }

    }

    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(isarray(nums));
    }
}
