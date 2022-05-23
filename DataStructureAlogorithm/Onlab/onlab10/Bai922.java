package Onlab.onlab10;

import java.util.LinkedList;
import java.util.Queue;

public class Bai922 {
    class RecentCounter {

        Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList();
        }

        public int ping(int t) {
            while (!qeque.isEmpty() && t - qeque.getFirst() > 3000) {
                qeque.removeFirst();
            }
            qeque.addLast(t);
            return qeque.size();
        }
    }
}
