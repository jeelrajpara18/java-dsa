package Arrays.Easy;

public class FindNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};
        for(int i = 0 ; i < arr.length ; i++){
            boolean isNotRepeating = true;
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j] && i!=j){
                    isNotRepeating = false;
                    break;
                }
            }
            if(isNotRepeating){
                System.out.print(arr[i] + " ");
                break;
            }
        }
    }
}
