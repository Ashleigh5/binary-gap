import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Simple binary string
        String binary = "1001";
        int count = 0;
        char[] binaryArray = binary.toCharArray();
        for (int i = 0; i <= binaryArray.length-1; i++){
            if (binaryArray[i] == '0') {
                count = count + 1;
            }
        }
        System.out.println(count);

        // Complex binary string
        String binaryTwo = "110010000100";
        int countTwo = 0;
        int largestGap = 0;
        char[] binaryArrayTwo = binaryTwo.toCharArray();
        for (int i = 0; i <= binaryArrayTwo.length-1; i++) {
            if (binaryArrayTwo[i] == '0') {
                countTwo = countTwo + 1;
            } else if (binaryArrayTwo[i] == '1') {
                if (largestGap < countTwo) {
                    largestGap = countTwo;
                }
                countTwo = 0;
            }
        }
        System.out.println(largestGap);

        // Different solution for binary string
        String binaryThree = "110010000100";
        int countThree = 0;
        List<Integer> gaps = new ArrayList<>();
        char[] binaryArrayThree = binaryThree.toCharArray();
        for (int i = 0; i < binaryArrayThree.length; i++) {
            if (binaryArrayThree[i] == '0') {
                countThree = countThree + 1;
            } else {
                gaps.add(countThree);
                countThree = 0;
            }
        }
        System.out.println(Collections.max(gaps));

    }
}
