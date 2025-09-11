package LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Problem Statement: Maximum Concurrent Clients
 * <p>
 * You are given two lists:
 * <p>
 * start[i]: the time when client i starts interacting with the server
 * <p>
 * stop[i]: the time when client i stops interacting with the server (inclusive)
 * <p>
 * A client is considered active at every integer second t where start[i] ≤ t ≤ stop[i].
 * <p>
 * Return the maximum number of clients that are active at the same time.
 * <p>
 * Example 1
 * <p>
 * Input:
 * <p>
 * start = [1, 6, 2, 9]
 * stop  = [8, 7, 6, 10]
 * <p>
 * <p>
 * Output:3
 * <p>
 * Explanation:
 * <p>
 * At time 6, clients 1, 2, and 3 are active → 3 clients (the maximum).
 * <p>
 * No time has more than 3 clients.
 * <p>
 * Example 2
 * <p>
 * Input:
 * <p>
 * start = [5, 2, 3, 7, 4]
 * stop  = [7, 4, 5, 8, 6]
 * Output:3
 * Explanation:
 * <p>
 * At time 4, clients 2, 3, and 5 are active → maximum = 3.
 * <p>
 * Example 3
 * <p>
 * Input:
 * <p>
 * start = [1, 2, 3]
 * stop  = [3, 4, 5]
 * <p>
 * <p>
 * Output:
 * <p>
 * 3
 * <p>
 * <p>
 * Explanation:
 * <p>
 * At time 3, all three clients are active → maximum = 3.
 * <p>
 * Example 4
 * <p>
 * Input:
 * <p>
 * start = [10, 20, 30]
 * stop  = [15, 25, 35]
 * <p>
 * <p>
 * Output:
 * <p>
 * 1
 * <p>
 * <p>
 * Explanation:
 * <p>
 * No two intervals overlap.
 * <p>
 * The maximum number of clients is 1.
 */
public class MaxClientInteraction {

    public static void main(String[] args) {
        List<Integer> start = Arrays.asList(1, 6, 2, 9);
        List<Integer> stop = Arrays.asList(8, 7, 6, 10);

        System.out.println(earliestMaxTime(start, stop)); // Output: 6
    }

    public static int earliestMaxTime(List<Integer> start, List<Integer> stop) {
        TreeMap<Integer, Integer> events = new TreeMap<>();

        for (int i = 0; i < start.size(); i++) {
            int s = start.get(i);
            int e = stop.get(i);
            System.out.println("Start and ENd " + s + "::" + e);
            events.put(s, events.getOrDefault(s, 0) + 1);     // client joins
            events.put(e + 1, events.getOrDefault(e + 1, 0) - 1); // client leaves after stop
        }
        System.out.println("Map" + events);

        int active = 0;
        int maxClients = 0;

        for (Map.Entry<Integer, Integer> entry : events.entrySet()) {
            active += entry.getValue();

            if (active > maxClients) {
                maxClients = active;
            }
        }

        return maxClients;

    }
}

