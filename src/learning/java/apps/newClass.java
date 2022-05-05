package learning.java.apps;

public class newClass {
    private int addInt;

    newClass(int addInt) {
       this.addInt = addInt;
    }

    void newMethod(int num) {
        int newNum = num + addInt;
        System.out.println(newNum);
    }

    public int getAddInt() {
        return addInt;
    }
}
