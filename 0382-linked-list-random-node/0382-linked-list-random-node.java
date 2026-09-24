
import java.util.*;

class Solution {

    ArrayList<Integer> list = new ArrayList<>();

    public Solution(ListNode head) {

        // Store all node values
        ListNode current = head;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
    }

    public int getRandom() {

        // Generate a random index
        int index = (int)(Math.random() * list.size());

        return list.get(index);
    }
}