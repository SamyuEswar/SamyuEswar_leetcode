/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode>mp=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        TreeNode target=new TreeNode();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node.val==start) target=node;
            if(node.left!=null){
                mp.put(node.left,node);
                q.offer(node.left);
            }
            if(node.right!=null){
                mp.put(node.right,node);
                q.offer(node.right);
            }
        }
        HashMap<TreeNode,Boolean>vis=new HashMap<>();
        int l=0;
        q.offer(target);
        vis.put(target,true);
        while(!q.isEmpty()){
            int ele=q.size();
            for(int i=0;i<ele;i++){
                TreeNode node=q.poll();
                if(node.left!=null && !vis.containsKey(node.left)){
                    q.offer(node.left);
                    vis.put(node.left,true);
                }
                if(node.right!=null && !vis.containsKey(node.right)){
                    q.offer(node.right);
                    vis.put(node.right,true);
                }
                if(mp.containsKey(node) && !vis.containsKey(mp.get(node))){
                    q.offer(mp.get(node));
                    vis.put(mp.get(node),true);
                }
            }
            l++;
        }
        return l-1;
    }
}