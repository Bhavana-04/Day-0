import math
class Solution:
    def micsandjury (self, N, M, teams):
        #code here
        high=max(teams)
        low=1
        res=high
        while(low<=high):
            mid=(low+high)//2
            req=0
            for i in teams:
                req+=math.ceil(i/mid)
            if(req<=N):
                res=mid
                high=mid-1
            else:
                low=mid+1
        return res