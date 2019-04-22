package students;

public class Student {
  private String name;
  public int rating;
  public static double totalRating;
  public static double averageRating;
  public static int count;

  public Student(String name) {
    this.name = name;
    count++;
  }

  public Student() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    totalRating += rating;
  }

  //Methods
  public boolean betterStudent(Student s2) {
    return getRating() > s2.rating;
  }

  public String toString() {
    return "Student name is " + getName() + " whose rating is " + getRating();
  }

  /** Method for rating change and recalculate average rating.
   * @param rating set rating for selected student
   */
  public void changeRating(int rating) {
    totalRating -= this.rating;
    this.rating = rating;
    totalRating += this.rating;
    getAvgRating();
  }

  /**
   * Calculates average rating for all students.
   * @return average rating
   */
  public static double getAvgRating() {
    if (count > 0) {
      averageRating = totalRating / count;
    } else {
      averageRating = 0;
    }
    return averageRating;
  }

  /**
   * Remove selected student.
   * @param student which has to be removed
   */
  public static void removeStudent(Student student) {
    count--;
    totalRating -= student.rating;
    getAvgRating();
    student = null;
  }
}