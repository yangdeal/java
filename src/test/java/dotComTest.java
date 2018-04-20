import org.junit.Assert;
import org.junit.Test;

public class dotComTest {
    @Test
    public void test1() {
        String com[] = {"1", "2", "3"};
        String guess = "1";
        Assert.assertEquals("hit", new dotCom().check(guess));
    }
}
