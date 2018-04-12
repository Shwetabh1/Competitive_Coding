/*
 * Find lowest common ancestor of two nodes in a tree.
 * 
 * Node is defined as :
 	class Node  {
    	int data;
    	Node left;
    	Node right;
    }
 *   
 */

static Node lca(Node root, int v1, int v2)
    {
        if (v1 > v2) {
            v1 = v1 + v2;
            v2 = v1 - v2;
            v1 = v1 - v2;
        }
        if (root.data >= v1 && root.data <= v2 ) {
            return root;
        } else {
            if (v2 < root.data ) {
               return lca(root.left,v1,v2);
            } else {
               return lca(root.right,v1,v2);
            }
        }
    }
