package com.xpanxion.java.assignments;

import com.xpanxion.java.assignments.model.Cat;
import com.xpanxion.java.assignments.model.Department;
import com.xpanxion.java.assignments.model.Person;
import com.xpanxion.java.assignments.model.Product;

import java.util.Arrays;
import java.util.List;

public class DataAccess {

        public static List<Person> getPeople() {
                return Arrays.asList(
                        new Person(1, "Alice", "Enchange", 11, "111-11-1111"),
                        new Person(2, "Bob", "Smith", 22, "222-22-2222"),
                        new Person(3, "Charlie", "Jones", 33, "333-33-3333"),
                        new Person(4, "Dan", "Updegraf", 44, "444-44-4444"),
                        new Person(5, "Egar", "Harly", 55, "555-55-55555"),
                        new Person(6, "Frank", "Gamble", 66, "666-66-6666"),
                        new Person(7, "Guthrie", "Govan", 77, "777-77-7777"),
                        new Person(8, "Harry", "Code", 88, "888-88-8888"));
        }

        public static List<Cat> getCats() {
                return Arrays.asList(
                        new Cat(1, "Rocky", 19, "White"),
                        new Cat(2, "Baxie", 20, "Black & white"),
                        new Cat(3, "Lily", 14, "Brown"),
                        new Cat(4, "Gabby", 13, "Brown & black"),
                        new Cat(5, "Jack", 19, "Brown"),
                        new Cat(6, "Binky", 22, "Gray"),
                        new Cat(7, "Blaze", 21, "Black"),
                        new Cat(8, "Thomas", 14, "Black & Brown"));
        }

        public static List<Product> getProducts() {
                return Arrays.asList(
                        new Product(1, 1, "8 Inch Speaker", 8.00F, "spk-008"),
                        new Product(2, 1, "10 Inch Speaker", 10.00F, "spk-010"),
                        new Product(3, 1, "12 Inch Speaker", 12.00F, "spk-012"),
                        new Product(4, 2, "Bananna", 1.00F, "ban-008"),
                        new Product(5, 2, "Apple", 2.00F, "app-008"),
                        new Product(6, 2, "Orange", 3.00F, "ora-008"));
        }

        public static List<Department> getDepartments() {
                return Arrays.asList(
                        new Department(1, "Electronics"),
                        new Department(2, "Food"),
                        new Department(3, "Automotive"),
                        new Department(4, "Home"));
        }

        public static String getWords() {
                return "this is a this is a test to see if this works";
        }

        public Object getAllDepartments(DataAccess data) {
                return null;
        }


}
