// find unique character in javascript

function findUniqueString(str) {
    let strDict = {}
    for (let i=0; i<str.length; i++) {
        if (strDict[str[i]]) {
            return "NON_UNIQUE"
        }
        else {
            strDict[str[i]] = 1
        }
    }
    return "UNIQUE"
}

console.log(findUniqueString(''))
console.log(findUniqueString('AA'))
console.log(findUniqueString('AAAAAAAAAAAAAAAAAAAAAAAAA'))
console.log(findUniqueString('ABCDEFGHIJKLMNOPQRSTUVWXYZ'))
console.log(findUniqueString(''))
console.log(findUniqueString('AA'))
console.log(findUniqueString('X'))