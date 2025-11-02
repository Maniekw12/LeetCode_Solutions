package Day_8.Diameter_Of_Binary_Tree;

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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        int sum = leftMaxDepth + rightMaxDepth;

        // Diameter can be in the subtree
        // It is not said that root node must be
        // included in diameter
        int sub = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));

        return Math.max(sub,sum);
    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}