package doctor.doctors;

import lesson.SecondCheckedException;
import lesson.ThirdCheckedException;

public class Therapist extends Doctor {

    @Override
    public void threat() throws ThirdCheckedException {
        System.out.println("Therapist threats");
    }
}
