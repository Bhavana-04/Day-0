class Solution{
     public void bfs(Queue<ArrayList<Integer>> q,int x,int y,int time,int[][] hospital){
         ArrayList<Integer> al;
         if(x<0 || y<0){
             return;
         }
         if(x>=hospital.length || y>=hospital[0].length){
             return;
         }
         if(hospital[x][y]==0 || hospital[x][y]==2){
             return;
         }
         if(hospital[x][y]==1){
             al=new ArrayList<Integer>();
             hospital[x][y]=2;
             al.add(time+1);
             al.add(x);
             al.add(y);
             q.add(al);
         }
     }
     
     public int helpaterp(int[][] hospital) {
        // code here
        int rows=hospital.length;
        int cols=hospital[0].length;
        ArrayList<Integer> al;
        Queue<ArrayList<Integer>> q=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(hospital[i][j]==2){
                    al=new ArrayList<Integer>();
                    al.add(0);
                    al.add(i);
                    al.add(j);
                    q.add(al);
                }
            }
        }
        int time=0;
        while(!q.isEmpty()){
            al=q.poll();
            time=al.get(0);
            int x=al.get(1);
            int y=al.get(2);
            bfs(q,x-1,y,time,hospital);
            bfs(q,x,y-1,time,hospital);
            bfs(q,x+1,y,time,hospital);
            bfs(q,x,y+1,time,hospital);
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(hospital[i][j]==1)
                    return -1;
            }
        }
        return time;
    }
}