import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ConvertNumbers {

	public static void main(String[] args) {
		int m = 4;
		int n = 9;
		Queue<node> st = new LinkedList<node>();
		node root = new node(4, 0);
		st.add(root);
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		while (st.peek() != null) {
			node curNode = st.remove();
			if (curNode.value == n) {
				System.out.println("Answer" + curNode.level);
				break;
			} // check for this level.
			if (curNode.value * 2 == n || curNode.value - 1 == n) {
				System.out.println("Answer" + (curNode.level + 1));
				break;
			} // check for next level
			if (curNode.value != n) {
				hm.put(curNode.value, 1);
			}

			if (hm.get(curNode.value - 1) == null && curNode.value >= 0) {
				node newNode = new node(curNode.value - 1, curNode.level + 1);
				st.add(newNode);
			}

			if (hm.get(curNode.value * 2) == null) {
				node newNode = new node((curNode.value * 2), (curNode.level + 1));
				st.add(newNode);
			}
		}

	}

}

class node {
	public int value;
	public int level;

	public node(int value, int level) {
		this.value = value;
		this.level = level;
	}

	public node() {
		this.value = 0;
		this.level = 0;
	}
}
