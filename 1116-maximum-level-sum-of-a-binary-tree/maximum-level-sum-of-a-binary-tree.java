class Solution {
    public int maxLevelSum(TreeNode root) {
        List<Integer> sums = new ArrayList<>();
        dfs(root, 0, sums);
        
        int maxLevel = 0;
        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i) > sums.get(maxLevel)) {
                maxLevel = i;
            }
        }
        return maxLevel + 1; 
    }
    
    private void dfs(TreeNode node, int level, List<Integer> sums) {
        if (node == null) return;
        
        if (level >= sums.size()) {
            sums.add(node.val);
        } else {
            sums.set(level, sums.get(level) + node.val);
        }
        
        dfs(node.left, level + 1, sums);
        dfs(node.right, level + 1, sums);
    }
}