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

  * I am providing solution for first the case.
  * Solution for latter one can be found in top-view-of-tree.js 
  */


function topViewTree(root) {
    var lines = {};
    var minLine = 0,
        maxLine = 0;

    var q = [];
    q.push({ node: root, line: 0 });
    if (!root) {
        return [];
    }
    while (q.length > 0) {
        var crt = q[0];
        q.shift();

        if (!lines[crt.line]) {
            lines[crt.line] = [crt.node.data];
        } else {
            lines[crt.line].push(crt.node.data);
        }

        minLine = Math.min(minLine, crt.line);
        maxLine = Math.max(maxLine, crt.line);

        if (crt.node.left) {
            q.push({ node: crt.node.left, line: crt.line - 1 });
        }
        if (crt.node.right) {
            q.push({ node: crt.node.right, line: crt.line + 1 });
        }
    }

    // print the first node of each level that is visible 
    for (var i=0; i>=minLine; i--) {
    	console.log(lines[i][0]);
    }
    for (var i=1; i<=maxLine; i++) {
    	console.log(lines[i][0]);
    }
}