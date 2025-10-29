package Day_7.Max_Depth_Binary_Tree;


class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return maximumHeight(root);
    }



    private int maximumHeight(TreeNode root){
        if(root == null) return 0;

        return 1+ Math.max(maximumHeight(root.left),maximumHeight(root.right) );
    }

}