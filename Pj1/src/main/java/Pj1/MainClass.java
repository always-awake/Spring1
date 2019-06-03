package Pj1;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        TransportationWalk transportationWalk = new TransportationWalk();


        //GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

        //TransportationWalk transportationWalk = ctx.getBean("Pj1Walk", TransportationWalk.class);
        transportationWalk.move();

//        ctx.close();
    }
}
