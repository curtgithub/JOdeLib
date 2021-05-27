/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodelib;

import java.math.BigDecimal;

/**
 *
 * @author owner
 *
 * See: http://maths.cnam.fr/IMG/pdf/RungeKuttaFehlbergProof.pdf
 *
 * See: Numerical Analysis ISBN 0-87150-243-7 Page 254
 */
public class RKF45BDConstants {

   
   //
   // BigDecimal constants
   //
   
   //
   // Constants with division
   //
   public static BigDecimal BDK20 = new BigDecimal(1.0d / 4.0d);
   public static BigDecimal BDK21 = new BigDecimal(1.0d / 4.0d);

   public static BigDecimal BDK30 = new BigDecimal(3.0d / 8.0d);
   public static BigDecimal BDK31 = new BigDecimal(3.0d / 32.0d);
   public static BigDecimal BDK32 = new BigDecimal(9.0d / 32.0d);

   public static BigDecimal BDK40 = new BigDecimal(12.0d / 13.0d);
   public static BigDecimal BDK41 = new BigDecimal(1932.0d / 2197.0d);
   public static BigDecimal BDK42 = new BigDecimal(-7200.0d / 2197.0d);
   public static BigDecimal BDK43 = new BigDecimal(7296.0d / 2197.0d);

   public static BigDecimal BDK50 = new BigDecimal(1.0d);
   public static BigDecimal BDK51 = new BigDecimal(439.0d / 216.0d);
   public static BigDecimal BDK52 = new BigDecimal(-8.0d);
   public static BigDecimal BDK53 = new BigDecimal(3680.0d / 513.0d);
   public static BigDecimal BDK54 = new BigDecimal(-845.0d / 4104.0d);

   public static BigDecimal BDK60 = new BigDecimal(1.0d / 2.0d);
   public static BigDecimal BDK61 = new BigDecimal(-8.0d / 27.0d);
   public static BigDecimal BDK62 = new BigDecimal(2.0d);
   public static BigDecimal BDK63 = new BigDecimal(-3544.0d / 2565.0d);
   public static BigDecimal BDK64 = new BigDecimal(1859.0d / 4104.0d);
   public static BigDecimal BDK65 = new BigDecimal(-11.0d / 40.0d);

   public static BigDecimal BDY4K1 = new BigDecimal(25.0d / 216.0d);
   public static BigDecimal BDY4K3 = new BigDecimal(1408.0d / 2565.0d);
   public static BigDecimal BDY4K4 = new BigDecimal(2197.0d / 4101.0d);
   public static BigDecimal BDY4K5 = new BigDecimal(-1.0d / 5.0d);

   public static BigDecimal BDY5K1 = new BigDecimal(16.0d / 135.0d);
   public static BigDecimal BDY5K3 = new BigDecimal(6656.0d / 12825.0d);
   public static BigDecimal BDY5K4 = new BigDecimal(28561.0d / 56430.0d);
   public static BigDecimal BDY5K5 = new BigDecimal(-9.0d / 50.0d);
   public static BigDecimal BDY5K6 = new BigDecimal(2.0d / 55.0d);

   //
   // Numerator and Denominator
   //
   public static BigDecimal BDK20N = new BigDecimal(1.0d);
   public static BigDecimal BDK20D = new BigDecimal(4.0d);
   public static BigDecimal BDK21N = new BigDecimal(1.0d);
   public static BigDecimal BDK21D = new BigDecimal(4.0d);

   public static BigDecimal BDK30N = new BigDecimal(3.0d);
   public static BigDecimal BDK30D = new BigDecimal(8.0d);
   public static BigDecimal BDK31N = new BigDecimal(3.0d);
   public static BigDecimal BDK31D = new BigDecimal(32.0d);
   public static BigDecimal BDK32N = new BigDecimal(9.0d);
   public static BigDecimal BDK32D = new BigDecimal(32.0d);

   public static BigDecimal BDK40N = new BigDecimal(12.0d);
   public static BigDecimal BDK40D = new BigDecimal(13.0d);
   public static BigDecimal BDK41N = new BigDecimal(1932.0d);
   public static BigDecimal BDK41D = new BigDecimal(2197.0d);
   public static BigDecimal BDK42N = new BigDecimal(-7200.0d);
   public static BigDecimal BDK42D = new BigDecimal(2197.0d);
   public static BigDecimal BDK43N = new BigDecimal(7296.0d);
   public static BigDecimal BDK43D = new BigDecimal(2197.0d);

   public static BigDecimal BDK50N = new BigDecimal(1.0d);  // Get rid of K50
   public static BigDecimal BDK50D = new BigDecimal(1.0d);
   public static BigDecimal BDK51N = new BigDecimal(439.0d);
   public static BigDecimal BDK51D = new BigDecimal(216.0d);
   public static BigDecimal BDK52N = new BigDecimal(-8.0d);
   public static BigDecimal BDK52D = new BigDecimal(1.0d); // Get rid of K52D
   public static BigDecimal BDK53N = new BigDecimal(3680.0d);
   public static BigDecimal BDK53D = new BigDecimal(513.0d);
   public static BigDecimal BDK54N = new BigDecimal(-845.0d);
   public static BigDecimal BDK54D = new BigDecimal(4104.0d);

   public static BigDecimal BDK60N = new BigDecimal(1.0d);
   public static BigDecimal BDK60D = new BigDecimal(2.0d);
   public static BigDecimal BDK61N = new BigDecimal(-8.0d);
   public static BigDecimal BDK61D = new BigDecimal(27.0d);
   public static BigDecimal BDK62N = new BigDecimal(2.0d);
   public static BigDecimal BDK62D = new BigDecimal(1.0d); // Get rid of K62D
   public static BigDecimal BDK63N = new BigDecimal(-3544.0d);
   public static BigDecimal BDK63D = new BigDecimal(2565.0d);
   public static BigDecimal BDK64N = new BigDecimal(1859.0d);
   public static BigDecimal BDK64D = new BigDecimal(4104.0d);
   public static BigDecimal BDK65N = new BigDecimal(-11.0d);
   public static BigDecimal BDK65D = new BigDecimal(40.0d);

   public static BigDecimal BDY4K1N = new BigDecimal(25.0d);
   public static BigDecimal BDY4K1D = new BigDecimal(216.0d);
   public static BigDecimal BDY4K3N = new BigDecimal(1408.0d);
   public static BigDecimal BDY4K3D = new BigDecimal(2565.0d);
   public static BigDecimal BDY4K4N = new BigDecimal(2197.0d);
   public static BigDecimal BDY4K4D = new BigDecimal(4101.0d);
   public static BigDecimal BDY4K5N = new BigDecimal(-1.0d);
   public static BigDecimal BDY4K5D = new BigDecimal(5.0d);

   public static BigDecimal BDY5K1N = new BigDecimal(16.0d);
   public static BigDecimal BDY5K1D = new BigDecimal(135.0d);
   public static BigDecimal BDY5K3N = new BigDecimal(6656.0d);
   public static BigDecimal BDY5K3D = new BigDecimal(12825.0d);
   public static BigDecimal BDY5K4N = new BigDecimal(28561.0d);
   public static BigDecimal BDY5K4D = new BigDecimal(56430.0d);
   public static BigDecimal BDY5K5N = new BigDecimal(-9.0d);
   public static BigDecimal BDY5K5D = new BigDecimal(50.0d);
   public static BigDecimal BDY5K6N = new BigDecimal(2.0d);
   public static BigDecimal BDY5K6D = new BigDecimal(55.0d);

}
