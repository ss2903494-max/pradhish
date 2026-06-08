void main(){
    int[] arr = {87,32,44,89,32};
    System.out.println(arr[4]);
    for(int i=0;i<=4;i++) {
        System.out.println(arr[i]);
        int val = arr[i];
        if (val >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}