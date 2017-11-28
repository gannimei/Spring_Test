package com.netease.Spring_IOC;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
	}

}
