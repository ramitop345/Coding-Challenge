
class Solution {
    public int solution(int X, int Y, int D) {
        double distance = Y - X; // distance to be covered
        double jumps = distance / D; // number of jumps required
        return (int) Math.ceil(jumps); // return the result, rounded up to the nearest integer
    }


public static void main(String[] args) {
    Solution mySol = new Solution();
    System.out.println(mySol.solution(10,85,30));

    //Solution is of O(1)
}
}
