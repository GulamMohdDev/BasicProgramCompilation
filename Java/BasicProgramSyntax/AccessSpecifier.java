//Example of using a public access specifier in Java
public class AccessSpecifier {
    // Public access specifier example
    public String publicField = "I am public"; 
    private String privateField = "I am private";
    protected String protectedField = "I am protected";
    String defaultField = "I am default"; // default access specifier
    public static void main(String[] args) {
        AccessSpecifier obj = new AccessSpecifier();
        System.out.println(obj.publicField);      // Accessible
        System.out.println(obj.privateField);     // Accessible within the same class
        System.out.println(obj.protectedField);   // Accessible within the same package
        System.out.println(obj.defaultField);     // Accessible within the same package
    }
}
