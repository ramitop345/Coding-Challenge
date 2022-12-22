
class Solution {
    public int solution(int N) {
        // Convert the number to its binary representation
        String binary = Integer.toBinaryString(N);

        // Initialize variables to keep track of the current gap and the maximum gap found so far
        int maxGap = 0;
        int currentGap = 0;

        // Iterate through the binary representation
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                // If we find a 1, we update the maximum gap if necessary and reset the current gap
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            } else if (c == '0') {
                // If we find a 0, we increment the current gap
                currentGap++;
            }
        }

        // Return the maximum gap
        return maxGap;
    }


public static void main(String[] args) {
    Solution mySol = new Solution();
    System.out.println(mySol.solution(1675));
}
}