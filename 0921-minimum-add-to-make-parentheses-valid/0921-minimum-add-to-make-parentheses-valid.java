class Solution {
    public int minAddToMakeValid(String s) {
        

      Stack <Character> ref = new Stack<>();
         
           for(int i=0; i<s.length() ; i++){
             char ch = s.charAt(i);
            if(ch == ')'){
               if(!ref.isEmpty() && ref.peek() == '('){
                    ref.pop();
               }else{
                ref.push(ch);
               }
               }
               else{
                ref.push(ch);
               }
            
           }
           return ref.size();
    }
}