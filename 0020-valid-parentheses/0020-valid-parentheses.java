class Solution {
    public boolean isValid(String s) {
        
Stack <Character>  ch = new Stack <>();

char  ref [] = s.toCharArray();

     for(int i=0;i<ref.length;i++){
        if(ref[i] == '[' || ref[i] == '{' || ref[i] == '('){
            ch.push(ref[i]);
        }
            else{
                 if(!ch.isEmpty()){
                       char top =  ch.peek();
                      
                      if(ref[i]==']' && top=='[' || ref[i]=='}' && 
                      top=='{' || ref[i]==')' && top=='('){
                        ch.pop();
                      }
                    else{
                        return false;
                    }


                 } else{
                      return false;
                 }
          }

     }
     if(ch.isEmpty()){
        return true;
     }else{
        return false;
     }

    }
}