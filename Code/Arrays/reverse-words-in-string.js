/*
 * Given a String reverse the words in it.
 * EXAMPLE: "How deep    is     your Love?"
 * OUTPUT : "woH peed si ruoy evoL"
 * trim the whitespaces if it exists
 * I have used native Javscript library funtions.
 * JavaScript strings are immutable, meaning the memory allocated to each cannot be written to, making true "in place" reversals impossible .
 */ 

let reverse = function(str) {
    return str.split("").reverse().join("");
}

let reverseWords = function(str) {
	let auxStr = str.split(/\s+/);
	auxStr.forEach(function(word,index) {
		auxStr[index] = reverse(word); 
	})

	return auxStr.join(" ");
}

let string1 = "How deep is your Love?"
let string2 = "DC is better than             Marvel.      "

console.log(reverseWords(string1));
console.log(reverseWords(string2));
