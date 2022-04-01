package tree.levelOrder;

import tree.TreeNode;

import java.util.*;

public class Solution {


    // 层次遍历二叉树，同一层的节点从左到右打印，每一层打印到一行
    public List<List<Integer>> levelOrder(TreeNode root) {

        ArrayList<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> tmp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                tmp.add(node.val);

                if (node.left != null) queue.add(node.left);

                if (node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }

        return res;

    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> tmp = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                if (res.size()%2==0){
                    tmp.addLast(node.val);
                }else tmp.addFirst(node.val);

                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
            }
        }
        return res;
    }



}
