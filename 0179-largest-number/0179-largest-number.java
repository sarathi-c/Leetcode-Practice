class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] strNums=new String[n];
        for(int i=0;i<n;i++){
            strNums[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(strNums,(a,b)->(b+a).compareTo(a+b));
        if(strNums[0].equals("0")) return "0";

        StringBuilder sb=new StringBuilder();
        for(String s:strNums){
            sb.append(s);
        } 
        return sb.toString();
    }
}