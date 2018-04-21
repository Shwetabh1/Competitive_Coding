/*
 * Find the vertical order traversal of a given tree.
 * Can be solved using linkedHashMap easily.
 */
let arr = [];

function verticalOrderTraversal(root, verticalLevel) {
 	if (root !=null) {
 		let tempArr = arr[verticalLevel];
 		if (tempArr === undefined) {
 			tempArr = [];
 		}
 		tempArr.push(root.data);
 		arr[verticalLevel] = tempArr;
 		verticalOrderTraversal(root.left, verticalLevel - 1);
 		verticalOrderTraversal(root.right, verticalLevel + 1);
 	}
 }

function printVerticalOrderTraversal() {
	// let keys = Object.keys(arr);
	for (let i=0; i<keys.length; i++) {
		arr[key[i]].forEach(function(val, index){
			console.log(val);
		})
	}
}




//Call verticalOrderTraversal to obtain vertical order
verticalOrderTraversal(root, 0); //consider root at 0;

//Print the Vertical Order
printVerticalOrderTraversal();
