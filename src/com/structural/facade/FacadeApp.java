package com.structural.facade;

public class FacadeApp {
    public static void main(String[] args) {
        MultimediaPlayer multimediaPlayer = new MultimediaPlayer();

        // Play audio file
        multimediaPlayer.playMultimedia("music.mp3");

        // Play video file
        multimediaPlayer.playMultimedia("movie.mp4");

        // Unsupported file format
        multimediaPlayer.playMultimedia("document.pdf");
    }
}
