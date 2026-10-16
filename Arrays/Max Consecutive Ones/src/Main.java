public class Main {
    static int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int currentCount = 0;
        int maxCount  = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                currentCount += 1;
                if(currentCount > maxCount) {
                    maxCount = currentCount;
                }
            }
            else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
    static void main() {
        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1};
        int result = findMaxConsecutiveOnes(arr);
        System.out.println("Max Consecutive Ones: " + result);
    }
}