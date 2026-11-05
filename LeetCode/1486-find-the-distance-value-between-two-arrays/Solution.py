class Solution:
    def findTheDistanceValue(self, arr1: list[int], arr2: list[int], d: int) -> int:
        cnt = 0
        for num in arr1:
            if self.isValid(num,arr2,d):
                cnt += 1
        return cnt

    def isValid(self,num : int, arr: list[int], d : int) -> bool:
        for n in arr:
            if abs(n - num) <= d:
                return False
        return True
