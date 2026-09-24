
public class Solution {
    public ListNode detectCycle(ListNode head) {

ListNode fast = head;
ListNode slow = head;


   if(head == null || head.next == null){
    return null;
   }

      while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;

             if(slow == fast){
                break;
             }
      }

       if(slow != fast){
        return null;
       }

       ListNode p = head;

       while(p != slow){
        p = p.next;
        slow = slow.next;
       } 
       return p;



    }
}