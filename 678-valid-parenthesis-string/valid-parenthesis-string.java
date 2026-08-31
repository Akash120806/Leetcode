class Solution {
    public boolean checkValidString(String s) {
        int max =0,  min =0;
        for(int i =0;i<s.length();i++){
            char st = s.charAt(i);
            if(st=='('){
                min++;
                max++;
            }
            else if(st==')'){
                min--;
                max--;
            }
            else{
                min--;
                max++;
            }
            if(max<0)return false;
            if(min<0)min=0;
        }
        return min==0;


    }
}