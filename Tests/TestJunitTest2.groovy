
import TestJunit;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Tony on 21/12/2018.
 */
class TestJunitTest2 extends GroovyTestCase {
   void testTest() {
        TestJunit jtest = new TestJunit();
        Assert.assertEquals(10, jtest.test());
        Assert.assertEquals("This is not 10!!!",10, jtest.test());

        System.out.println("Unit test 2 finished without error.");
    }
}
