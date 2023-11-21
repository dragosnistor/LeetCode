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
        TreeNode my2ndLvl1stNode = new TreeNode(1);
        TreeNode my2ndLvl2ndNode = new TreeNode(2);


        TreeNode myLefTreeNode = new TreeNode(3, my2ndLvl1stNode, my2ndLvl2ndNode);
        // TreeNode myLefTreeNode = null;

        TreeNode my2ndLvl3rdNode = new TreeNode(5);
        TreeNode my2ndLvl4thNode = new TreeNode(6);

        TreeNode myRightTreeNode = new TreeNode(12, my2ndLvl3rdNode, my2ndLvl4thNode);
        // TreeNode myRightTreeNode = null;
        TreeNode myRootTreeNode = new TreeNode(15,myLefTreeNode,myRightTreeNode);

        System.out.println(checkTree(myRootTreeNode));
    }

    // static public boolean checkTree(TreeNode root) {
    //     return root.val == root.left.val + root.right.val ? true : false;        
    // }

        static public boolean checkTree(TreeNode root) {
            int sum = 0;
            
            if (root == null || (root.left == null && root.right == null)) return true;
            
            if (root.left != null) {
                sum += root.left.val;
            }

            if (root.right != null) {
                sum += root.right.val;
            }

            return (root.val == sum) && checkTree(root.left) && checkTree(root.right);
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