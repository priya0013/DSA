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
    private static final int MOD = 1000000007;
    private long maxProduct = 0;
    private long totalSum = 0;
    
    public int maxProduct(TreeNode root) {
        totalSum = dfsSum(root);
        dfsProduct(root);
        return (int)(maxProduct % MOD);
    }
    
    private long dfsSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + dfsSum(node.left) + dfsSum(node.right);
    }
    
    private long dfsProduct(TreeNode node) {
        if (node == null) return 0;
        
        long leftSum = dfsProduct(node.left);
        long rightSum = dfsProduct(node.right);
        long subtreeSum = node.val + leftSum + rightSum;
        
        if (subtreeSum != totalSum) {
            long product = subtreeSum * (totalSum - subtreeSum);
            maxProduct = Math.max(maxProduct, product);
        }
        
        return subtreeSum;
    }
}