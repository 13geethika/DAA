import java.util.*;
public class OuickSort{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("How many numbers in the list :");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the numbers ");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("The numbers before sorting: ");
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" ");
    System.out.println();
    System.out.println("The numbers after sorting :");
    sort(a,0,n-1);
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" ");
  }
  public static void sort(int ar[],int l,int h){
    int left=l;
    int right=h;
    int pivot=l;
    int temp;
    while(left<right){
      while((ar[pivot]<ar[right]) && (pivot!=right))
        right--;
      if(pivot!=right){
        temp=ar[pivot];
        ar[pivot]=ar[right];
        ar[right]=temp;
        pivot=right;
      }
      while((ar[pivot]>ar[left])&&(pivot!=left))
        left++;
      if(pivot!=left){
        temp=ar[pivot];
        ar[pivot]=ar[left];
        ar[left]=temp;
        pivot=left;
      }
    }
    if (l<pivot)
      sort(ar,l,pivot-1);
    if(h>pivot)
      sort(ar,pivot+1,h);
  }
}
    
