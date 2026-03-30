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
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<>();
        if(root==null)return l;

        String path = Integer.toString(root.val);
        
        
        paths(root, path, l);

        return l;
    }
    public void paths(TreeNode root , String path, List<String> l){
        if(root.left== null && root.right==null){
            l.add(path);
            return;
        }
        if(root.left!=null){
            paths(root.left,path + "->"+ Integer.toString(root.left.val),l );
        }
         if(root.right!=null){
            paths(root.right,path + "->"+ Integer.toString(root.right.val),l );
        }
    }
}