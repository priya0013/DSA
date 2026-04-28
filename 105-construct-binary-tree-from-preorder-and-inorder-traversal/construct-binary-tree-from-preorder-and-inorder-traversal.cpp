/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    unordered_map<int,int> mp;
    int prefixid=0;
    TreeNode* build(vector<int>& preorder,int l,int r){
        if(l>r){
            return NULL;
        }
        int rootval=preorder[prefixid++];
        TreeNode* root=new TreeNode(rootval);
        int id=mp[rootval];
        root->left=build(preorder,l,id-1);
        root->right=build(preorder,id+1,r);
        return root;
    }
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        for(int i=0;i<inorder.size();i++){
            mp[inorder[i]]=i;
        }
        return build(preorder,0,inorder.size()-1);
    }
};