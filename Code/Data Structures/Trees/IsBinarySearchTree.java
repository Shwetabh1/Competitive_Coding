/*
 * Determine if the given tree is binary search tree.
 * Can be solved using two methods:
 * 1. Binary Search tree has a property that if you travel it in inorder traversal you obtain a STRICTLY Increasing Sequence.
 * 2. At each node determine the maximum element at left is less than that and the minimum at right side of the tree is greater that that node.
 */
/*
Method 1: 
    class Node {
        int data;
        Node left;
        Node right;
    }
 */
  
   public ArrayList<Integer> al = new ArrayList<Integer>(); 

   	void buildArr(Node root) {
        if (root != null) {
           buildArr(root.left);
           al.add(root.data);
           buildArr(root.right);
        }
   	}
   	
    boolean checkBST(Node root) {
        buildArr(root);
        for (int k=0;k<al.size()-1;k++) {
            if (al.get(k) >= al.get(k+1)) {
                return false;
            }
        }
        return true;
    }

/* Another approach is recursive */

