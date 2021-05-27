/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodelib;

import java.math.BigDecimal;
import static jodelib.RKF45BDConstants.*;

/**
 *
 * @author owner
 *
 * See: http://maths.cnam.fr/IMG/pdf/RungeKuttaFehlbergProof.pdf
 *
 * See: Numerical Analysis ISBN 0-87150-243-7 Page 254
 *
 */
public class RKF45BDStep {

   private BigDecimal h;
   private BigDecimal t;
   private BigDecimal y;
   private RKF45BDOdeFunction ode;
   private BigDecimal e;

   private BigDecimal k1;
   private BigDecimal k2;
   private BigDecimal k3;
   private BigDecimal k4;
   private BigDecimal k5;
   private BigDecimal k6;

   private BigDecimal y4;
   private BigDecimal y5;

   private BigDecimal r;
   private BigDecimal s;

   public RKF45BDStep() {

      this.h = null;
      this.t = null;
      this.y = null;
      this.ode = null;
      this.e = null;

      this.k1 = null;
      this.k2 = null;
      this.k3 = null;
      this.k4 = null;
      this.k5 = null;
      this.k6 = null;

      this.y4 = null;
      this.y5 = null;

      this.r = null;
      this.s = null;

   }

   public RKF45BDStep(RKF45BDStep toCopy) {

      this.h = toCopy.h;
      this.t = toCopy.t;
      this.y = toCopy.y;
      this.ode = toCopy.ode;
      this.e = toCopy.e;

      this.k1 = null;
      this.k2 = null;
      this.k3 = null;
      this.k4 = null;
      this.k5 = null;
      this.k6 = null;

      this.y4 = null;
      this.y5 = null;

      this.r = null;
      this.s = null;

   }

   public BigDecimal getH() {
      return h;
   }

   public BigDecimal getT() {
      return t;
   }

   public BigDecimal getY() {
      return y;
   }

   public RKF45BDOdeFunction getOde() {
      return ode;
   }

   public BigDecimal getE() {
      return e;
   }

   public BigDecimal getK1() {
      return k1;
   }

   public BigDecimal getK2() {
      return k2;
   }

   public BigDecimal getK3() {
      return k3;
   }

   public BigDecimal getK4() {
      return k4;
   }

   public BigDecimal getK5() {
      return k5;
   }

   public BigDecimal getK6() {
      return k6;
   }

   public BigDecimal getY4() {
      return this.y4;
   }

   public BigDecimal getY5() {
      return y5;
   }

   public BigDecimal getR() {
      return r;
   }

   public BigDecimal getS() {
      return this.s;
   }

   public void calcu1ate(BigDecimal h, BigDecimal t, BigDecimal y, RKF45BDOdeFunction ode, BigDecimal e) {

      this.h = h;
      this.t = t;
      this.y = y;
      this.ode = ode;
      this.e = e;

      k1 = calcK1();
      k2 = calcK2(); //ND();
      k3 = calcK3(); //ND();
      k4 = calcK4(); //ND();
      k5 = calcK5(); //ND();
      k6 = calcK6(); //ND();

      y4 = calcY4(); //ND();
      y5 = calcY5(); //ND();

      r = calcR();

      s = calcS();

   }

   public BigDecimal calcK1() {

      k1 = h.multiply(ode.fty(t, y));

      return k1;
   }

   public BigDecimal calcK2() {

      BigDecimal ftyT = t.add(BDK20.multiply(h));;
      BigDecimal ftyY = y.add(BDK21.multiply(k1));

      k2 = h.multiply(ode.fty(ftyT, ftyY));

      return k2;
   }

   public BigDecimal calcK3() {

      BigDecimal ftyT = t.add(BDK30.multiply(h));;
      BigDecimal ftyY = y.add(BDK31.multiply(k1));

      ftyY = ftyY.add(BDK32.multiply(k2));

      k3 = h.multiply(ode.fty(ftyT, ftyY));

      return k3;
   }

   public BigDecimal calcK4() {

      BigDecimal ftyT = t.add(BDK40.multiply(h));
      BigDecimal ftyY = y.add(BDK41.multiply(k1));

      ftyY = ftyY.add(BDK42.multiply(k2));
      ftyY = ftyY.add(BDK43.multiply(k3));

      k4 = h.multiply(ode.fty(ftyT, ftyY));

      return k4;
   }

   public BigDecimal calcK5() {

      BigDecimal ftyT = t.add(BDK50.multiply(h));;
      BigDecimal ftyY = y.add(BDK51.multiply(k1));

      ftyY = ftyY.add(BDK52.multiply(k2));
      ftyY = ftyY.add(BDK53.multiply(k3));
      ftyY = ftyY.add(BDK54.multiply(k4));

      k5 = h.multiply(ode.fty(ftyT, ftyY));

      return k5;

   }

   public BigDecimal calcK6() {

      BigDecimal ftyT = t.add(BDK60.multiply(h));;
      BigDecimal ftyY = y.add(BDK61.multiply(k1));

      ftyY = ftyY.add(BDK62.multiply(k2));
      ftyY = ftyY.add(BDK63.multiply(k3));
      ftyY = ftyY.add(BDK64.multiply(k4));
      ftyY = ftyY.add(BDK65.multiply(k5));

      k6 = h.multiply(ode.fty(ftyT, ftyY));

      return k6;
   }

   public BigDecimal calcY4() {

      y4 = y.add(BDY4K1.multiply(k1));
      y4 = y4.add(BDY4K3.multiply(k3));
      y4 = y4.add(BDY4K4.multiply(k4));
      y4 = y4.add(BDY4K5.multiply(k5));

      return y4;
   }

   public BigDecimal calcY5() {

      y5 = y.add(BDY5K1.multiply(k1));
      y5 = y5.add(BDY5K3.multiply(k3));
      y5 = y5.add(BDY5K5.multiply(k4));
      y5 = y5.add(BDY5K5.multiply(k5));
      y5 = y5.add(BDY5K6.multiply(k6));

      return y5;
   }

   public BigDecimal calcK2ND() {

      BigDecimal ftyT = t.add(BDK20N.divide(BDK20D).multiply(h));;
      BigDecimal ftyY = y.add(BDK21N.divide(BDK21D).multiply(k1));

      k2 = h.multiply(ode.fty(ftyT, ftyY));

      return k2;
   }

   public BigDecimal calcK3ND() {

      BigDecimal ftyT = t.add(BDK30N.divide(BDK30D).multiply(h));;
      BigDecimal ftyY = y.add(BDK31N.divide(BDK31D).multiply(k1));

      ftyY = ftyY.add(BDK32D.divide(BDK32D).multiply(k2));

      k3 = h.multiply(ode.fty(ftyT, ftyY));

      return k3;
   }

   public BigDecimal calcK4ND() {

      BigDecimal ftyT = t.add(BDK40N.divide(BDK40D).multiply(h));
      BigDecimal ftyY = y.add(BDK41N.divide(BDK41D).multiply(k1));

      ftyY = ftyY.add(BDK42N.divide(BDK42D).multiply(k2));
      ftyY = ftyY.add(BDK43N.divide(BDK43D).multiply(k3));

      k4 = h.multiply(ode.fty(ftyT, ftyY));

      return k4;
   }

   public BigDecimal calcK5ND() {
      
      BigDecimal ftyT = t.add(BDK50N.divide(BDK50D).multiply(h));
      BigDecimal ftyY = y.add(BDK51N.divide(BDK51D).multiply(k1));

      ftyY = ftyY.add(BDK52N.divide(BDK52D).multiply(k2));
      ftyY = ftyY.add(BDK53N.divide(BDK53D).multiply(k3));
      ftyY = ftyY.add(BDK54N.divide(BDK54D).multiply(k4));

      k5 = h.multiply(ode.fty(ftyT, ftyY));

      return k5;

   }

   public BigDecimal calcK6ND() {
      
      BigDecimal ftyT = t.add(BDK60N.divide(BDK60D).multiply(h));
      BigDecimal ftyY = y.add(BDK61N.divide(BDK61D).multiply(k1));

      ftyY = ftyY.add(BDK62N.divide(BDK62D).multiply(k2));
      ftyY = ftyY.add(BDK63N.divide(BDK63D).multiply(k3));
      ftyY = ftyY.add(BDK64N.divide(BDK64D).multiply(k4));
      ftyY = ftyY.add(BDK65N.divide(BDK65D).multiply(k5));

      k6 = h.multiply(ode.fty(ftyT, ftyY));

      return k6;
   }

   public BigDecimal calcY4ND() {

      y4 = y.add(BDY4K1N.divide(BDY4K1D).multiply(k1));
      y4 = y4.add(BDY4K3N.divide(BDY4K3D).multiply(k3));
      y4 = y4.add(BDY4K4N.divide(BDY4K4D).multiply(k4));
      y4 = y4.add(BDY4K5N.divide(BDY4K5D).multiply(k5));

      return y4;
   }

   public BigDecimal calcY5ND() {

      y5 = y.add(BDY5K1N.divide(BDY5K1D).multiply(k1));
      y5 = y5.add(BDY5K3N.divide(BDY5K3D).multiply(k3));
      y5 = y5.add(BDY5K5N.divide(BDY5K5D).multiply(k4));
      y5 = y5.add(BDY5K5N.divide(BDY5K5D).multiply(k5));
      y5 = y5.add(BDY5K6N.divide(BDY5K6D).multiply(k6));

      return y5;
   }

   public BigDecimal calcR() {

      r = y5.subtract(y4).abs();

      return r;
   }

   public BigDecimal calcS() {

      // TODO: s = Math.pow((h * e / (2.0d * r)), 0.25d);
      
      s = new BigDecimal(.05);

      return s;
   }

   public boolean isRejected() {

      boolean b = false;

      if (r.doubleValue() > e.doubleValue()) {
         b = true;
      }

      return b;

   }

   public BigDecimal newH() {
      BigDecimal newH;

      if (s.doubleValue() <= 0.1d) {
         newH = h.multiply(new BigDecimal(0.1));
      } else if (s.doubleValue() >= 4.0d) {
         newH = h.multiply(new BigDecimal(4.0));
      } else {
         newH = s.multiply(h);
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
