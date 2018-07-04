/*
 * Find the vertical order traversal of a given tree.
 * Maintain a minimum level and maximum level variable.
 * Travel the tree in level order and keep pushing the nodes that are on same level for the same key.
 * Travelling the tree in level order ensures the vertical order of top to bottom is maintained.  
 */
function(root) {
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