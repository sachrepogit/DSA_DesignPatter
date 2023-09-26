package com.tekgrp.design.structural.adapter.example1;


public class SocketObjectAdapterImpl implements SocketAdapter{

	//Using Composition for adapter pattern
	private Socket sock = new Socket();
	
		
	@Override
	public Volt get12V() {
		Volt v = sock.getVolts();
		return convertVolt(v,10 );
	}

	@Override
	public Volt get3V() {
		Volt v = sock.getVolts();
		return convertVolt(v,40 );
	}

	@Override
	public Volt get120V() {
		return sock.getVolts();
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolt()/i);
	}
}