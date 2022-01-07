package com.gdsacks.hr;

public class ProblemOne {

    public static void main(String[] args) {

        nonRepeatingDigitProductCount(2,10,20);
    }


    // Complete the nonRepeatingDigitProductCount function below.
    static int nonRepeatingDigitProductCount(int x, int y, int z) {
        int ans=0;

        for(int i=y;i<=z;i++) {
            int pod= Math.multiplyExact(i, x);
            String iArr=String.valueOf(i);
            char[] arr = String.valueOf(pod).toCharArray();
            boolean match = false;
            for(Character ch: arr) {
                if(iArr.indexOf(ch) !=-1) {
                    match=true;
                }
            }
            if(!match) {
                ans++;
            }

        }

        return ans;

    }

    static String secureChannel(int operation, String message, String key) {
        if (operation == 1) {
            if (message.length() == 0 || key.length() == 0)
                return "-1";

            StringBuilder builder = new StringBuilder();
            int i = 0, j = 0;
            int messageLength = message.length();
            int keyLength = key.length();

            while (i < messageLength && j < keyLength) {
                char character = message.charAt(i);
                int repeat = key.charAt(j) - '0';
                for (int k = 0; k < repeat; k++) {
                    builder.append(character);
                }
                i++;
                j++;
            }
            if (i != messageLength) {
                builder.append(message.substring(i));
            }

            return builder.toString();
        } else {
            if (message.length() == 0 || key.length() == 0)
                return "";

            StringBuilder builder = new StringBuilder();
            int i = 0, j = 0;
            int messageLength = message.length();
            int keyLength = key.length();

            while (j < keyLength) {
                char mainChar = message.charAt(i);
                builder.append(mainChar);
                i = i + key.charAt(j) - '0';
                j++;
            }

            builder.append(message.substring(i));
            return builder.toString();

        }



    }



}
