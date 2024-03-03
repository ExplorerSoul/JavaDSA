public class arrays_max {
    public static void main(String[] args) {
        int[] arr = {1,23,5,2,8,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2,5));
    }
    // max element in a range
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
            
        }
        return maxVal;
    }
    // imagine that arr is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
            
        }
        return maxVal;
    }
}
