package by.tut.Lesson9;

import by.tut.Homework.Lesson7.Rectangle;
import by.tut.Lesson8.Parent;

import java.util.Random;

public class Ambulance {
    public static void main(String[] args) {
        //1 - создать пациентов
//        Patient knownPatient = new Patient("Vasya Pupkin", 23);
//        Patient unknownPatient = new Patient();
        Patient[] patients = getPatient();
        for (Patient patient : patients) {
            setMedicalPlan(patient);
            Doctor doctor = getDoctorToPatient(patient);
            doctor.heal();
        }
//        //2 - прописать план лечения
//        setMedicalPlan(knownPatient);
//        setMedicalPlan(unknownPatient);
//        //3 - выделить октора
//        Doctor firstDoctor = getDoctorToPatient(knownPatient);
//        Doctor secondDoctor = getDoctorToPatient(unknownPatient);
//        //4 - вылечить
//        firstDoctor.heal();
//        secondDoctor.heal();
//        int p = 0;
//        increment(p);
//        System.out.println(p);
    }

    /**
     * We give a doctor to Patient
     * if medicelPlan = 1 - we give Terapist
     * if medicalPlan = 2 we give Dentist
     * else - we give Surgeon
     *
     * @param patient - current Patient
     * @return - needed type of Doctor
     */
    private static Doctor getDoctorToPatient(Patient patient) {
        if (patient.getMedicalPlan() == 1) return new Terapist();
        if (patient.getMedicalPlan() == 2) return new Dentist();
        return new Surgeon();
    }

    /**
     * set different medical plan to patient
     *
     * @param patient - current patient
     */

    private static void setMedicalPlan(Patient patient) {
        if (patient.getName() == null) {
            patient.setMedicalPlan(1);
        } else {
            Random random = new Random();
            patient.setMedicalPlan(random.nextInt(3));
        }
    }

    private static Patient[] getPatient() {
        Patient[] patients = new Patient[2];
        patients[0] = new Patient("Vasya Pupkin", 23);
        patients[1] = new Patient();
        return patients;
    }
}

//    private static void increment(int param) {
//        param = param + 1;
//    }
//}
