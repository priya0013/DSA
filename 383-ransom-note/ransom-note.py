class Solution:
    def canConstruct(self, r: str, m: str) -> bool:
        l1=list(r)
        l2=list(m)
        for c in l1:
            if c in l2:
                l2.remove(c)
            else:
                return False
        return True