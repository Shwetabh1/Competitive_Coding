//Trie Implementation


class Trie {
	function TrieNode(){
		this.children = {};
		this.endOfWord = false;
	}
	constructor(){
		this.root = TrieNode();
	}
}

var prefixTree = new Trie();
console.log(prefixTree.root);
