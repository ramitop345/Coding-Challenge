import math

class Solution:
    def solution(self,X, Y, D):
        distance = Y - X # distance to be covered
        jumps = distance / D # number of jumps required
        return math.ceil(jumps) # return the result, rounded up to the nearest integer




if __name__ == '__main__':
    mySol = Solution(10,90,40)
    print(mySol.solution(1675))

#Solution is of O(1)