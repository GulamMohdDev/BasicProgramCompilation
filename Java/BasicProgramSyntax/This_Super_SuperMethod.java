public class This_Super_SuperMethod {
    public static void main(String[] args) {
        // Creating an instance of the Child class
        Parent child = new Parent();
        child.show();
    }
    static class GrandParent {
        void show() {
            System.out.println("Method from GrandParent class");
        }
    }
    static class Parent extends GrandParent {
        void show() {
            System.out.println("Method from Parent class");
        }
    }
}
