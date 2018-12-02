package com.nsp.model;

/**
 * model class for institute login
 * @author vshadmin
 *
 */
public class InstituteLogin {

	private int gi_code;
	private String gi_pass;
	
	public int getGi_code() {
		return gi_code;
	}
	public String getGi_pass() {
		return gi_pass;
	}
	public void setGi_pass(String gi_pass) {
		this.gi_pass = gi_pass;
	}
	public void setGi_code(int gi_code) {
		this.gi_code = gi_code;
	}
	
}
