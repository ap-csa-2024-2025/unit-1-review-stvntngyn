public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP Computer Science A";
    int timeSpent = 135;
    int hours = timeSpent / 60;
    int mins = timeSpent % 60;
    int hw1 = 75;
    int hw2 = 99;
    int hw3 = 80;
    int hw4 = 100;
    double quiz1 = 89.2;
    double quiz2 = 98.1;
    double finalExam = 87.58;
    double hwWeight = 0.35;
    double quizWeight = 0.15;
    double finalExamWeight = 0.50;
    double avgHwGrade = (double)((hw1 + hw2 + hw3 + hw4) / 4);
    double avgQuizGrade = ((quiz1 + quiz2) / 2);
    int overallGrade = (int)((avgHwGrade * hwWeight) + (avgQuizGrade * quizWeight) + (finalExam * finalExamWeight));
    System.out.println("course name: " + course);
    System.out.println("average time spent in a week for this course in mutes: " + timeSpent);
    System.out.println("homework grades for this course: ");
    System.out.println(hw1);
    System.out.println(hw2);
    System.out.println(hw3);
    System.out.println(hw4);
    System.out.println("quiz grades for this course: ");
    System.out.println(quiz1);
    System.out.println(quiz2);
    System.out.println("final exam grade for this course: ");
    System.out.println(finalExam);
    System.out.println("weekly time spent: " + hours + "h" + mins);
    System.out.println("Average homework grade: " + avgHwGrade);
    System.out.println("Average quiz grade: " + avgQuizGrade);
    System.out.println("Final exam grade: " + finalExam);
    System.out.println("Overall grade: " + overallGrade);
  }
}
