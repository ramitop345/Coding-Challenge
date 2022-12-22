import math

class Solution:
    def solution(self,A):
        n = len(A)
        sum = (n + 1) * (n + 2) // 2
        for a in A:
            sum -= a
        return sum




if __name__ == '__main__':
    A = [1,2,3,4,6,7,8]
    mySol = Solution(10,90,40)
    print(mySol.solution(1675))

#Solution is of O(1)