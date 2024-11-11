import java.net.SocketOption;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      int arr[]={-1,3,5,7,8,4,2};
      int max=arr[0];
      for(int i=1;i<arr.length;i++){
          if(arr[i]>max){
              max=arr[i];
          }
      }
        System.out.println(max);
    }
}