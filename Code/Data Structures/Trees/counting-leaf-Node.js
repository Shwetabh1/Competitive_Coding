/* 
 * Count the total number of leaf Nodes in a tree.
 * Travel the tree in level order and count the nodes that have no children.
 * You can also use recursion but I personally prefer this.
 */ 

 function countingLeafNodes(root) {
    let arr = []; //use it as a queue
    let count = 0;
    arr.push(root);
    while (arr.length !== 0) {
        let elementRemoved = arr.shift(); // remove the first element pushed
        if (elementRemoved.left === null && elementRemoved.right === null) { //it is a leaf node
        	count++;
        } else if (elementRemoved.left !== null) {
            arr.push(elementRemoved.left);
        } else {
            arr.push(elementRemoved.right);
        }
    }
    return count;
}