package com.tekgrp.design.structural.adapter.example1;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get12V() {
		Volt v = getVolts();
		return convertVolt(v,10 );
	}

	@Override
	public Volt get3V() {
		// TODO Auto-generated method stub
		Volt v = getVolts();
		return convertVolt(v,60 );
	}

	@Override
	public Volt get120V() {
		// TODO Auto-generated method stub
		return getVolts();
	}

	 private Volt convertVolt(Volt v, int divisor) {
		return new Volt(v.getVolt()/divisor); 
	 }
	

}
