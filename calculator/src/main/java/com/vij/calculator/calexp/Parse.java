/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vij.calculator.calexp;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author homepc
 */
public class Parse {
  private static final Map<Character,Operator> operators =new HashMap<Character,Operator>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		put('-',Operator.MINUS);
		put('+',Operator.PLUS);
		put('/',Operator.DIV);
		put('*',Operator.MUL);
	}};
	public static Expr parse(String str) {
		str=str.trim();
		String numPattern="([-+]?[0-9]*.?[0-9]+)";
		String signPattern="([//s]*[+\\-/*][//s]*)";
		Pattern pattern=Pattern.compile("^"+numPattern+signPattern+numPattern+"$");
		Matcher matcher=pattern.matcher(str);
		if(matcher.find()) {
			Expr  exp = new Expr ();
			exp.setFirst(new BigDecimal(matcher.group(1)));
			exp.setSecond(new BigDecimal(matcher.group(3)));
			exp.setSign(operators.get(matcher.group(2).trim().charAt(0)));
			System.out.println(exp);
			return exp;
		}
		return null;
	}  
}


