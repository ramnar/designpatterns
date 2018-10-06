package com.ramnar.struct.adapter;

public class Client {

	public static void main(String[] args) {
		 AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("vlc", "alone.vlc");

	}

}
