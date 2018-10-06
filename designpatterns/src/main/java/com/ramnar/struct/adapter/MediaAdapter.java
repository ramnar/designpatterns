package com.ramnar.struct.adapter;

public class MediaAdapter implements IMediaPlayer {
	
	private IAdvancedMediaPlayer player;

	public MediaAdapter(String audioType) {
		if("vlc".equalsIgnoreCase(audioType)) {
			player = new VLCMediaPlayer();
		}
	}
	
	public void play(String audioType, String fileName) {
		player.playMP4(fileName);
	}

}
