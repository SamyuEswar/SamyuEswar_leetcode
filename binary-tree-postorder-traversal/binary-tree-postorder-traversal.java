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
    List<Integer> l;
    void recur(TreeNode root){
        if(root==null) return ;
        recur(root.left);
        recur(root.right);
        l.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        l=new ArrayList<>();
        recur(root);
        return l;
    }
}