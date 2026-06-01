package org.javaguru.student_aleksey_taskin.lesson_3.level_7;

class MusicSpeaker {

    private String modelMusicSpeaker;
    private int volume;
    private boolean works;

    public MusicSpeaker(String modelMusicSpeaker) {
        this.modelMusicSpeaker = modelMusicSpeaker;
        this.volume = 0;
        this.works = false;
    }

    public void doWorkOn() {
        this.works = true;
    }

    public void turnVolume() {
        if (this.works && this.volume < 10) {
            this.volume += 1;
        }
    }

    public void doWorkOf() {
        this.works = false;
        this.volume = 0;
    }

    public String getModelMusicSpeaker() {
        return modelMusicSpeaker;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isWorks() {
        return works;
    }
}
