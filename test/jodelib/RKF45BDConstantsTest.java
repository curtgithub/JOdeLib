/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodelib;

import static java.math.RoundingMode.HALF_UP;
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
public class RKF45BDConstantsTest {

   public RKF45BDConstantsTest() {
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

      assertEquals("BDK20 is incorrect!", RKF45BDConstants.BDK20.doubleValue(), 0.25d, 0.0d);
      assertEquals("BDK21 is incorrect!", RKF45BDConstants.BDK21.doubleValue(), 0.25d, 0.0d);

      assertEquals("BDK30 is incorrect!", RKF45BDConstants.BDK30.doubleValue(), 0.375d, 0.0d);
      assertEquals("BDK31 is incorrect!", RKF45BDConstants.BDK31.doubleValue(), 0.09375d, 0.0d);
      assertEquals("BDK32 is incorrect!", RKF45BDConstants.BDK32.doubleValue(), 0.28125d, 0.0d);

      assertEquals("BDK40 is incorrect!", RKF45BDConstants.BDK40.doubleValue(), 0.92307692307692307692307692307692d, 0.0d);
      assertEquals("BDK41 is incorrect!", RKF45BDConstants.BDK41.doubleValue(), 0.87938097405553026854802002730997d, 0.0d);
      assertEquals("BDK42 is incorrect!", RKF45BDConstants.BDK42.doubleValue(), -3.2771961766044606281292671825216d, 0.0d);
      assertEquals("BDK43 is incorrect!", RKF45BDConstants.BDK43.doubleValue(), 3.3208921256258534365043240782886d, 0.0d);

      assertEquals("BDK50 is incorrect!", RKF45BDConstants.BDK50.doubleValue(), 1.0d, 0.0d);
      assertEquals("BDK51 is incorrect!", RKF45BDConstants.BDK51.doubleValue(), 2.0324074074074074074074074074074d, 0.0d);
      assertEquals("BDK52 is incorrect!", RKF45BDConstants.BDK52.doubleValue(), -8.0d, 0.0d);
      assertEquals("BDK53 is incorrect!", RKF45BDConstants.BDK53.doubleValue(), 7.1734892787524366471734892787524d, 0.0d);
      assertEquals("BDK54 is incorrect!", RKF45BDConstants.BDK54.doubleValue(), -0.20589668615984405458089668615984d, 0.0d);

      assertEquals("BDK60 is incorrect!", RKF45BDConstants.BDK60.doubleValue(), 0.5d, 0.0d);
      assertEquals("BDK61 is incorrect!", RKF45BDConstants.BDK61.doubleValue(), -0.2962962962962962962962962962963d, 0.0d);
      assertEquals("BDK62 is incorrect!", RKF45BDConstants.BDK62.doubleValue(), 2.0d, 0.0d);
      assertEquals("BDK63 is incorrect!", RKF45BDConstants.BDK63.doubleValue(), -1.3816764132553606237816764132554d, 0.0d);
      assertEquals("BDK64 is incorrect!", RKF45BDConstants.BDK64.doubleValue(), 0.45297270955165692007797270955166d, 0.0d);
      assertEquals("BDK65 is incorrect!", RKF45BDConstants.BDK65.doubleValue(), -0.275d, 0.0d);

      assertEquals("BDY4K1 is incorrect!", RKF45BDConstants.BDY4K1.doubleValue(), 0.11574074074074074074074074074074d, 0.0d);
      assertEquals("BDY4K3 is incorrect!", RKF45BDConstants.BDY4K3.doubleValue(), 0.54892787524366471734892787524366d, 0.0d);
      assertEquals("BDY4K4 is incorrect!", RKF45BDConstants.BDY4K4.doubleValue(), 0.53572299439161180199951231406974d, 0.0d);
      assertEquals("BDY4K5 is incorrect!", RKF45BDConstants.BDY4K5.doubleValue(), -0.2d, 0.0d);

      assertEquals("BDY5K1 is incorrect!", RKF45BDConstants.BDY5K1.doubleValue(), 0.11851851851851851851851851851852d, 0.0d);
      assertEquals("BDY5K3 is incorrect!", RKF45BDConstants.BDY5K3.doubleValue(), 0.51898635477582846003898635477583d, 0.0d);
      assertEquals("BDY5K4 is incorrect!", RKF45BDConstants.BDY5K4.doubleValue(), 0.50613149034201665780613149034202d, 0.0d);
      assertEquals("BDY5K5 is incorrect!", RKF45BDConstants.BDY5K5.doubleValue(), -0.18d, 0.0d);
      assertEquals("BDY5K6 is incorrect!", RKF45BDConstants.BDY5K6.doubleValue(), 0.03636363636363636363636363636364d, 0.0d);

      //
      // BigDeciaml
      //
      //
      // Division tests
      //
      assertEquals("K20ND is incorrect!", RKF45BDConstants.BDK20.doubleValue(), (RKF45BDConstants.BDK20N.divide(RKF45BDConstants.BDK20D)).doubleValue(), 0.0d);
      assertEquals("K21ND is incorrect!", RKF45BDConstants.BDK21.doubleValue(), (RKF45BDConstants.BDK21N.divide(RKF45BDConstants.BDK21D)).doubleValue(), 0.0d);

      assertEquals("K30ND  is incorrect!", RKF45BDConstants.BDK30.doubleValue(), (RKF45BDConstants.BDK30N.divide(RKF45BDConstants.BDK30D)).doubleValue(), 0.0d);
      assertEquals("K31ND  is incorrect!", RKF45BDConstants.BDK31.doubleValue(), (RKF45BDConstants.BDK31N.divide(RKF45BDConstants.BDK31D)).doubleValue(), 0.0d);
      assertEquals("K32ND  is incorrect!", RKF45BDConstants.BDK32.doubleValue(), (RKF45BDConstants.BDK32N.divide(RKF45BDConstants.BDK32D)).doubleValue(), 0.0d);

      assertEquals("K40ND  is incorrect!", RKF45BDConstants.BDK40.doubleValue(), (RKF45BDConstants.BDK40N.divide(RKF45BDConstants.BDK40D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("K41ND  is incorrect!", RKF45BDConstants.BDK41.doubleValue(), (RKF45BDConstants.BDK41N.divide(RKF45BDConstants.BDK41D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("K42ND  is incorrect!", RKF45BDConstants.BDK42.doubleValue(), (RKF45BDConstants.BDK42N.divide(RKF45BDConstants.BDK42D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("K43ND  is incorrect!", RKF45BDConstants.BDK43.doubleValue(), (RKF45BDConstants.BDK43N.divide(RKF45BDConstants.BDK43D, 30, HALF_UP)).doubleValue(), 0.0d);

      assertEquals("K50ND  is incorrect!", RKF45BDConstants.BDK50.doubleValue(), (RKF45BDConstants.BDK50N.divide(RKF45BDConstants.BDK50D)).doubleValue(), 0.0d);
      assertEquals("K51ND  is incorrect!", RKF45BDConstants.BDK51.doubleValue(), (RKF45BDConstants.BDK51N.divide(RKF45BDConstants.BDK51D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("K52ND  is incorrect!", RKF45BDConstants.BDK52.doubleValue(), (RKF45BDConstants.BDK52N.divide(RKF45BDConstants.BDK52D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("K53ND  is incorrect!", RKF45BDConstants.BDK53.doubleValue(), (RKF45BDConstants.BDK53N.divide(RKF45BDConstants.BDK53D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("K54ND  is incorrect!", RKF45BDConstants.BDK54.doubleValue(), (RKF45BDConstants.BDK54N.divide(RKF45BDConstants.BDK54D, 30, HALF_UP)).doubleValue(), 0.0d);

      assertEquals("K60ND  is incorrect!", RKF45BDConstants.BDK60.doubleValue(), (RKF45BDConstants.BDK60N.divide(RKF45BDConstants.BDK60D)).doubleValue(), 0.0d);
      assertEquals("K61ND  is incorrect!", RKF45BDConstants.BDK61.doubleValue(), (RKF45BDConstants.BDK61N.divide(RKF45BDConstants.BDK61D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("K62ND  is incorrect!", RKF45BDConstants.BDK62.doubleValue(), (RKF45BDConstants.BDK62N.divide(RKF45BDConstants.BDK62D)).doubleValue(), 0.0d);
      assertEquals("K63ND  is incorrect!", RKF45BDConstants.BDK63.doubleValue(), (RKF45BDConstants.BDK63N.divide(RKF45BDConstants.BDK63D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("K64ND  is incorrect!", RKF45BDConstants.BDK64.doubleValue(), (RKF45BDConstants.BDK64N.divide(RKF45BDConstants.BDK64D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("K65ND  is incorrect!", RKF45BDConstants.BDK65.doubleValue(), (RKF45BDConstants.BDK65N.divide(RKF45BDConstants.BDK65D)).doubleValue(), 0.0d);

      assertEquals("Y4K1ND  is incorrect!", RKF45BDConstants.BDY4K1.doubleValue(), (RKF45BDConstants.BDY4K1N.divide(RKF45BDConstants.BDY4K1D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("Y4K3ND  is incorrect!", RKF45BDConstants.BDY4K3.doubleValue(), (RKF45BDConstants.BDY4K3N.divide(RKF45BDConstants.BDY4K3D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("Y4K4ND  is incorrect!", RKF45BDConstants.BDY4K4.doubleValue(), (RKF45BDConstants.BDY4K4N.divide(RKF45BDConstants.BDY4K4D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("Y4K5ND  is incorrect!", RKF45BDConstants.BDY4K5.doubleValue(), (RKF45BDConstants.BDY4K5N.divide(RKF45BDConstants.BDY4K5D)).doubleValue(), 0.0d);

      assertEquals("Y5K1ND  is incorrect!", RKF45BDConstants.BDY5K1.doubleValue(), (RKF45BDConstants.BDY5K1N.divide(RKF45BDConstants.BDY5K1D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("Y5K3ND  is incorrect!", RKF45BDConstants.BDY5K3.doubleValue(), (RKF45BDConstants.BDY5K3N.divide(RKF45BDConstants.BDY5K3D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("Y5K4ND  is incorrect!", RKF45BDConstants.BDY5K4.doubleValue(), (RKF45BDConstants.BDY5K4N.divide(RKF45BDConstants.BDY5K4D, 30, HALF_UP)).doubleValue(), 0.0d);
      assertEquals("Y5K5ND  is incorrect!", RKF45BDConstants.BDY5K5.doubleValue(), (RKF45BDConstants.BDY5K5N.divide(RKF45BDConstants.BDY5K5D)).doubleValue(), 0.0d);
      assertEquals("Y5K6ND  is incorrect!", RKF45BDConstants.BDY5K6.doubleValue(), (RKF45BDConstants.BDY5K6N.divide(RKF45BDConstants.BDY5K6D, 30, HALF_UP)).doubleValue(), 0.0d);

   }

}
