package doctor;

import doctor.clinic.Clinic;
import doctor.doctors.Doctor;

public class Patient {

    private Plan threatmentPlan;

    public Patient() {

    }

    public Patient(Plan threatmentPlan) {
        this.threatmentPlan = threatmentPlan;
    }

//    public Patient(String plan) {
//
//    }

    public Doctor chooseDoctor() {
        Clinic clinic = Clinic.CLINIC;

        return switch (threatmentPlan) {
            case DENTIST_PLAN -> clinic.getDentist();
            case SURGEON_PLAN -> Clinic.CLINIC.getSurgeon();
            default -> Clinic.CLINIC.getTherapist();
        };
    }
}
