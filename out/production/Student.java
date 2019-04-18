package Students;

public class Student {
    private String name;
    int rating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
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
    }

    //Methods
    public boolean betterStudent(Student s2) {
        return getRating() > s2.rating;
    }

    public String toString() {
        return "Student name is " + getName() + " whose rating is " + getRating();
    }

    public void changeRating(int rating) {
        this.rating = rating;
    }

    public static double averageRating(Student ...s){
        double sum = 0;
        for(int i = 0; i < s.length; i++){
            sum = sum + s[i].getRating();
        }
        return sum / s.length;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setRating(56);
        Student s2 = new Student("Jane", 42);
        Student s3 = new Student("Platypus", 99);
        System.out.println(String.format("Is %s better than %s? %b", s1.getName(), s2.getName(), s1.betterStudent(s2)));
        System.out.println(s2.toString());
        System.out.println("__________________________________________________");

        //System.out.println(averageRaining(s1,s2,s3));

        double averageRating = (double) (s1.getRating() + s2.getRating() + s3.getRating()) / 3;
        System.out.println((String.format("Average rating is %1$,.3f", (averageRating(s1,s2,s3)))));
        s2.changeRating(21);
        System.out.println(String.format("The new %s rating is %d", s2.getName(), s2.getRating()));
        System.out.println((String.format("New average rating is %1$,.3f", (averageRating(s1,s2,s3)))));
    }
}