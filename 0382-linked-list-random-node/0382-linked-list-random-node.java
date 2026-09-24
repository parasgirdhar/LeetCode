
class Solution {

ArrayList <Integer> al = new ArrayList<>();

    public Solution(ListNode head) {

       while(head != null){

       al.add(head.val);
       head = head.next;

       }

       }        
    
    
    public int getRandom() {
        int p =(int)(Math.random() * al.size());
        return al.get(p);
        
    }
}


 