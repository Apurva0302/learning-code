public class secondlargest {
    public static void main(String[] args) {
        int[] arr={12, 35, 1, 10, 34, 1};
        int max=arr[0];
        int secondlargest=0;
        for(int i=1;i<arr.length;i++){
          if(arr[i]>max){
              secondlargest=max;
              max=arr[i];
          }else if(arr[i]<max&&arr[i]>secondlargest){
              secondlargest=arr[i];
          }
        }
        System.out.println(secondlargest);
    }

}
