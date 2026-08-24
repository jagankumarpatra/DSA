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
           List<Integer>ls= new ArrayList<>();
         inorder(root, ls);
         return ls;
    }
            private void inorder(TreeNode node, List<Integer> ls) {

        if(node == null){
            return ;
        }
        inorder(node.left,ls);
 
        inorder(node.right,ls);
        ls.add(node.val);   
    }

    }


