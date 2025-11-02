package Day_8.Smallest_Letter_Greater_Than_Target;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length -1;

        while(left <= right){
            int mid = left + (right - left) /2;

            if(letters[mid] <= target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        // Remember about left here
        // we are looking for the first bigger
        // element
        return letters[left %letters.length];
    }
}