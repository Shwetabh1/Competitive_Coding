/*
 * Given an array of non-zero integers reach the end with minimum number of steps with atmost number of steps from i = a[i]
 * If a[i] equals 0 it can't move.
 * Also Look at JumpSteps.java for same solution in Java.
 */

let arr = [1, 2, 3, 4, 5, 6];
let len = arr.length;

let max = Number.MAX_SAFE_INTEGER;
let auxArr = [0,max,max,max,max,max];

function findMinSteps(arr) {
    let min = 0;
    for (let i=1; i<len; i++) {
        for (let j=0; j<len; j++){
            if (i-j <= arr[j] && (auxArr[j] + 1 < auxArr[i])) {
                auxArr[i] = auxArr[j]+1;
            }
        }
    }
}

findMinSteps(arr);

if (auxArr[len-1] === max) {
    console.log('brah, no solution for this.');
} else {
	console.log(auxArr[len-1]);
}

