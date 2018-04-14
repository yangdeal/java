import org.junit.Assert;
import org.junit.Test;

public class palindromeTest {
    @Test
    public void tes1() {
        Assert.assertEquals(true, palindrome.isPalindrome("Deleveled"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(false, palindrome.isPalindrome("abcd"));
    }
}