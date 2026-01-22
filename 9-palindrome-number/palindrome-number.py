class Solution:
    def isPalindrome(self, x: int) -> bool:
        orig=str(x)
        rev=orig[::-1]
        return orig==rev