class Solution{
    private A a;
    Solution(A a){
        this.a=a;
    }
    // do not edit this function
    // use it to get the value of A[i][j]
    int get(int i,int j){
      return a.get(i,j); 
    }
    public int solve(int R,int C){
        // code here
        int max=0;
        int index=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                int v=get(i,j);
                if(v==1){
                    if(C-j>max){
                        max=C-j;
                        index=i;
                    }
                    break;
                }
            }
        }
        return index;
        
    }
};