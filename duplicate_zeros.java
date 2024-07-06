package Java_Practice_codes;

public class duplicate_zeros {
    
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                
                if (i + 1 < n) { 
                    arr[i + 1] = 0;
                }
                i++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        
        duplicate_zeros dz = new duplicate_zeros();
        dz.duplicateZeros(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
