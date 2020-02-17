/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vij.calculator.calexp;

/**
 *
 * @author homepc
 */
public class Validator {
	public static boolean validateExp(Expr exp) {
		if(exp==null)
			return false;
		return exp.getSign()!=null && exp.getFirst()!=null && exp.getSecond() !=null;
	}
}




