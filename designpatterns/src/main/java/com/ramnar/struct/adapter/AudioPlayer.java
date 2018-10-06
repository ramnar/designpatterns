package com.ramnar.struct.adapter;

public class AudioPlayer implements IMediaPlayer {
	
	private MediaAdapter adapter;
	
	public void play(String audioType, String fileName) {
		if("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("Playing mp3 audio of file : " + fileName);
		}else if("vlc".equalsIgnoreCase(audioType)){
			adapter = new MediaAdapter("vlc");
			adapter.play(audioType, fileName);
		}
	}

}
