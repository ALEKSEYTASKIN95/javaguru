package org.javaguru.student_aleksey_taskin.lesson_3.level_4;

public class DoctorAppointment {
    private String nameOfPatient;
    private String surnameOfPatient;
    private String diagnosisOfPatient;
    private String priceOfVisit;

    public DoctorAppointment(String nameOfPatient, String surnameOfPatient, String diagnosisOfPatient,
                             String priceOfVisit) {
        this.nameOfPatient = nameOfPatient;
        this.surnameOfPatient = surnameOfPatient;
        this.diagnosisOfPatient = diagnosisOfPatient;
        this.priceOfVisit = priceOfVisit;
    }

    public String getNameOfPatient() {
        return nameOfPatient;
    }

    public String getSurnameOfPatient() {
        return surnameOfPatient;
    }

    public String getDiagnosisOfPatient() {
        return diagnosisOfPatient;
    }

    public String getPriceOfVisit() {
        return priceOfVisit;
    }
}
