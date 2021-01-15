class Solution:
    def smallestnum (self,N):
        # code here 
        if(len(N)==1):
            return N
        l=[]
        c=0
        for i in range(0,len(N)):
            if(N[i]=='0'):
                c+=1
            else:
                l.append(N[i])
        l.sort()
        s=l[0]
        s=s+(c*'0')
        for i in range(1,len(l)):
            s+=l[i]
        return s