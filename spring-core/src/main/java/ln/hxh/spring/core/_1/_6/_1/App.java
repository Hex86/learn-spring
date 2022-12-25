package ln.hxh.spring.core._1._6._1;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    @Test
    public void test0() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ln/hxh/spring/core/_1/_6/_1/applicationContext1.xml");
        ctx.start();
        ctx.stop();
    }

    @Test
    public void test1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ln/hxh/spring/core/_1/_6/_1/applicationContext2.xml");
        ctx.start();
        ctx.stop();
    }

    @Test
    public void test3() {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ln/hxh/spring/core/_1/_6/_1/applicationContext3.xml");

        // add a shutdown hook for the above context...
        ctx.registerShutdownHook();

        // app runs here...


        // main method exits, hook is called prior to the app shutting down...
    }
}
