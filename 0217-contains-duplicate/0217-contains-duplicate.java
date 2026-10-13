class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       HashSet <Integer> ref = new HashSet<>();

       for(int i= 0; i<nums.length; i++){
              if(ref.contains(nums[i])){
                return true;
              }else{
                ref.add(nums[i]);
              }
       }
               return false;
 
    }
}