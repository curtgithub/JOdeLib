/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodelib;

import static jodelib.RKF45Constants.*;

/**
 *
 * @author owner
 *
 * See: http://maths.cnam.fr/IMG/pdf/RungeKuttaFehlbergProof.pdf
 *
 * See: Numerical Analysis ISBN 0-87150-243-7 Page 254
 *
 */
public class RKF45Step {

   private double h;
   private double t;
   private double y;
   private RKF45OdeFunction ode;
   private double e;

   private double k1;
   private double k2;
   private double k3;
   private double k4;
   private double k5;
   private double k6;

   private double y4;
   private double y5;

   private double r;
   private double s;

   public RKF45Step() {

      this.h = Double.NaN;
      this.t = Double.NaN;
      this.y = Double.NaN;
      this.ode = null;
      this.e = Double.NaN;

      this.k1 = Double.NaN;
      this.k2 = Double.NaN;
      this.k3 = Double.NaN;
      this.k4 = Double.NaN;
      this.k5 = Double.NaN;
      this.k6 = Double.NaN;

      this.y4 = Double.NaN;
      this.y5 = Double.NaN;

      this.r = Double.NaN;
      this.s = Double.NaN;

   }

   public RKF45Step(RKF45Step toCopy) {

      this.h = toCopy.h;
      this.t = toCopy.t;
      this.y = toCopy.y;
      this.ode = toCopy.ode;
      this.e = toCopy.e;

      this.k1 = Double.NaN;
      this.k2 = Double.NaN;
      this.k3 = Double.NaN;
      this.k4 = Double.NaN;
      this.k5 = Double.NaN;
      this.k6 = Double.NaN;

      this.y4 = Double.NaN;
      this.y5 = Double.NaN;

      this.r = Double.NaN;
      this.s = Double.NaN;

   }

   public double getH() {
      return h;
   }

   public double getT() {
      return t;
   }

   public double getY() {
      return y;
   }

   public RKF45OdeFunction getOde() {
      return ode;
   }

   public double getE() {
      return e;
   }

   public double getK1() {
      return k1;
   }

   public double getK2() {
      return k2;
   }

   public double getK3() {
      return k3;
   }

   public double getK4() {
      return k4;
   }

   public double getK5() {
      return k5;
   }

   public double getK6() {
      return k6;
   }

   public double getY4() {
      return this.y4;
   }

   public double getY5() {
      return y5;
   }

   public double getR() {
      return r;
   }

   public double getS() {
      return this.s;
   }

   public void calcu1ate(double h, double t, double y, RKF45OdeFunction ode, double e) {

      this.h = h;
      this.t = t;
      this.y = y;
      this.ode = ode;
      this.e = e;

      k1 = calcK1();
      k2 = calcK2ND();
      k3 = calcK3ND();
      k4 = calcK4ND();
      k5 = calcK5ND();
      k6 = calcK6ND();

      y4 = calcY4ND();
      y5 = calcY5ND();

      r = calcR();

      s = calcS();

   }

   public double calcK1() {

      k1 = h * ode.fty(t, y);

      return k1;
   }

   public double calcK2() {

      k2 = h * ode.fty(t + K20 * h, y + K21 * k1);

      return k2;
   }

   public double calcK3() {

      k3 = h * ode.fty(t + K30 * h, y + K31 * k1 + K32 * k2);

      return k3;
   }

   public double calcK4() {

      k4 = h * ode.fty(t + K40 * h, y + K41 * k1 + K42 * k2 + K43 * k3);

      return k4;
   }

   public double calcK5() {

      k5 = h * ode.fty(t + K50 * h, y + K51 * k1 + K52 * k2 + K53 * k3 + K54 * k4);

      return k5;

   }

   public double calcK6() {

      k6 = h * ode.fty(t + K60 * h, y + K61 * k1 + K62 * k2 + K63 * k3 + K64 * k4 + K65 * k5);

      return k6;
   }

   public double calcY4() {

      y4 = y + Y4K1 * k1 + Y4K3 * k3 + Y4K4 * k4 + Y4K5 * k5;

      return y4;
   }

   public double calcY5() {

      y5 = y + Y5K1 * k1 + Y5K3 * k3 + Y5K4 * k4 + Y5K5 * k5 + Y5K6 * k6;

      return y5;
   }

   public double calcK2ND() {

      k2 = h * ode.fty(t + K20N/K20D * h, y + K21N/K21D * k1);

      return k2;
   }

   public double calcK3ND() {

      k3 = h * ode.fty(t + K30N/K30D * h, y + K31N/K31D * k1 + K32N/K32D * k2);

      return k3;
   }

   public double calcK4ND() {

      k4 = h * ode.fty(t + K40N/K40D * h, y + K41N/K41D * k1 + K42N/K42D * k2 + K43N/K43D * k3);

      return k4;
   }

   public double calcK5ND() {

      k5 = h * ode.fty(t + K50N/K50D * h, y + K51N/K51D * k1 + K52N/K52D * k2 + K53N/K53D * k3 + K54N/K54D * k4);

      return k5;

   }

   public double calcK6ND() {

      k6 = h * ode.fty(t + K60N/K60D * h, y + K61N/K61D * k1 + K62N/K62D * k2 + K63N/K63D * k3 + K64N/K64D * k4 + K65N/K65D * k5);

      return k6;
   }

   public double calcY4ND() {

      y4 = y + Y4K1 * k1 + Y4K3N/Y4K3D * k3 + Y4K4N/Y4K4D * k4 + Y4K5N/Y4K5D * k5;

      return y4;
   }

   public double calcY5ND() {

      y5 = y + Y5K1 * k1 + Y5K3N/Y5K3D * k3 + Y5K4N/Y5K4D * k4 + Y5K5N/Y5K5D * k5 + Y5K6N/Y5K6D * k6;

      return y5;
   }

   public double calcR() {

      r = Math.abs(y5 - y4);

      return r;
   }

   public double calcS() {

      s = Math.pow((h * e / (2.0d * r)), 0.25d);

      return s;
   }

   public boolean isRejected() {

      boolean b = false;

      if (r > e) {
         b = true;
      }

      return b;

   }

   public double newH() {
      double newH;

      if (s <= 0.1d) {
         newH = 0.1d * h;
      } else if (s >= 4.0d) {
         newH = 4.0d * h;
      } else {
         newH = s * h;
      }

      return newH;
   }

   public String toString() {

      String str = new String();

      str += "h = " + h + "\n";
      str += "t = " + t + "\n";
      str += "y = " + y + "\n";
      str += "e = " + e + "\n";

      str += "y4 = " + y4 + "\n";
      str += "y5 = " + y5 + "\n";

      str += "r = " + r + "\n";
      str += "s = " + s + "\n";

      str += "isRejected() = " + isRejected() + "\n";

      return str;

   }

}
