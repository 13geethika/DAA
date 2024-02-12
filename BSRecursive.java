import java.util.*;
public class BSRecursive{
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
    int r=binarySearch(a,0,n-1,key);
    if(r>-1){
      System.out.println("The number found at: "+(r+1)+" Position in List");
    }
    else
      System.out.println("The search element not found in the list ");
  }
  public static int binarySearch(int ar[],int l,int h,int k){
    int mid;
    if(l<=h){
      mid=(l+h)/2;
      if (ar[mid]==k)
        return mid;
      else if(ar[mid]>k)
        return binarySearch(ar,l,mid-1,k);
      else
        return binarySearch(ar,mid+1,h,k);
    }
    return -1;
  }
}
    
