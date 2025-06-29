import java.util.*;
class main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("number of arrays: ");
    int size = scan.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i<= size-1; i = i + 1) {
        
        arr[i] = scan.nextInt();     
    }
    System.out.println("find");
    System.out.println(arr[size/2]);
}
}
  