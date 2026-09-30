
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
   if(head == null){
    return null;
   }


   if(head.next == null){
    return new TreeNode (head.val);
   }


ListNode prev_slow = null;
    ListNode slow = head;
    ListNode fast = head;
    

 while(fast!= null && fast.next != null){
     prev_slow = slow;
    slow = slow.next;
     fast = fast.next.next;
    
 }

           TreeNode root = new TreeNode(slow.val); // making new root ... which is equal to slow ...

         prev_slow.next = null;
           root.left = sortedListToBST(head);
           root.right = sortedListToBST(slow.next);

                      return root;

    }
}