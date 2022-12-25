package ln.hxh.spring.core._1._8._1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    @Test
    public void test0() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ln/hxh/spring/core/_1/_8/_1/applicationContext1.xml");
        System.out.println(ctx.getBean("exampleBean"));
        ctx.registerShutdownHook();
//        ctx.close();
    }

    @Test
    public void test1() {

    }

    @Test
    public void test3() {

    }
}
