package org.javaguru.student_aleksey_taskin.lesson_3.level_4;

import java.time.LocalDate;

public class DoctorTimetableApp {

    public static void main(String[] args) {

        DoctorAppointment doctorAppointment10_12 = new DoctorAppointment("Alesha", "Pupkin",
                "gripp", "5000");
        DoctorAppointment doctorAppointment14_16 = new DoctorAppointment("Dasha", "Blinova",
                "zubbolit", "8000");

        Schedule schedule1 = new Schedule("Dadya", "Petya", "Pediatrician"
                , LocalDate.of(2026, 06, 8), doctorAppointment10_12, doctorAppointment14_16 );

        System.out.println(schedule1.getNameDoctor() + " " + schedule1.getSurnameDoctor() + " "
                + schedule1.getSpecialityDoctor() + " " + schedule1.getDataOfVisit() + "\n"
                + schedule1.getDoctorAppointment().getNameOfPatient() + " "
                + schedule1.getDoctorAppointment().getSurnameOfPatient() + " "
                + schedule1.getDoctorAppointment().getDiagnosisOfPatient() + " "
                + schedule1.getDoctorAppointment().getPriceOfVisit() + "\n"
                + schedule1.getDoctorAppointment2().getNameOfPatient() + " "
                + schedule1.getDoctorAppointment2().getSurnameOfPatient() + " "
                + schedule1.getDoctorAppointment2().getDiagnosisOfPatient() + " "
                + schedule1.getDoctorAppointment2().getPriceOfVisit());
        System.out.println("------------");

    }
}
