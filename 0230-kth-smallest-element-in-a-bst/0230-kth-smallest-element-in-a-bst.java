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
    int ans = -1;
    int counter = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return ans;
    }
    public void dfs(TreeNode root,int k){
        if(root == null)
        return;
        if(counter > k)
        return;

        dfs(root.left,k);
        counter++;
        if(counter == k)
        {
            this.ans = root.val;
        }
        dfs(root.right,k);
    }
}