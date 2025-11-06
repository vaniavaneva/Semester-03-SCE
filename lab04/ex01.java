package lab04;

import java.util.List;

public class ex01 {
    public static void main(String[] args) {}
        public class Address {
            private String street;
            private String city;
            private String state;
            private String postalCode;
            private String country;
    
            public boolean validate(){
                return true;
            }
        }
        public class Person {
            private Address address;
            private String name;
            private int age = 0;
            private double phoneNumber;
            private String emailAddress;
    
            public boolean hasParkingPass(){
                return true;
            }
        }
        
        public class Professor extends Person{
            private List<Student> listOfStudents;
            private double salary;
            
            public void applyExamination(){}
        }

        public class Student extends Person {
            private double studentNumber;

            public boolean isEligibleToEnroll(Student student){
                return true;  
            }
        }
}




