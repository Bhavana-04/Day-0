class Solution{
    public static void convertToWave(int arr[], int n){
        // code here
        if(n==1){
            return;
        }
        for(int i=0;i<(n-1);i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}