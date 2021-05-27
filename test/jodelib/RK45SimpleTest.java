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

/**
 *
 * @author owner
 */
public class RK45SimpleTest implements RKF45OdeFunction {

   public RK45SimpleTest() {
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

   public static double C = 10.0d; //Math.PI;

   public double fty(double t, double y) {
      double r;
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

         //double a = 0.0d;
         double a = 0.0d;
         //double b = 1.0d;
         double b = 1.0d;
         double ya = 0.0d;
         double e = Double.parseDouble("1.0E-3"); // TODO:  Why so high?

         //double h = (b - a) / 10.0d;
         double h = (b - a) / 10.0d;
         //double t = a;
         double t = a;
         double y = ya;

         RKF45Step step = new RKF45Step();
         int i = 0;
         int m = 0;

         //
         // Run to before b
         //
         while ((m < 100) && ((t + h) < b)) {
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
            t = t + h;
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
