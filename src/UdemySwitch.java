public class UdemySwitch {
    public static void main(String args[]){
        String grade = "A-";
        switch (grade){
            case "A+": case "A": case "A-":
                System.out.println("Great Student");
                break;
            case "B+": case "B": case "B-":
                System.out.println("Good Student");
                break;
            case "C+": case "C": case "C-":
                System.out.println("Poor Student");
                break;
            case "D+": case "D": case "D-":
                System.out.println("Poor Student");
                break;
            default:
                System.out.println("Failed");
                break;
        }
        String[] name = new String[]{"Artem", "Oksana", "Victor"};
        int[] age = new int[]{27, 18, 34};
        System.out.println(name[0] + " is " + age[0] + " years old" );
        System.out.println(name[1] + " is " + age[1] + " years old" );

    }
}
