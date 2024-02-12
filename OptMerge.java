import java.util.PriorityQueue;
import java.util.Scanner;
class OptMerge {
    public static int mergeCost(int[] files) {
        int cost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int file : files) {
            minHeap.add(file);
        }
        while (minHeap.size() > 1) {
            int file1 = minHeap.poll();
            int file2 = minHeap.poll();
            int mergeCost = file1 + file2;
            cost += mergeCost;
            minHeap.add(mergeCost);
        }
        return cost;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int files[]=new int[n];
        for (int i=0;i<n;i++)
          files[i]=s.nextInt();
        int cost = mergeCost(files);
        System.out.println("Optimal Merge Cost: " + cost);
    }
}

