package Tests;

/**
 * Created by Marina on 3.7.2017 г..
 */
public class Test52Task02 {
    public static void main(String[] args) {
        String str = "asdajkh TRE kdsjfh TeWEKLJ dsffs";
        String[] result = str.split(" ");
        float ratio = lowerUpperRatio(str);
        System.out.println(ratio);

    }

    static float lowerUpperRatio(String str) {
        int lowerCount = 0;
        int upperCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (Character.isUpperCase(currChar)) {
                upperCount++;
            } else if (Character.isLowerCase(currChar)) {
                lowerCount++;
            }
        }
        System.out.println(lowerCount);
        System.out.println(upperCount);
        float ratio=(float)lowerCount/upperCount;
        return ratio;
    }
}

