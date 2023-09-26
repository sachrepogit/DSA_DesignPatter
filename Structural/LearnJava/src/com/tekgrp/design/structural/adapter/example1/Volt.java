package com.tekgrp.design.structural.adapter.example1;

public class Volt {

	int volts;
	public Volt() {
		// TODO Auto-generated constructor stub
	}
	
	public Volt(int pVolts){
		this.volts = pVolts;
	}
	
	public int getVolt(){
		return this.volts;
	}
   
	public void setVolt(int volttmp){
		this.volts=volttmp;
	}
}
