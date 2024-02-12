import java.util.Scanner;
class MinMax {
    int min, max;
    public MinMax(int a, int b) {
        min = a;
        max = b;
    }
    public static MinMax findMinMax(int[] ar, int l, int h) {
        MinMax x, y, z;
        if (l == h) {
            x = new MinMax(ar[l], ar[l]);
            return x;
        } else if (h == l + 1) {
            x = new MinMax(Math.min(ar[l], ar[h]), Math.max(ar[l], ar[h]));
            return x;
        } else {
            int mid = (l + h) / 2;
            x = findMinMax(ar, l, mid);
            y = findMinMax(ar, mid + 1, h);
            z = new MinMax(Math.min(x.min, y.min), Math.max(x.max, y.max));
            return z;
        }
    }
}
public class FindMinMax extends MinMax {
  public FindMinMax(int a,int b){
    super(a,b);
  }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers in the list: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        MinMax r= findMinMax(a, 0, n - 1);
        System.out.println("Min is " + r.min + " Max is " + r.max);
    }
}

