import java.util.Arrays;
import java.util.PriorityQueue;

import javax.sound.midi.Soundbank;

public class Question4 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 8, 4, 2, 6, 3 };
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++)
            pq.add(arr[i]);

        pq.poll();
        System.out.println("2nd Smallest Element is: " + pq.poll());
        int y = 0;
        while (pq.size() != 2) {
            y = pq.poll();
        }
        System.out.println("2nd Largest Element is: " + pq.poll());


    }
}
