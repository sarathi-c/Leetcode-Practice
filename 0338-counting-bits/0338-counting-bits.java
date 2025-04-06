class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<n+1;i++){
            String b=Integer.toBinaryString(i);
            int count=0;
            for(int j:b.toCharArray()){
                if(j=='1'){
                    count++;
                }
            }
            arr[i]=count;
        }
    return arr;
    }
}