public class palindrome {
    public static boolean isPalindrome(String word) {
        String rWord = "";
        int j = word.length();
        for (int i = j - 1; i >= 0; i--) {
            rWord = rWord + word.charAt(i);
        }
        return rWord.toLowerCase().equals(word.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(palindrome.isPalindrome("Deleveled"));
    }
}