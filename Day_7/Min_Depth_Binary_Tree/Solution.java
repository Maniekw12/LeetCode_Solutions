package Day_7.Min_Depth_Binary_Tree;

class TreeNode {
    int val;
    Day_7.Min_Depth_Binary_Tree.TreeNode left;
    Day_7.Min_Depth_Binary_Tree.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, Day_7.Min_Depth_Binary_Tree.TreeNode left, Day_7.Min_Depth_Binary_Tree.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        if(root.left == null && root.right == null){
            return 1;
        }

        if(root.left == null){
            return 1 + minDepth(root.right);
        }

        if(root.right == null){
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));

    }

}