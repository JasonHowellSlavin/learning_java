package learning.java.apps;

public class Practice {
    public static void main(String[] args) {
        String helloSentence = "Hello from the IDE inside learning.java,apps";
        String[] breakfast = new String[]{"eggs", "bacon", "toast"};

        printS(helloSentence + "Static method");

        Practice myPractice = new Practice();
        myPractice.print("Instance method");

        for(int i = 0; i < breakfast.length; i++) {
            printS(breakfast[i]);
        }

        breakfast[0] = "apple";

        for(int i = 0; i < breakfast.length; i++) {
            printS(breakfast[i]);
        }

        newClass mc = new newClass(4);
        mc.newMethod(3);
    }

    // Static methods are attached to a class, non static methods are attached to an instance of a class
    static void printS(String data) {
        System.out.println(data);
    }

    void print(String data) {
        System.out.println(data);
    }
}
