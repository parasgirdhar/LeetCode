class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap <Integer , Integer> ref = new HashMap<>() ;

                   int n = nums.length;

           for(int i=0 ; i<n; i++){
            ref.put(nums[i] , i);
           }
                  
                   int get = ref.size();

                   if(get == n){
                    return false; // means it dont contain duplicate ..
                   }else{
                    return true ; // It means it contain duplicate ...
                   }
 
    }
}