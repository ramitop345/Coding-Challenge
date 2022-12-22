class Solution:
    def solution(self, N: int) -> int:
        # Convert the number to its binary representation
        binary = bin(N)[2:]

        # Initialize variables to keep track of the current gap and the maximum gap found so far
        max_gap = 0
        current_gap = 0

        # Iterate through the binary representation
        for c in binary:
            if c == '1':
                # If we find a 1, we update the maximum gap if necessary and reset the current gap
                max_gap = max(max_gap, current_gap)
                current_gap = 0
            elif c == '0':
                # If we find a 0, we increment the current gap
                current_gap += 1

        # Return the maximum gap
        return max_gap





if __name__ == '__main__':
    mySol = Solution()
    print(mySol.solution(1675))