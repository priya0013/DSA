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
    unordered_map<int,int> ino;
    int post;
    TreeNode* build(vector<int>& postorder,int l,int r){
        if(l>r){
            return NULL;
        }
        int rootval=postorder[post--];
        TreeNode* root=new TreeNode(rootval);
        int poid=ino[rootval];
        root->right=build(postorder,poid+1,r);
        root->left=build(postorder,l,poid-1);
        return root;

    }
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        int n=inorder.size();
        post=n-1;
        for(int i=0;i<n;i++){
            ino[inorder[i]]=i;
        }
        return build(postorder,0,n-1);
    }
};