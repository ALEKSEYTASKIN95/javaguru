package org.javaguru.student_aleksey_taskin.lesson_3.level_7;

class MusicSpacerApp {

    public static void main(String[] args) {
        MusicSpeaker musicSpeaker = new MusicSpeaker("Samsung");

        System.out.println(musicSpeaker.getModelMusicSpeaker());
        System.out.println(musicSpeaker.getVolume());
        System.out.println(musicSpeaker.isWorks());
        System.out.println();

        musicSpeaker.doWorkOn();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();

        System.out.println(musicSpeaker.isWorks());
        System.out.println(musicSpeaker.getVolume());
        musicSpeaker.doWorkOf();

        System.out.println(musicSpeaker.getVolume());

        musicSpeaker.doWorkOn();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();
        musicSpeaker.turnVolume();

        System.out.println(musicSpeaker.getModelMusicSpeaker());
        System.out.println(musicSpeaker.getVolume());


    }

}
