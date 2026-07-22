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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        List<List<Integer>> final_list= new LinkedList<List<Integer>>();
        if(root==null){
            return final_list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int level= queue.size();
            List<Integer> sublist= new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val);
            }
            final_list.add(sublist);
            
        }
       return final_list; 
        
    }
}