class Solution {
    public int titleToNumber(String columnTitle) {
        char[] c=columnTitle.toCharArray();
        int sum=0;
        for(char i:c){
            int num=i-'A'+1;
            sum=sum*26+num;
        }
        return sum;
    }
}