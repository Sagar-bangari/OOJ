import java.util.Scanner;


class Subject {
    int subjectMarks;
    int credits ;
    int grade;

}

class Student{

        String name;
        String usn;
        double SGPA;
        Subject subject[];
        Scanner s;
        Student(){
            int i;
              subject = new Subject[8];
                for( i = 0 ; i < 8 ; i++){
                    this.subject[i] = new Subject();
                    s = new Scanner(System.in);
                }
        }

        void getStudentDetails(){
         s = new Scanner(System.in);
            System.out.println("Enter student's name");
            this.name = s.nextLine();
            System.out.println("Enter usn of student");
            this.usn = s.nextLine();

        }

        void getMarks(){

            int i;

            for( i = 0 ; i < 8 ; i++){
                     s = new Scanner(System.in);
                    System.out.println("Enter the marks of " + (i+1)+" subject");
                    this.subject[i].subjectMarks = s.nextInt();

                    System.out.println("Enter the credits of " + (i+1)+" subject");
                    this.subject[i].credits = s.nextInt();

                    this.subject[i].grade = (subject[i].subjectMarks / 10 +1);

                    if(this.subject[i].grade == 11){
                        this.subject[i].grade = 10;
                    }

                    if(this.subject[i].grade <=4){
                        this.subject[i].grade = 0;
                    }

            }
        }

        void computeSGPA(){

            int i;

            float sum_creditsandgrade = 0;
            float sum_credits = 0 ;

            for(i = 0 ; i < 8 ; i++){
                 
                 sum_creditsandgrade += (this.subject[i].credits) * (this.subject[i].grade);
                 sum_credits += this.subject[i].credits;

            }

            this.SGPA = (sum_creditsandgrade)/(sum_credits);

        }
}

class Main{

    public static void main(String args[]){

            Student s1 = new Student();
            s1.getStudentDetails();
            s1.getMarks();
            s1.computeSGPA();

            System.out.println("the name of teh student is"+ s1.name);
            System.out.println("the usn of the student is"+ s1.usn);
            System.out.println("the SGPA of the student is"+ s1.SGPA);

             System.out.println("Sagar Bangari - 1BM22CS231");

    }
}
