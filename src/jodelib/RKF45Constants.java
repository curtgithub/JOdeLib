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
public class RKF45Constants {

   //
   // double constants
   //
   //
   // Constants with division
   //
   public static double K20 = 1.0d / 4.0d;
   public static double K21 = 1.0d / 4.0d;

   public static double K30 = 3.0d / 8.0d;
   public static double K31 = 3.0d / 32.0d;
   public static double K32 = 9.0d / 32.0d;

   public static double K40 = 12.0d / 13.0d;
   public static double K41 = 1932.0d / 2197.0d;
   public static double K42 = -7200.0d / 2197.0d;
   public static double K43 = 7296.0d / 2197.0d;

   public static double K50 = 1.0d;
   public static double K51 = 439.0d / 216.0d;
   public static double K52 = -8.0d;
   public static double K53 = 3680.0d / 513.0d;
   public static double K54 = -845.0d / 4104.0d;

   public static double K60 = 1.0d / 2.0d;
   public static double K61 = -8.0d / 27.0d;
   public static double K62 = 2.0d;
   public static double K63 = -3544.0d / 2565.0d;
   public static double K64 = 1859.0d / 4104.0d;
   public static double K65 = -11.0d / 40.0d;

   public static double Y4K1 = 25.0d / 216.0d;
   public static double Y4K3 = 1408.0d / 2565.0d;
   public static double Y4K4 = 2197.0d / 4101.0d;
   public static double Y4K5 = -1.0d / 5.0d;

   public static double Y5K1 = 16.0d / 135.0d;
   public static double Y5K3 = 6656.0d / 12825.0d;
   public static double Y5K4 = 28561.0d / 56430.0d;
   public static double Y5K5 = -9.0d / 50.0d;
   public static double Y5K6 = 2.0d / 55.0d;

   //
   // Numerator and Denominator
   //
   public static double K20N = 1.0d;
   public static double K20D = 4.0d;
   public static double K21N = 1.0d;
   public static double K21D = 4.0d;

   public static double K30N = 3.0d;
   public static double K30D = 8.0d;
   public static double K31N = 3.0d;
   public static double K31D = 32.0d;
   public static double K32N = 9.0d;
   public static double K32D = 32.0d;

   public static double K40N = 12.0d;
   public static double K40D = 13.0d;
   public static double K41N = 1932.0d;
   public static double K41D = 2197.0d;
   public static double K42N = -7200.0d;
   public static double K42D = 2197.0d;
   public static double K43N = 7296.0d;
   public static double K43D = 2197.0d;

   public static double K50N = 1.0d;  // Get rid of K50
   public static double K50D = 1.0d;
   public static double K51N = 439.0d;
   public static double K51D = 216.0d;
   public static double K52N = -8.0d;
   public static double K52D = 1.0d; // Get rid of K52D
   public static double K53N = 3680.0d;
   public static double K53D = 513.0d;
   public static double K54N = -845.0d;
   public static double K54D = 4104.0d;

   public static double K60N = 1.0d;
   public static double K60D = 2.0d;
   public static double K61N = -8.0d;
   public static double K61D = 27.0d;
   public static double K62N = 2.0d;
   public static double K62D = 1.0d; // Get rid of K62D
   public static double K63N = -3544.0d;
   public static double K63D = 2565.0d;
   public static double K64N = 1859.0d;
   public static double K64D = 4104.0d;
   public static double K65N = -11.0d;
   public static double K65D = 40.0d;

   public static double Y4K1N = 25.0d;
   public static double Y4K1D = 216.0d;
   public static double Y4K3N = 1408.0d;
   public static double Y4K3D = 2565.0d;
   public static double Y4K4N = 2197.0d;
   public static double Y4K4D = 4101.0d;
   public static double Y4K5N = -1.0d;
   public static double Y4K5D = 5.0d;

   public static double Y5K1N = 16.0d;
   public static double Y5K1D = 135.0d;
   public static double Y5K3N = 6656.0d;
   public static double Y5K3D = 12825.0d;
   public static double Y5K4N = 28561.0d;
   public static double Y5K4D = 56430.0d;
   public static double Y5K5N = -9.0d;
   public static double Y5K5D = 50.0d;
   public static double Y5K6N = 2.0d;
   public static double Y5K6D = 55.0d;

   
}
