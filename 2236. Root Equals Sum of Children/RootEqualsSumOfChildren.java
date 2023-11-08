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
class RootEqualsSumOfChildren {

    public static void main(String[] args){
        TreeNode myLefTreeNode = new TreeNode(4);
        // TreeNode myLefTreeNode = null;
        TreeNode myRightTreeNode = new TreeNode(6);
        // TreeNode myRightTreeNode = null;
        TreeNode myRootTreeNode = new TreeNode(10,myLefTreeNode,myRightTreeNode);

        System.out.println(checkTree(myRootTreeNode));
    }

    static public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val ? true : false;        
    }
}

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