package doctor.doctors;

import lesson.SecondCheckedException;

public abstract class Doctor {

    public abstract void threat() throws SecondCheckedException;

    public String threatCommonly() {
        return "common treatment";
    }
}
