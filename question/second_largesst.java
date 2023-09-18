class sndlargest {
    public static void main(String[] args) {
        int[]arr={5,6,3,2,1,8};
        int a=arr[0];
        int b=arr[0];
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }System.out.println(a);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>b && arr[i]!=a){
                b=arr[i];
            }
        }
        System.out.println(b);
    }
}
