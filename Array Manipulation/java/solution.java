import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] A) {
        // Use a hash table to store the count of each element
        Map<Integer, Integer> counts = new HashMap<>();
        for (int x : A) {
            counts.put(x, counts.getOrDefault(x, 0) + 1);
        }

        // Iterate through the hash table and return the element with an odd count
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }

        // If no element is found with an odd count, return -1
        return -1;
    }


/**
 * @param args
 */
public static void main(String[] args) {
    Solution mySol = new Solution();
    int[] A = {3,9,4,5,3,4,7,7,5};
    System.out.println(mySol.solution(A));
}
}