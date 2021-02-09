import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//when i have time all things will be fixed / working

public class Students {

    private final String firstname;
    private final String lastname;
    private String ID;
    private String student_email;
    private String grade; //Example 5A/B/C/D
    private int all_grades = 0;

    private final HashMap<String, String> class_master = new HashMap<String, String>();

    public static HashMap<String, String> students_5th_Grade = new HashMap<String, String>();

    private final ArrayList<Double> english_grades = new ArrayList<Double>();
    private final ArrayList<Double> math_grades = new ArrayList<Double>();
    private final ArrayList<Double> technology_grades = new ArrayList<Double>();
    private final ArrayList<Double> history_grades = new ArrayList<Double>();



    public Students() {
        Scanner reader = new Scanner(System.in);
        System.out.println("First name of the Student: ");
        this.firstname = reader.next();

        System.out.println("Last name of the Student: ");
        this.lastname = reader.next();

        System.out.println("STUDENT CREATED: " + firstname + " " + lastname);


        int default_ID_Length = 10;
        this.ID = randID(default_ID_Length);
        System.out.println("Your ID is: " + this.ID);


        this.student_email = create_email();
        System.out.println("Your Email is: " + this.student_email);

        set_grade();

        switch(this.grade) {
            case "5A":
                Students.students_5th_Grade.put(this.lastname, "5A");
                System.out.println(this.lastname + " is in class: " + Students.students_5th_Grade.get(this.lastname));
                break;
            case "5B":
                Students.students_5th_Grade.put(this.lastname, "5B");
                System.out.println(this.lastname + " is in class: " + Students.students_5th_Grade.get(this.lastname));
                break;
            case "5C":
                Students.students_5th_Grade.put(this.lastname, "5C");
                System.out.println(this.lastname + " is in class: " + Students.students_5th_Grade.get(this.lastname));
        }
    }

    public String randID(int length) {
        String IDset = "1234567890";
        char[] ID = new char[length];
        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * IDset.length());
            ID[i] = IDset.charAt(rand);
        }
        return new String(ID);
    }



    private String create_email() {
        String school = "";
        this.student_email = this.firstname + "." + this.lastname + "@" + school + ".com";
        return student_email;
    }

    //Set what  grade they are in
    private void set_grade() {
        Scanner reader = new Scanner(System.in);
        System.out.print("What grade will the student be in: ");
        this.grade = reader.next();
    }

    private String get_grade() {
        return firstname + " " + lastname + " is in grade " + this.grade;
    }


    public void set_class_master() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Class(5A/5B/5C): ");
        String grade = reader.next();

        switch(grade) {
            case "5A":
                System.out.print("Enter the name of the class master: ");
                String class_master_name1 = reader.next();
                this.class_master.put("5A", class_master_name1);
                System.out.println("Their class master will be: " + class_master_name1);
                break;

            case "5B":
                System.out.print("Enter the name of the class master: ");
                String class_master_name2 = reader.next();
                this.class_master.put("5B", class_master_name2);
                System.out.println("Their class master will be: " + class_master_name2);
                break;

            case "5C":
                System.out.print("Enter the name of the class master: ");
                String class_master_name3 = reader.next();
                this.class_master.put("5C", class_master_name3);
                System.out.println("Their class master will be: " + class_master_name3);
                break;
        }
    }

    public void get_class_master_name() {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("Class: ");
            String grade = reader.next();
            System.out.println(grade + "'s class master is: " + this.class_master.get(grade));
        } catch(Exception e){
            System.out.println("Please enter the correct grade");
        }
    }

    public void show_class_masters() {
        System.out.println("5A: " + this.class_master.get("5A"));
        System.out.println("5B: " + this.class_master.get("5B"));
        System.out.println("5C: " + this.class_master.get("5C"));
    }

    public static void search_for_student() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Search for Student: (note that we store the students by their last name) : ");
        String student = reader.next();
        System.out.println(student + " was found in class: " + students_5th_Grade.get(student));
    }

    public void get_all_students() {
        for (String name: students_5th_Grade.keySet()) {
            String key = name.toString();
            String value = students_5th_Grade.get(name).toString();
            System.out.println(key + " " + value);
        }
    }

    public void add_grade_maths() {
        Scanner reader = new Scanner(System.in);
        double grade;
        System.out.println("Grade: ");
        grade = reader.nextDouble();
        if (grade <= 10) {
            math_grades.add(grade);
            System.out.println("Grade added");
        }
    }

    public double average_maths() {
        double sum = 0;
        double average = 0;
        int total_grades = 0;
        for (int i = 0; i < math_grades.size(); i++) {
            sum += math_grades.get(i);
            total_grades++;
        }
        average = sum / total_grades;
        this.all_grades += sum;
        return average;
    }

    public void add_grade_english() {
        Scanner reader = new Scanner(System.in);
        double grade;
        System.out.println("Grade: ");
        grade = reader.nextDouble();
        if(grade <= 10) {
            english_grades.add(grade);
            System.out.println("Grade added");
        }
    }

    public double average_english() {
        double sum = 0;
        double average = 0;
        int total_grades = 0;
        for (int i = 0; i < english_grades.size(); i++) {
            sum += english_grades.get(i);
            total_grades++;
        }
        average = sum / total_grades;
        this.all_grades += sum;
        return average;

    }
    public void add_grade_tech() {
        Scanner reader = new Scanner(System.in);
        double grade;
        System.out.println("Grade: ");
        grade = reader.nextDouble();
        if(grade <= 10) {
            technology_grades.add(grade);
            System.out.println("Grade added");
        }
    }

    public double average_Tech() {
        double sum = 0;
        double average = 0;
        int total_grades = 0;
        for (int i = 0; i < technology_grades.size(); i++) {
            sum += technology_grades.get(i);
            total_grades++;
        }
        average = sum / total_grades;
        this.all_grades += sum;
        return average;
    }

    public void add_grade_history() {
        Scanner reader = new Scanner(System.in);
        double grade;
        System.out.println("Grade: ");
        grade = reader.nextDouble();
        if(grade <= 10) {
            history_grades.add(grade);
            System.out.println("Grade added");
        }
    }

    public double average_history() {
        double sum = 0;
        double average = 0;
        int total_grades = 0;
        for (int i = 0; i < history_grades.size(); i++) {
            sum += history_grades.get(i);
            total_grades++;
        }
        average = sum / total_grades;
        this.all_grades += sum;
        return average;
    }

    public void Show_grades_eng() {
        for(double i : english_grades) {
            System.out.print(i + ", ");
        }
    }

    public void show_grades_math() {
        for(double i : math_grades) {
            System.out.print(i + ", ");
        }
    }

    public void show_grades_tech() {
        for (double i : technology_grades) {
            System.out.print(i + ", ");

        }
    }

    public void show_grades_history() {
        for (double i : history_grades) {
            System.out.print(i + ", ");
        }
    }

    public void setAll_subject_average() {
        int all_subject_average = 0;
        System.out.println(all_subject_average);
    }
    }