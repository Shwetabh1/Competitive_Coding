/* 
 * Print the level order traversal of a tree
 * Level order traversal means travelling the tree level by level, in left to right direction
 *
    Node is defined as:
    var Node = function(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
*/


function levelOrder(root) {
    let arr = []; //use it as a queue
    arr.push(root);
    while (arr.length !== 0) {
        let elementRemoved = arr.shift(); // remove the first element pushed
        process.stdout.write(elementRemoved.data + ' ');
        // console.log(elementRemoved);
        if (elementRemoved.left !== null) {
            // console.log('Pushing Element 1');
            arr.push(elementRemoved.left);
        }
        if (elementRemoved.right !== null) {
            //console.log('Pushing Element 2');
            arr.push(elementRemoved.right);
        }
    }
}