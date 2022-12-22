
class Solution {
    public int solution(int[] A) {
        int n = A.length;
        int sum = (n + 1) * (n + 2) / 2;
        for (int a : A) {
            sum -= a;
        }
        return sum;
    }


public static void main(String[] args) {
    Solution mySol = new Solution();
    int[] A = {1,2,3,4,6,7}; 
    System.out.println(mySol.solution(A));

    //Solution is of O(1)
}
}
