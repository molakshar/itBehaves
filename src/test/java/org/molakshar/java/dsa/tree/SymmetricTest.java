package org.molakshar.java.dsa.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SymmetricTest {

    @Test
    public void testSymmetric_WhenRootisNull(){
        Symmetric symmetric = new Symmetric();
        Node root = null;
        assertEquals(false, symmetric.isSymmetric(root));
    }
}
