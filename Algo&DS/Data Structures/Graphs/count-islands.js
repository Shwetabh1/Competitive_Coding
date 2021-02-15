/*
 *Count the Islands
 *Given a matrix of 1 and 0 count the total number of islands in it.
 *A group of connected numebr of 1 makes an island 
 */
//Indexes for all 8 nodes of a point.
let rowNum = [-1,-1,-1,0,0,1,1,1];
let colNum = [-1,0,1,-1,1,-1,0,1];

//This checks whether point is safe for accessing and is unvisited
function isSafe(map, i, j, visited) {
	if (i>=0 && j>=0 && i<map.length && j<map[0].length && map[i][j] === 1 && visited[i][j] === 0) {
		return true;
	} else {
		return false;
	}
}

//The depth first traversal
function DFS(map, i, j, visited) { //recursively check for all 8 neighbours of a point.
	visited[i][j] = 1;
	for (let k=0; k< rowNum.length; k++) {
		if (isSafe(map, i+rowNum[k], j+colNum[k], visited)) {
			DFS(map, i+rowNum[k], j+colNum[k], visited) //call DFS on the same
		}
	}
}

function countIslands(map) {
	let length  = map.length;
	let breadth = map[0].length;
	let visited = []; //stores if a certain point is visited or not.
	for (let i=0; i<length; i++) {
		visited[i] = [];
		for(let j=0; j<breadth; j++) {
			visited[i][j] = 0;
		}
	}
	let count = 0;
	for (let i=0; i<length; i++) {
		for(let j=0; j<breadth; j++) {
			if(!visited[i][j] && map[i][j] == 1) {
				DFS(map,i,j,visited); //objects are passed by value in JS
				count++;
			}
		}
	}
	return count;
}

//consider the following input

var mapOfIsland = [ [1, 1, 0, 0, 0],
        		    [0, 1, 0, 0, 1],
        		    [1, 0, 0, 1, 1],
        			[0, 0, 0, 0, 0],
        			[1, 0, 1, 0, 1]	];

console.log(countIslands(mapOfIsland));