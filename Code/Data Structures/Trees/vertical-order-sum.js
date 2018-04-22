/*
 * Find the vertical order traversal of a given tree.
 * Travel the tree in level order and maintain an array for every level.
 * calculate the sum
 */
let arr = [];

function verticalOrderTraversal(root, verticalLevel) {
 	if (root !=null) {
 		let tempArr = arr[verticalLevel];
 		tempArr.push(root.data);
 		arr[verticalLevel] = tempArr;
 		verticalOrderTraversal(root.left, verticalLevel - 1);
 		verticalOrderTraversal(root.right, verticalLevel + 1);
 	}
 }

function calculateVerticalOrderTraversal() {
	let keys = Object.keys(arr); //the keys might not be in increasing or decreasing order.
	keys.sort(function(a,b){return a-b}); // the default sort function in javascript is for strings.
	for (let i=0; i<keys.length; i++) {
		let sum = 0;
		arr[key[i]].forEach(function(val, index){
			sum += val;
		})
		console.log('vertical level ', key[i], 'has sum = ', sum);
	}
}

//Call verticalOrderTraversal to obtain vertical order
verticalOrderTraversal(root, 0); //consider root at 0;

//Print the Vertical Order
calculateVerticalOrderTraversal();
