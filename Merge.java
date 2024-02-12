import java.util.*;
public class Merge{
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
    mergePass(a,0,n-1);
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" ");
  }
  public static void mergePass(int a[],int l,int h){
    if(l!=h){
      int mid=(l+h)/2;
      mergePass(a,l,mid);
      mergePass(a,mid+1,h);
      mergeSort(a,l,mid,h);
    }
  }
  public static void mergeSort(int a[], int l, int mid, int h) {
    int i = l;
    int j = mid + 1;
    int temp[] = new int[h - l + 1]; 
    int k = 0; 
    while ((i <= mid) && (j <= h)) {
        if (a[i] < a[j])
            temp[k++] = a[i++];
        else
            temp[k++] = a[j++];
    }
    while (i <= mid)
        temp[k++] = a[i++];
    while (j <= h)
        temp[k++] = a[j++]; 
    for (int c = 0; c < temp.length; c++)
        a[l + c] = temp[c];
  }
}
