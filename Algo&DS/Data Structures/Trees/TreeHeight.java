/* Find the height of a binary tree (Maximum Depth)
 * Node { 
 *    Node left;
 *    Node right; 
 *    int data;
 * }
 */

	static int height(Node root) {
        if (root==null || (root.left == null && root.right == null)) return 0;
      	return Math.max(height(root.left), height(root.right)) + 1; 
    }