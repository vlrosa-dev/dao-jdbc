package application;

import model_entities.Department;

public class App {
    public static void main(String[] args) throws Exception {
        
        Department obj = new Department(2, "Books");

        System.out.println(obj);
    }
}
