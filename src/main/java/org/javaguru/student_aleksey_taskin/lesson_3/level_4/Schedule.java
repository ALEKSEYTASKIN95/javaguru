package org.javaguru.student_aleksey_taskin.lesson_3.level_4;

import java.time.LocalDate;

public class Schedule {

    private String nameDoctor;
    private String surnameDoctor;
    private String specialityDoctor;
    private LocalDate dataOfVisit;
    private DoctorAppointment doctorAppointment;
    private DoctorAppointment doctorAppointment2;

    public Schedule(String nameDoctor, String surnameDoctor, String specialityDoctor, LocalDate dataOfVisit,
                    DoctorAppointment doctorAppointment, DoctorAppointment doctorAppointment2) {
        this.nameDoctor = nameDoctor;
        this.surnameDoctor = surnameDoctor;
        this.specialityDoctor = specialityDoctor;
        this.dataOfVisit = dataOfVisit;
        this.doctorAppointment = doctorAppointment;
        this.doctorAppointment2 = doctorAppointment2;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public String getSurnameDoctor() {
        return surnameDoctor;
    }

    public String getSpecialityDoctor() {
        return specialityDoctor;
    }

    public LocalDate getDataOfVisit() {
        return dataOfVisit;
    }

    public DoctorAppointment getDoctorAppointment() {
        return doctorAppointment;
    }

    public DoctorAppointment getDoctorAppointment2() {
        return doctorAppointment2;
    }
}
