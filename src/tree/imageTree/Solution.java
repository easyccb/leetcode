package tree.imageTree;

import tree.TreeNode;

/**
 * ¶Ô³Æ¶þ²æÊ÷ÅÐ¶Ï
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;

        return isSymmetric2(root.left,root.right);
    }

    public boolean isSymmetric2(TreeNode root1,TreeNode root2){
        if (root1==null&&root2==null) return true;

        if (root2==null || root1==null || root2.val!=root1.val) return false;

        return isSymmetric2(root1.left,root2.right) && isSymmetric2(root1.right,root2.left);
    }



    public static void main(String[] args) {

    }
}
