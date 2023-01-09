package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.spring.player.ClassicalMusic;
import ru.spring.player.Music;
import ru.spring.player.MusicPlayer;
import ru.spring.player.RockMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", ClassicalMusic.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.play();
        musicPlayer.setMusic(music);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());



        context.close();

    }
}
