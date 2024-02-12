import java.util.*;
public class BSearch{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("How many numbers in the list :");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the numbers in sorted order ");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.print("Enter the search element :");
    int key=sc.nextInt();
    int r=binarySearch(a,n,key);
    if(r>-1){
      System.out.println("The number found at: "+(r+1)+" Position in List");
    }
    else
      System.out.println("The search element not found in the list ");
  }
  public static int binarySearch(int ar[],int h,int k){
    int lb=0;
    int hb=h-1;
    int mid;
    while(lb<=hb){
      mid=(lb+hb)/2;
      if (ar[mid]==k)
        return mid;
      else if(ar[mid]>k)
        hb=mid-1;
      else
        lb=mid+1;
    }
    return -1;
  }
}
    
