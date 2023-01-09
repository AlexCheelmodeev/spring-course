package ru.spring.player;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

   //public MusicPlayer(Music music) {this.music = music;}


    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void play(){

        System.out.println("Now playing " + music.getSong());

    }

}
