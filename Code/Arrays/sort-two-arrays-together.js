/*
 * Given two arrays which contain length and breadth of the rectangle sort them in non-increasing order.
 * If length at two indices are same the sort them based on area of the rectangle.
 */

let length = [100,20,30,10,15,10,100,105];
let breadth = [1,2,3,4,,5,6,7,8];
let area = [];
//create object
area.sort(function(a,b){
    if (a.len > b.len) {
    return 1;
    } else if (a.len < b.len){
     return -1;
    } else if(a.len === b.len && a.bre > b.bre){
    return 1;
    } else {
        return 0;
    }
});

console.log(area);

