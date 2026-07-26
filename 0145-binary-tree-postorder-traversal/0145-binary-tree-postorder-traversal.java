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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result= new ArrayList<Integer>();
        getResult(result, root);
        return result;
    }
    void getResult(List<Integer> result, TreeNode root){
        if(root==null){
            return;
        }
        getResult(result, root.left);
        getResult(result, root.right);
        result.add(root.val);
    }
}