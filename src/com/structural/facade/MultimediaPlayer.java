package com.structural.facade;
// this is the facade
public class MultimediaPlayer {
    private final AudioPlayer audioPlayer;
    private final VideoPlayer videoPlayer;

    public MultimediaPlayer() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
    }

    void playMultimedia(String filename) {
        String fileType = filename.substring(filename.lastIndexOf('.') + 1);
        if ("mp3".equalsIgnoreCase(fileType) || "wav".equalsIgnoreCase(fileType)) {
            audioPlayer.playAudio(filename);
        } else if ("mp4".equalsIgnoreCase(fileType) || "avi".equalsIgnoreCase(fileType)) {
            videoPlayer.playVideo(filename);
        } else {
            System.out.println("Unsupported file format: " + fileType);
        }
    }
}
