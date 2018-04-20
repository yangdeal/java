import org.junit.Assert;
import org.junit.Test;

public class dotComTest {
    @Test
    public void test1() {
//        String com[] = {"1", "2", "3"};
//        String guess = "1";
        dotCom testDotCom = new dotCom();

        Assert.assertEquals("hit", testDotCom.check("1"));
        Assert.assertEquals("missed", testDotCom.check("10"));
        Assert.assertEquals("hit", testDotCom.check("2"));
        Assert.assertEquals("killed", testDotCom.check("3"));
    }
}
