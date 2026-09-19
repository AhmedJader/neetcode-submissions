class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length -1;

        while(left<right){
            char temp = s[left];
            s[left] = s[right];//make left side the right side
            s[right] = temp;//make right side the temp value on the left 

            //we stored a temp because the second we change one side
            //we will lose that side for the other, so we need a temp
            //placeholder

            left++;
            right--;
        } 
    }
}