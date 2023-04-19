package by.tut.Lesson10;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("1xample: ");
        builder.append("first");
        builder.setCharAt(0, 'E');
        builder.insert(9, "First");
        builder.delete(15, 21);
        System.out.println(builder.indexOf("First"));
//        System.out.println(builder.replace(0,1,"abc"));
//        builder.reverse();
        builder.deleteCharAt(0);
        String result = builder.toString();
        System.out.println(builder.toString());

        String testCase = "This ababa not";
        System.out.println(isPalindrome(1, testCase));
        System.out.println(isPalindrome(2, testCase));
        System.out.println(isPalindrome(10, testCase));
        System.out.println(isPalindrome(3, testCase));
    }

    private static boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        return str.equals(builder.reverse().toString());
    }

    private static boolean isNewPalindrome(String str) {
        char[] arr = str.toCharArray();
        int size = arr.length / 2;
        for (int i = 0; i < size; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int number, String str) {
        String[] arr = str.split(" ");
        if (number > arr.length) {
            System.out.println("number is to long");
            return false;
        }
        return isNewPalindrome(arr[number - 1]);
    }
}

