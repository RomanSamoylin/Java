package java_projects;

public class Lesson1 {
    public static void main(String[] args) {
        int i = 'f';
        float fl = 4.3486f;
        boolean[] bArray = new boolean[6];
        i = (int) fl;

        for (int j=0;j<10;j++) {
            i++;
        }
        while (i<=46){
            i=47;
        }
        if (bArray[2]) {
            bArray[2]=false;
        }

        String strOne = "Hello";
        strOne += "World";
        strOne.toLowerCase();
        strOne.equals("dhgfh");
        String strTwo = "xcvxbcvnx";
        if (!strOne.equals(strTwo)) {
            System.out.println("strOne"+strOne.equals(strTwo));
        }
        String.valueOf(i);
        strOne.length();
        strOne.split(" ");
        strOne.charAt(5);
        strOne.contains("ewryt");
        strOne.repeat(45);
        "Hello".repeat(5);
        strOne.matches("No Hello World!");
        strOne.compareTo("Wo");
        
        Integer.max(2, 5);
        Math.round(5.67);
        Math.ceil(3.654);
        


    }
}
