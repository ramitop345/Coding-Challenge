from collections import defaultdict

class Solution:
    def solution(self, A):
        # Use a defaultdict to store the count of each element
        counts = defaultdict(int)
        for x in A:
            counts[x] += 1

        # Iterate through the defaultdict and return the element with an odd count
        for x, count in counts.items():
            if count % 2 == 1:
                return x

        # If no element is found with an odd count, return -1
        return -1





if __name__ == '__main__':
    mySol = Solution()
    A = [3,9,4,5,3,4,7,7,5]
    print(mySol.solution(A))