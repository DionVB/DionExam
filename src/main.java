import java.util.Scanner;

//when i have time all things will be fixed / working

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Teacher tch = new Teacher();
        int ch;
                System.out.println("\nSCHOOL\nMANAGEMENT\nSYSTEM");
        do {
            System.out.println("\n1 - New Sutdent.");
            System.out.println("2 - Search for a student.");
            System.out.println("3 - Show all students");
            System.out.println("4 - Set Class Master");
            System.out.println("5 - Show Class Masters");
            System.out.println("6 - Add Grade");
            System.out.println("7 - Get Average");
            System.out.println("8 - Get All subject average");
            System.out.println("9 - EXIT");
            ch = reader.nextInt();

            switch (ch) {
                case 1:
                    new Students();
                    break;

                case 2:
                    Students.search_for_student();
                    break;

                case 3:
                    tch.get_all_students();
                    break;

                case 4:
                    tch.set_class_master();
                    break;

                case 5:
                    tch.show_class_masters();
                    break;

                case 6:
                    System.out.println("M for math\nE for english\nT for tech\nH for History\nEXIT for EXIT\nChoice>");
                    String choice = reader.next();

                    switch(choice) {
                        case "M":
                        tch.add_grade_maths();
                            break;

                        case "E":
                            tch.add_grade_english();
                                    break;

                        case "T":
                            tch.add_grade_tech();
                            break;

                        case "H":
                            tch.add_grade_history();
                            break;

                        case "EXIT":
                            break;

                        default:
                            System.out.println("Error, pleae use the instructions above");
                            break;
                    }

                case 7:
                    System.out.println("M for math\nE for english\nT for tech\nH for History\nEXIT for EXIT\nChoice>");
                    String choice2 = reader.next();

                    switch(choice2) {
                        case "M":
                            tch.average_maths();
                            break;

                        case "E":
                            tch.average_english();
                            break;

                        case "T":
                            tch.average_tech();
                            break;

                        case "H":
                            tch.average_history();
                            break;

                        case "EXIT":
                            break;

                        default:
                            System.out.println("Error, use the instructions above!");
                            break;
                    }

                case 8:
                    tch.all_subjects_average();
                    break;
            }
        }while(ch != 9);

        //when i have time all things will be fixed / working
    }
}
