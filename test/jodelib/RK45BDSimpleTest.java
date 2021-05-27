/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodelib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;

/**
 *
 * @author owner
 */
public class RK45BDSimpleTest implements RKF45BDOdeFunction {

   public RK45BDSimpleTest() {
   }

   @BeforeClass
   public static void setUpClass() {
   }

   @AfterClass
   public static void tearDownClass() {
   }

   @Before
   public void setUp() {
   }

   @After
   public void tearDown() {
   }

   public static BigDecimal C = new BigDecimal(10.0d);

   public BigDecimal fty(BigDecimal t, BigDecimal y) {
      BigDecimal r;
      r = C;
      return r;
   }

   /**
    * Test of Solution to problem on Page 254 constants.
    */
   @Test
   public void testSimple() {

      boolean skip = false;

      if (skip == false) {

         BigDecimal a = new BigDecimal(0.0d);
         BigDecimal b = new BigDecimal(1.0d);;
         BigDecimal ya = new BigDecimal(0.0d);
         BigDecimal e = new BigDecimal("1.0E-3");

         BigDecimal h = new BigDecimal((b.subtract(a)).doubleValue() / 10.0d);
         BigDecimal t = a;
         BigDecimal y = ya;

         RKF45BDStep step = new RKF45BDStep();
         int i = 0;
         int m = 0;

         //
         // Run to before b
         //
         while ((m < 100) && ((t.add(h).doubleValue() <= b.doubleValue())) ) {
            System.out.println("i = " + i);
            System.out.println("m = " + m);
            System.out.println("h = " + h);
            System.out.println("t = " + t);
            System.out.println("b = " + b);
            System.out.println("e = " + e);
            step.calcu1ate(h, t, y, this, e);
            System.out.println(step.toString() + "\n\n");

            //if (!step.isRejected()) {
            //   System.out.println("Step is accepted.");
            i = i + 1;
            t = t.add(h);
            y = step.getY4();
            //}

            // TODO: modify step size h!!!
            // h = h * step.getS();
            m = m + 1;
         }
//
// Run at b Needed?
//
/*
         System.out.println("i = " + i);
         System.out.println("m = " + m);
         System.out.println("h = " + h);
         System.out.println("t = " + t);
         System.out.println("b = " + b);
         System.out.println("e = " + e);
         step.calcu1ate(h, t, y, this, e);
         System.out.println(step.toString() + "\n\n");
          */

         System.out.println("i = " + i);
         System.out.println("m = " + m);
         System.out.println("h = " + h);
         System.out.println("t = " + t);
         System.out.println("b = " + b);
         System.out.println("e = " + e);

      }
      /*
      if (t > b) {
         h = b - t;
      }
       */

      System.out.println("skip = " + skip);

      //assertEquals("ERROR: RKF45 not working!", 0.1d, 0.25d, 0.0d);
   }

}
