package doctor;

import doctor.doctors.Doctor;

public class Main {

    public static void main(String[] args) {
        Plan plan1 = Plan.THERAPIST_PLAN;
        Patient patient1 = new Patient(plan1);

        Patient patient2 = new Patient(Plan.SURGEON_PLAN);

        Patient patient3 = new Patient(Plan.DENTIST_PLAN);

        Doctor doctor1 = patient1.chooseDoctor();
        doctor1.threat();

        patient2.chooseDoctor().threat();

        patient3.chooseDoctor()
                .threat();

        String str = patient2.chooseDoctor().threatCommonly();
        System.out.println(str);
    }
}
