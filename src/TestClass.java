
public class TestClass {
    public static void main(String[] args) {
        Product grape = new Product();  //Create the object of class Product
        Product papaya = new Product();
    
        //grape.name = "VEN Dara";   //Error 
        String name = grape.setName("Dara");
        System.out.println(name);
    }
}
