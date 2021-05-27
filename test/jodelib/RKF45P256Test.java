/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodelib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author owner
 *
 * See: http://maths.cnam.fr/IMG/pdf/RungeKuttaFehlbergProof.pdf
 *
 * See: Numerical Analysis ISBN 0-87150-243-7 Page 254
 *
 */
public class RKF45P256Test implements RKF45OdeFunction {

   public RKF45P256Test() {
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

   public double fty(double t, double y) {
      double r;
      r = t - y + 1;
      return r;
   }

   /**
    * Test of Solution to problem on Page 254 constants.
    */
   @Test
   public void testP256() {

      boolean skip = false;

      if (skip == false) {

         double a = 0.0d;
         double b = 1.1d;
         double ya = 1.0d;
         double e = Double.parseDouble("1.0E-4");

         double h = 0.04d; //Math.pow(e, 0.25d); //0.02d; //0.2d;
         double t = a;
         double y = ya;

         RKF45Step step = new RKF45Step();
         int i = 0;
         int m = 0;
         while (m < 100 && (t + h) <= b) {

            System.out.println("i = " + i);
            System.out.println("m = " + m);
            System.out.println("h = " + h);
            System.out.println("t + h = " + (t + h));
            System.out.println("b = " + b);
            System.out.println("e = " + e);

            step.calcu1ate(h, t, y, this, e);

            System.out.println(step.toString() + "\n\n");

            //if (!step.isRejected()) {
            i = i + 1;
            t = t + h;
            y = step.getY4();
            //}

            // TODO: modify step size h!!!
            // h = h * step.getS();
            m = m + 1;
         }

         System.out.println("i = " + i);
         System.out.println("m = " + m);
         System.out.println("h = " + h);
         System.out.println("t + h = " + (t + h));
         System.out.println("b = " + b);
         System.out.println("e = " + e);

      }

      System.out.println("skip = " + skip);

      //assertEquals("ERROR: RKF45 not working!", 0.1d, 0.25d, 0.0d);

   }

   
}
