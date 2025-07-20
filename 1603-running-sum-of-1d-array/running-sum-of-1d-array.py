class Solution(object):
    def runningSum(self, nums):
        sum=0
        for i in range(0,len(nums)):
            sum+=nums[i]
            nums[i]=sum
        return nums


        