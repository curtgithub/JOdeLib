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
 *
 */
public interface RKF45BDOdeFunction {

   public BigDecimal fty(BigDecimal t, BigDecimal y);
   //public Double fty(Double t, Double y);

}
