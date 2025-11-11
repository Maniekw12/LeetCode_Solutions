package Day_9.sametree;


import java.util.LinkedList;
import java.util.Queue;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList();
        Queue<TreeNode> q2 = new LinkedList();
        if(p != null){
            q1.add(p);
        }
        if(q != null){
            q2.add(q);
        }


        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode n1 = q1.poll();
            TreeNode n2 = q2.poll();

            if(n1.val != n2.val) return false;

            if(n1.left != null){
                q1.add(n1.left);
            }
            if(n2.left != null){
                q2.add(n2.left);
            }

            if(n1.right != null){
                q1.add(n1.right);
            }
            if(n2.right != null){
                q2.add(n2.right);
            }
            if ((n1.left == null) != (n2.left == null)) return false;
            if ((n1.right == null) != (n2.right == null)) return false;


        }
        if(!q1.isEmpty()){
            return false;
        }
        if(!q2.isEmpty()){
            return false;
        }
        return true;
    }
}