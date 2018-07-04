/*
 * Find all pairs of 3 numbers whose sum is 0
 */
let arr1 = [1,1,1,1,1,1,,1];
let arr2 = [1,0,-1,2,-2,3,4,5,6];
let arr3 = [999,1000,-1000,0,-1,-998,1];

function find3Sum (array) {
	array.sort();

	let len = array.length;
	for (let i=0;i<len-2;i++){
		let left = i+1;
		let right = len - 1;
		let x = array[i];
		var cunt = 0;
		while(left<right) {
			if (x + array[left] + array[right] === 0) {
				console.log('Pair: ', x, array[left], array[right]);
				break;
			}
			if (x + array[left] + array[right] < 0) {
				left++;
			} else {
				right--;
			}
		}

	}
}

find3Sum(arr1);
find3Sum(arr2);
find3Sum(arr3);
