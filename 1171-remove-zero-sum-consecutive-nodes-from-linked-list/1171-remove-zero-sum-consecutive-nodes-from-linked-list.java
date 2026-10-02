
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        
   int prefixsum = 0;
   
    HashMap <Integer , ListNode> ref = new HashMap<>();

ListNode dummy = new ListNode(0);
       dummy.next = head;
    
       ListNode temp = dummy ;

       while(temp != null){
   
    prefixsum = prefixsum + temp.val;

        ref.put(prefixsum , temp);       
         temp = temp.next ;

       }

           prefixsum = 0;
           temp = dummy;

 while(temp != null){

        prefixsum = prefixsum + temp.val ;

      temp.next = ref.get(prefixsum).next;      

         temp = temp.next ;

       }

return dummy.next ;
      
    }
}