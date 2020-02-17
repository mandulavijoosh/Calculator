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
public enum Operator {
	MINUS('-'),PLUS('+'),MUL('*'),DIV('/');
	private char sign;
	Operator(char sign){
		this.sign=sign;
	}
	public char getSign() {
		return sign;
	}
}
