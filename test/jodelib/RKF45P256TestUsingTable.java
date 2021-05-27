/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodelib;

import jodelib.RKF45OdeFunction;
import jodelib.RKF45Step;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author owner
 *
 * See: http://maths.cnam.fr/IMG/pdf/RungeKuttaFehlbergProof.pdf
 *
 * See: Numerical Analysis ISBN 0-87150-243-7 Page 254
 *
 */
public class RKF45P256TestUsingTable implements RKF45OdeFunction {

   public RKF45P256TestUsingTable() {
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

  
   @Test
   public void testP256UsingTable() {

      boolean skip = false;

      if (skip == false) {

         double ti[] = {
            0.0200000000,
            0.043596418,
            0.087808635,
            0.13250283,
            0.17769175,
            0.22338635,
            0.26959794,
            0.31633823,
            0.36361935,
            0.41145383,
            0.45985460,
            0.50883508,
            0.55840918,
            0.60859131,
            0.65939640,
            0.71083996,
            0.76293802,
            0.81570724,
            0.86916494,
            0.92332914,
            0.97821850
         };

         assertEquals("ERROR: ti does not have 21 elements", ti.length, 21);

         double hi[] = {
            0.020000000,
            0.043596418,
            0.044212217,
            0.044694196,
            0.045188922,
            0.045604592,
            0.046211599,
            0.046740288,
            0.047281116,
            0.047834478,
            0.048400773,
            0.048980477,
            0.049574103,
            0.050182129,
            0.050805086,
            0.051443564,
            0.052098061,
            0.052769220,
            0.053457703,
            0.054164193,
            0.054889365
         };

         assertEquals("ERROR: hi does not have 21 elements", hi.length, 21);

         double y4i[] = {
            1.0187303,
            1.0009367,
            1.0037448,
            1.0084033,
            1.0148922,
            1.0231921,
            1.0332844,
            1.0451511,
            1.0587751,
            1.0741399,
            1.0912300,
            1.1100306,
            1.1305277,
            1.1527081,
            1.1765598,
            1.2020714,
            1.2292324,
            1.2580336,
            1.2884665,
            1.3205237,
            1.3541988
         };

         assertEquals("ERROR: y4i does not have 21 elements", y4i.length, 21);

         double y5i[] = {
            1.0187307,
            1.0009367,
            1.0037448,
            1.0084033,
            1.0148922,
            1.0231921,
            1.0332844,
            1.0451511,
            1.0587751,
            1.0741399,
            1.0912300,
            1.1100306,
            1.1305277,
            1.1527081,
            1.1765598,
            1.2020714,
            1.2292324,
            1.2580336,
            1.2884665,
            1.3205237,
            1.3541988
         };

         assertEquals("ERROR: y5i does not have 21 elements", y5i.length, 21);

         double si[] = {
            0.21798209,
            1.0141250,
            1.0109015,
            1.0110691,
            1.0111901,
            1.0113144,
            1.0114406,
            1.0115709,
            1.0117036,
            1.0118387,
            1.0119771,
            1.0121197,
            1.0122650,
            1.0124139,
            1.0125672,
            1.0127226,
            1.0128826,
            1.0130471,
            1.0132159,
            1.0133884,
            1.0135657
         };

         assertEquals("ERROR: si does not have 21 elements", si.length, 21);

         double yi[] = {
            1.0187308,
            1.0009367,
            1.0037448,
            1.0084033,
            1.0148922,
            1.0231921,
            1.0332844,
            1.0451511,
            1.0587751,
            1.0741399,
            1.0912300,
            1.1100306,
            1.1305277,
            1.1527081,
            1.1765598,
            1.2020714,
            1.2292324,
            1.2580336,
            1.2884665,
            1.3205237,
            1.3541988
         };

         assertEquals("ERROR: si does not have 21 elements", si.length, 21);

         double a = 0.0d;
         double b = 1.0d;
         double ya = 0.0d;
         double e = Double.parseDouble("1.0E-8");

         double h = 0.02d; //Math.pow(e, 0.25d); //0.02d; //0.2d;
         double t = a;
         double y = ya;

         RKF45Step step = new RKF45Step();

//         for (int i = 0; i < ti.length; i++) {
         for (int i = 0; i < 1; i++) {
            step.calcu1ate(hi[i], ti[i], y, this, e);

            System.out.println("i = " + i);

            System.out.println("ti[" + i + "] = " + ti[i]);
            System.out.println("step.getT()   = " + step.getT());

            System.out.println("hi[" + i + "] = " + hi[i]);
            System.out.println("step.getH()   = " + step.getH());

            System.out.println("y4i[" + i + "] = " + y4i[i]);
            System.out.println("step.getY4()   = " + step.getY4());

            System.out.println("y5i[" + i + "] = " + y5i[i]);
            System.out.println("step.getY5()   = " + step.getY5());

            System.out.println("si[" + i + "] = " + si[i]);
            System.out.println("step.getS()   = " + step.getS());

            System.out.println("yi[" + i + "] = " + yi[i]);
            System.out.println("this.fty(ti[i], y) = " + this.fty(ti[i], y));

            y = yi[i];

            System.out.println("\n");
         }
      }

      System.out.println("skip = " + skip);

      assertEquals("ERROR: RKF45 not working!", 0.1d, 0.25d, 0.0d);

   }

}
