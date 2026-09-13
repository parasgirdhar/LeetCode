
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head ;
         ListNode slow = head;
         ListNode previous = null;
       
                  if(head.next == null){
                    return null;
                  }

         while(fast != null && fast.next != null){
             previous = slow;
            slow = slow.next;
            fast = fast.next.next;
         }
          previous.next = slow.next;

          return head;

    }
}