package com.algorithm.code;

/**
 * 给你一个二叉树，你要判断它是否沿中轴线对称<br/>
 *
 * 比如说，给你的二叉树是：
 *
 *      1
 *    /   \
 *   2     2
 *  / \   / \
 * 4   8 8   4
 *
 * 这棵二叉树是沿中轴线对称的，因此要返回 true。如果我去掉最后这个 4：
 *
 *      1
 *    /   \
 *   2     2
 *  / \   /
 * 4   8 8
 *
 * 就不对称了，这时就要返回 false。
 *
 * @author pengc
 * @date 2019/9/9 10:26
 */
public class Four {

    public boolean isSymmetricTreeRecursive(TreeNode root) {

        return true;
    }

    public int recursiveTree(TreeNode node) {
        return 0;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }



}
