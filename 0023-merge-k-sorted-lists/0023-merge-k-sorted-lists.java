
class Solution {

ListNode MergeSortedList(ListNode L1 , ListNode L2){
 
   if(L1 == null){
    return L2;
   }

   if(L2 == null){
    return L1 ;
   }


if(L1.val < L2.val){

 L1.next = MergeSortedList(L1.next , L2);
    return L1;

}else{

    L2.next = MergeSortedList(L2.next , L1);
   return L2;

    }
}

          ListNode Partition(int start , int end ,ListNode[] lists ){
          
           if(start > end){
            return null;
           }

           if(start == end){
            return lists[start];
           }

            int mid = start+(end - start)/2;

           ListNode Lx = Partition(start , mid , lists);
           ListNode Ly = Partition(mid+1 , end , lists);

           return MergeSortedList(Lx ,Ly);
             
         }
 


    public ListNode mergeKLists(ListNode[] lists) {
        
         int k = lists.length;

         if(k == 0){

            return null;

         }else{

            return  Partition(0 , k-1 , lists);

         }
               
    }
}