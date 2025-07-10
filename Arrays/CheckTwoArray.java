package Arrays;

public class CheckTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 3, 1, 2};

        boolean isEqual = areEqual(arr1, arr2);
        System.out.println("Arrays are equal in frequency: " + isEqual);
    }
    static boolean areEqual(int[]arr1 , int[]arr2){
        if(arr1.length != arr2.length) return false;
        boolean[] visited = new boolean[arr1.length];
        for(int i = 0 ; i < arr1.length ; i++){
            int countA = 1; 
            if(visited[i] == true) continue;
            visited[i] = true;

            for(int j = 0 ; j < arr1.length ; j++){
                if(arr1[i] == arr1[j]){
                    visited[j] = true;
                    countA++;
                }
            }

            int countB = 0 ;
            for(int j = 0 ; j < arr2.length ; j++){
                if(arr1[i] == arr2[j]) countB++;
            }
            if(countA!=countB) return false;
        }
        return true;
    }
}
