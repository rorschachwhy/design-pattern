package com.why.design.principle.demeter;


/**
 * @Author: wanghaiyang
 * @Date: 2020/5/7 11:03 PM
 * @Description:
 */
public class SubtreeOfAnotherTree {


    //      Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public static boolean  isSubtree(TreeNode s, TreeNode t) {
            if (t == null) {
                return true;
            } else if (s == null) {
                return false;
            } else if (isSameTree(s, t)) {
                return true;
            } else {
                return isSubtree(s.left, t) || isSubtree(s.right, t);

            }
        }

        public static boolean isSameTree(TreeNode s, TreeNode t) {
            if (s == null && t == null) {
                return true;
            } else if (s == null || t == null) {
                return false;
            } else if (s.val != t.val) {
                return false;
            } else {
                // 递归放在最后，性能会比较好
                return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode s = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode t = new TreeNode(1, new TreeNode(2), null);
        System.out.println(Solution.isSubtree(s, t));
    }
}
