import java.util.*;
public class Duplicate{
  public static void main(String aregs[]){
    int[] arr={1,2,4,1,7,5,2,7,1,2};
    ArrayList<Integer> brr=new ArrayList<Integer>();
    for(int i=0;i<arr.length;i++){
      if(!brr.contains(arr[i]))
        brr.add(arr[i]);
    }
    System.out.println(brr);
  }
}

