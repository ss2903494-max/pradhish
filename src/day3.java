void main(){
    int[] arr = {87,32,44,89,32};
    System.out.println("Pass mark: ");
    for (int i=0;i<=4;i++){
        int val=arr[i];
        if(val > 40){
            System.out.println(val+" ");

        }
    }
    System.out.println("\nFail mark: ");
    for (int i=0;i<=4;i++){
        int val=arr[i];
        if(val < 40){
            System.out.println(val+" ");
        }
    }
}
