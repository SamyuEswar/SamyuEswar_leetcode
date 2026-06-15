class Solution {
    public void f(int node,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        for(int a:adj.get(node)){
            if(vis[a]==0){
                f(a,vis,adj);
            }
        }
    }
    public int findCircleNum(int[][] grid) {
        //2d to adjacency list
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }
        //count no.of times user made function calls
        int c=0;
        int[] vis=new int[n];
        Arrays.fill(vis,0);
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                f(i,vis,adj);
                c++;
            }
        }
        return c;
    }
}