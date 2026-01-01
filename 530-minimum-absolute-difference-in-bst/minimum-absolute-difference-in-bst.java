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
    int mn=Integer.MAX_VALUE;
    Integer pre=null;
    public int getMinimumDifference(TreeNode root) {
        if(root==null){
            return mn;
        }
        getMinimumDifference(root.left);
        if(pre!=null){
            mn=Math.min(mn,root.val-pre);
        }
        pre=root.val;
        getMinimumDifference(root.right);
        return mn;
    }
}