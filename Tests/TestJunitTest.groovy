/**
 * Created by Tony on 21/12/2018.
 */
import TestJunit;
import org.junit.Assert;
import org.junit.Test;
class TestJunitTest extends GroovyTestCase {
    TestJunit jtest = new TestJunit();
    void testTest() {

        jtest.setTest(10);
        Assert.assertEquals(10, jtest.test());
        Assert.assertEquals("This is not 10!!!",10, jtest.test());

        System.out.println("Unit test1 finished without error.");
    }

    void testTest3() {
        //TestJunit jtest = new TestJunit();

        Assert.assertEquals(10, jtest.test());
        Assert.assertEquals("This is not 10!!!",10, jtest.test());

        System.out.println("Unit test 3 finished without error.");
    }
}
