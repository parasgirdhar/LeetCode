class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans = 0;
        long get = 0;
      
         
for(int i=0;i<nums.length;i++){
    nums[i] = nums[i]*nums[i];
}
       
         Arrays.sort(nums);
         
        int start = 0;
        int end = nums.length-1;


        while(start <= end){
            
        if(start == end){
             ans = nums[start];    
            }else{
            ans = nums[end] - nums[start];
            }
       
            get = get + ans ;      
            
          start++;
            end--;
           
        }  

        return get;

    }
}