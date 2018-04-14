import org.junit.Assert;
import org.junit.Test;


public class test1 {
    @Test
    public void main() {
        Assert.assertEquals(true, palindrome.isPalindrome("Deleveled"));
        Assert.assertEquals(false, palindrome.isPalindrome("abcd"));
    }
}
