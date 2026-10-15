public class Main{
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int[] count = new int[6];
        int c = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == 1){
                c += 1;
                count[i] = c;

            }
            else {
                c = 0;
                count[i] = c;
            }
        }

        int highest = count[0];
        for(int i = 0; i<n; i++) {
            if(count[i] > highest) {
                highest = count[i];
            }
        }
        return highest;
    }

    void main() {
        int[] arr = {1,1,0,1,1,1};
        int result = findMaxConsecutiveOnes(arr);
        System.out.println("Max Consecutive Ones: " + result);
    }
}