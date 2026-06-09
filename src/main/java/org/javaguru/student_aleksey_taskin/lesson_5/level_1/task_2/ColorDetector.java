package org.javaguru.student_aleksey_taskin.lesson_5.level_1.task_2;

class ColorDetector {

    public String colorDetect(int waveLength) {
        String light = "";
        if (waveLength >= 380 && waveLength <= 449) {
            light = "Violet";
        } else if (waveLength >= 450 && waveLength <= 494) {
            light = "Blue";
        } else if (waveLength >= 495 && waveLength <= 569) {
            light = "Green";
        } else if (waveLength >= 570 && waveLength <= 589) {
            light = "Yellow";
        } else if (waveLength >= 590 && waveLength <= 619) {
            light = "Orange";
        } else if (waveLength >= 620 && waveLength <= 750) {
            light = "Red";
        } else {
            light = "Invisible Light";
        }
        return light;
    }
}
