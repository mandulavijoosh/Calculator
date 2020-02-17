/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vij.calculator.calexp;
import java.math.BigDecimal;
/**
 *
 * @author homepc
 */
public class Expr {
    private BigDecimal first,second;
	private Operator sign;
	public BigDecimal getFirst() {
		return first;
	}
	public BigDecimal getSecond() {
		return second;
	}
	public Operator getSign() {
		return sign;
	}
	public Expr setFirst(BigDecimal first) {
			this.first=first;
			return this;
		}
	public Expr setSecond(BigDecimal second) {
		this.second=second;
		return this;
	}
	public Expr setSign(Operator sign) {
		this.sign=sign;
		return this;
	}
	public String toString() {
		return ""+first+" "+sign.getSign()+" "+second;
	}
}





