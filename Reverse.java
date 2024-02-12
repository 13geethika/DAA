import java.util.*;
public class Reverse{
public static void main(String args[]){
    String[] arr;String o="";
    String s="This is CSE Block";
    arr=s.split(" ");
    for(int i=arr.length;i>0;i--){
      o=o+" "+arr[i-1];
    }
    System.out.println(o);
}
}

