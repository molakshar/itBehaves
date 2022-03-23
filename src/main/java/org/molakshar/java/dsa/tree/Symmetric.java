package org.molakshar.java.dsa.tree;

public class Symmetric {

    public boolean isSymmetric(Node root) {

        if (root == null) return false;

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(Node leftRoot, Node rightRoot) {

        if (leftRoot == null && rightRoot == null)
            return true;

        if (leftRoot == null || rightRoot == null || leftRoot.val != rightRoot.val)
            return false;

        return isSymmetric(leftRoot.left, leftRoot.right) && isSymmetric(rightRoot.left, rightRoot.right);

    }
}
