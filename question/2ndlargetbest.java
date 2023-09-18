class Solution {
     public static void main(String[] args) {
        int[]arr={5,6,3,2,1,8};
        int l =arr[0];
        int sl=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
        }System.out.println(sl); 
    }
}
