class Solution{
    private ArrayList<ArrayList<Integer>> adjList;
    long solve(int V,int E,int[] Values,int[][] Edges){
        //code here
        adjList=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<Integer>());
        }
        for(int i=0;i<E;i++){
            adjList.get(Edges[i][0]-1).add(Edges[i][1]-1);
            adjList.get(Edges[i][1]-1).add(Edges[i][0]-1);
        }
        boolean vis[]=new boolean[V];
        long score=0;
        long maxScore=0;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                score=dfs(i,vis,Values);
                maxScore=Math.max(score,maxScore);
            }
        }
        return maxScore;
    }
    public long dfs(int i,boolean[] vis,int[] Values){
        long score=Values[i];
        vis[i]=true;
        for(Integer adj:adjList.get(i)){
            if(!vis[adj]){
                score+=dfs(adj,vis,Values);
            }
        }
        return score;
    }
}