package ohtu;

import java.util.ArrayList;
import java.util.List;

public class Submission {

    private String student_number;
    private int hours;
    public int exercisesDone;
    public boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
    public ArrayList<Boolean> as;
    public String exercises = "";

    public int gethours() {
        return hours;
    }

    public void sethours(int hours) {
        this.hours = hours;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        return student_number;
    }

    public int getexercisesDone() {
        if (a1 == true) {
            exercisesDone++;
            exercises = exercises +"1 ";
        }
        if (a2 == true) {
            exercisesDone++;
            exercises = exercises + "2 ";
        }
        if (a3 == true) {
            exercisesDone++;
            exercises = exercises + "3 ";
        }
        if (a4 == true) {
            exercisesDone++;
            exercises = exercises + "4 ";
        }
        if (a5 == true) {
            exercisesDone++;
            exercises = exercises + "5 ";
        }
        if (a6 == true) {
            exercisesDone++;
            exercises = exercises + "6 ";
        }
        if (a7 == true) {
            exercisesDone++;
            exercises = exercises + "7 ";
        }
        if (a8 == true) {
            exercisesDone++;
            exercises = exercises + "8 ";
        }
        if (a9 == true) {
            exercisesDone++;
            exercises = exercises + "9 ";
        }
        if (a10 == true) {
            exercisesDone++;
            exercises = exercises + "10 ";
        }
        if (a11 == true) {
            exercisesDone++;
            exercises = exercises + "11 ";
        }
        return exercisesDone;
    }

    public void seta1(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta2(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta3(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta4(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta5(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta6(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta7(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta8(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta9(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta10(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta11(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }

    public void seta12(boolean a1) {
        this.a1 = a1;
        exercisesDone++;
    }
}
