/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode>mp=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
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
            if(l==k) break;
            int ele=q.size();
            for(int i=0;i<ele;i++){
                TreeNode node=q.poll();
                if(node.left!=null && !vis.containsKey(node.left)){
                    q.offer(node.left);
                    vis.put(node,true);
                }
                if(node.right!=null && !vis.containsKey(node.right)){
                    q.offer(node.right);
                    vis.put(node,true);
                }
                if(mp.containsKey(node) && !vis.containsKey(mp.get(node))){
                    q.offer(mp.get(node));
                    vis.put(mp.get(node),true);
                }
            }
            l++;
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
}