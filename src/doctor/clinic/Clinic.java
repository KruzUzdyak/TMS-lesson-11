package doctor.clinic;

import doctor.doctors.Dentist;
import doctor.doctors.Surgeon;
import doctor.doctors.Therapist;

public class Clinic {

    public static final Clinic CLINIC = new Clinic();

    private final Dentist[] dentist = new Dentist[5];
    private final Surgeon[] surgeon = new Surgeon[5];
    private final Therapist[] therapist = new Therapist[5];

    private Clinic() {
        therapist[0] = new Therapist();
        therapist[1] = new Therapist();

        dentist[0] = new Dentist();
        dentist[1] = new Dentist();

        surgeon[0] = new Surgeon();
        surgeon[1] = new Surgeon();
    }

    public Dentist getDentist() {
        //some doctor checks
        return dentist[0];
    }

    public Surgeon getSurgeon() {
        //some doctor checks
        return surgeon[0];
    }

    public Therapist getTherapist() {
        //some doctor checks
        return therapist[0];
    }
}
