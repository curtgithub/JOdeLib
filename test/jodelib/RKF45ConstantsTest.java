/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodelib;

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
public class RKF45ConstantsTest {

   public RKF45ConstantsTest() {
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

   /**
    * Test of K constants.
    */
   @Test
   public void testKConsts() {

      assertEquals("K20 is incorrect!", RKF45Constants.K20, 0.25d, 0.0d);
      assertEquals("K21 is incorrect!", RKF45Constants.K21, 0.25d, 0.0d);

      assertEquals("K30 is incorrect!", RKF45Constants.K30, 0.375d, 0.0d);
      assertEquals("K31 is incorrect!", RKF45Constants.K31, 0.09375d, 0.0d);
      assertEquals("K32 is incorrect!", RKF45Constants.K32, 0.28125d, 0.0d);

      assertEquals("K40 is incorrect!", RKF45Constants.K40, 0.92307692307692307692307692307692d, 0.0d);
      assertEquals("K41 is incorrect!", RKF45Constants.K41, 0.87938097405553026854802002730997d, 0.0d);
      assertEquals("K42 is incorrect!", RKF45Constants.K42, -3.2771961766044606281292671825216d, 0.0d);
      assertEquals("K43 is incorrect!", RKF45Constants.K43, 3.3208921256258534365043240782886d, 0.0d);

      assertEquals("K50 is incorrect!", RKF45Constants.K50, 1.0d, 0.0d);
      assertEquals("K51 is incorrect!", RKF45Constants.K51, 2.0324074074074074074074074074074d, 0.0d);
      assertEquals("K52 is incorrect!", RKF45Constants.K52, -8.0d, 0.0d);
      assertEquals("K53 is incorrect!", RKF45Constants.K53, 7.1734892787524366471734892787524d, 0.0d);
      assertEquals("K54 is incorrect!", RKF45Constants.K54, -0.20589668615984405458089668615984d, 0.0d);

      assertEquals("K60 is incorrect!", RKF45Constants.K60, 0.5d, 0.0d);
      assertEquals("K61 is incorrect!", RKF45Constants.K61, -0.2962962962962962962962962962963d, 0.0d);
      assertEquals("K62 is incorrect!", RKF45Constants.K62, 2.0d, 0.0d);
      assertEquals("K63 is incorrect!", RKF45Constants.K63, -1.3816764132553606237816764132554d, 0.0d);
      assertEquals("K64 is incorrect!", RKF45Constants.K64, 0.45297270955165692007797270955166d, 0.0d);
      assertEquals("K65 is incorrect!", RKF45Constants.K65, -0.275d, 0.0d);

      assertEquals("Y4K1 is incorrect!", RKF45Constants.Y4K1, 0.11574074074074074074074074074074d, 0.0d);
      assertEquals("Y4K3 is incorrect!", RKF45Constants.Y4K3, 0.54892787524366471734892787524366d, 0.0d);
      assertEquals("Y4K4 is incorrect!", RKF45Constants.Y4K4, 0.53572299439161180199951231406974d, 0.0d);
      assertEquals("Y4K5 is incorrect!", RKF45Constants.Y4K5, -0.2d, 0.0d);

      assertEquals("Y5K1 is incorrect!", RKF45Constants.Y5K1, 0.11851851851851851851851851851852d, 0.0d);
      assertEquals("Y5K3 is incorrect!", RKF45Constants.Y5K3, 0.51898635477582846003898635477583d, 0.0d);
      assertEquals("Y5K4 is incorrect!", RKF45Constants.Y5K4, 0.50613149034201665780613149034202d, 0.0d);
      assertEquals("Y5K5 is incorrect!", RKF45Constants.Y5K5, -0.18d, 0.0d);
      assertEquals("Y5K6 is incorrect!", RKF45Constants.Y5K6, 0.03636363636363636363636363636364d, 0.0d);

      //
      // Division tests
      //
      assertEquals("K20ND is incorrect!", RKF45Constants.K20, RKF45Constants.K20N / RKF45Constants.K20D, 0.0d);
      assertEquals("K21ND is incorrect!", RKF45Constants.K21, RKF45Constants.K21N / RKF45Constants.K21D, 0.0d);

      assertEquals("K30ND  is incorrect!", RKF45Constants.K30, RKF45Constants.K30N / RKF45Constants.K30D, 0.0d);
      assertEquals("K31ND  is incorrect!", RKF45Constants.K31, RKF45Constants.K31N / RKF45Constants.K31D, 0.0d);
      assertEquals("K32ND  is incorrect!", RKF45Constants.K32, RKF45Constants.K32N / RKF45Constants.K32D, 0.0d);

      assertEquals("K40ND  is incorrect!", RKF45Constants.K40, RKF45Constants.K40N / RKF45Constants.K40D, 0.0d);
      assertEquals("K41ND  is incorrect!", RKF45Constants.K41, RKF45Constants.K41N / RKF45Constants.K41D, 0.0d);
      assertEquals("K42ND  is incorrect!", RKF45Constants.K42, RKF45Constants.K42N / RKF45Constants.K42D, 0.0d);
      assertEquals("K43ND  is incorrect!", RKF45Constants.K43, RKF45Constants.K43N / RKF45Constants.K43D, 0.0d);

      assertEquals("K50ND  is incorrect!", RKF45Constants.K50, RKF45Constants.K50N / RKF45Constants.K50D, 0.0d);
      assertEquals("K51ND  is incorrect!", RKF45Constants.K51, RKF45Constants.K51N / RKF45Constants.K51D, 0.0d);
      assertEquals("K52ND  is incorrect!", RKF45Constants.K52, RKF45Constants.K52N / RKF45Constants.K52D, 0.0d);
      assertEquals("K53ND  is incorrect!", RKF45Constants.K53, RKF45Constants.K53N / RKF45Constants.K53D, 0.0d);
      assertEquals("K54ND  is incorrect!", RKF45Constants.K54, RKF45Constants.K54N / RKF45Constants.K54D, 0.0d);

      assertEquals("K60ND  is incorrect!", RKF45Constants.K60, RKF45Constants.K60N / RKF45Constants.K60D, 0.0d);
      assertEquals("K61ND  is incorrect!", RKF45Constants.K61, RKF45Constants.K61N / RKF45Constants.K61D, 0.0d);
      assertEquals("K62ND  is incorrect!", RKF45Constants.K62, RKF45Constants.K62N / RKF45Constants.K62D, 0.0d);
      assertEquals("K63ND  is incorrect!", RKF45Constants.K63, RKF45Constants.K63N / RKF45Constants.K63D, 0.0d);
      assertEquals("K64ND  is incorrect!", RKF45Constants.K64, RKF45Constants.K64N / RKF45Constants.K64D, 0.0d);
      assertEquals("K65ND  is incorrect!", RKF45Constants.K65, RKF45Constants.K65N / RKF45Constants.K65D, 0.0d);

      assertEquals("Y4K1ND  is incorrect!", RKF45Constants.Y4K1, RKF45Constants.Y4K1N / RKF45Constants.Y4K1D, 0.0d);
      assertEquals("Y4K3ND  is incorrect!", RKF45Constants.Y4K3, RKF45Constants.Y4K3N / RKF45Constants.Y4K3D, 0.0d);
      assertEquals("Y4K4ND  is incorrect!", RKF45Constants.Y4K4, RKF45Constants.Y4K4N / RKF45Constants.Y4K4D, 0.0d);
      assertEquals("Y4K5ND  is incorrect!", RKF45Constants.Y4K5, RKF45Constants.Y4K5N / RKF45Constants.Y4K5D, 0.0d);

      assertEquals("Y5K1ND  is incorrect!", RKF45Constants.Y5K1, RKF45Constants.Y5K1N / RKF45Constants.Y5K1D, 0.0d);
      assertEquals("Y5K3ND  is incorrect!", RKF45Constants.Y5K3, RKF45Constants.Y5K3N / RKF45Constants.Y5K3D, 0.0d);
      assertEquals("Y5K4ND  is incorrect!", RKF45Constants.Y5K4, RKF45Constants.Y5K4N / RKF45Constants.Y5K4D, 0.0d);
      assertEquals("Y5K5ND  is incorrect!", RKF45Constants.Y5K5, RKF45Constants.Y5K5N / RKF45Constants.Y5K5D, 0.0d);
      assertEquals("Y5K6ND  is incorrect!", RKF45Constants.Y5K6, RKF45Constants.Y5K6N / RKF45Constants.Y5K6D, 0.0d);

      
   }

}
