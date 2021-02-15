/*
 * When asked about printing top view of tree there are two perceptions
 * Mathematically a tree is represented like this so top view would mean, print all its left and right nodes.
        ______1 ______
      /              \
     2                3
    / \
    4  5
        \
         6
          \
           7
            \
             8
  * ans : 1 2 4 3
  * But at some places you can also find the representation as this:
  *   
         1
        / \
       2   3
      / \
     4   5
          \
           6
            \
             7
              \
               8

    Although this is mathematically wrong the interviewer might seem to ask you to print this  1 2 4 3 7 8

  * I am providing solution for the latter case.
  * Solution for first one can be found in top-view-of-a-tree-mathematical.js 
  */


function goLeft(root) {
	if (root) {
		goLeft(root.left);
		console.log(root.data);
	}
}
function goRight(root) {
	if (root) {
		goLeft(root.right);
		console.log(root.data);
	}
}

function topViewTree(root) {
	if (!root) 
		return;
    //go left
    goLeft(root.left);
    console.log(root.data); //print the root node
    goRight(root.right);
    //go right
}