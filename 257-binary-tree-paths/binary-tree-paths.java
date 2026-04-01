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
         List <String> arr = new ArrayList<>();
         if(root==null)return arr;
         path(root, Integer.toString(root.val),arr);
         return arr;
    }
    public void path(TreeNode root,String path, List<String>arr){
        if(root.left ==null && root.right==null){
            arr.add(path);
            return;
        }
        if(root.left!=null){
            path(root.left,path+"->"+root.left.val,arr);
        }
         if(root.right!=null){
            path(root.right,path+"->"+root.right.val,arr);
        }
    }
    
}