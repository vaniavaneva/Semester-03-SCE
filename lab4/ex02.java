package lab4;

import java.time.LocalDate;

public class ex02 {
    
    public class Catalog{
        public String author_name;
        public int no_of_copies;
        public void updateInfo(){}
        public void searching(){}
    }

    public class Books extends Catalog{
        public String author_name;
        public int no_of_books;
        public void removeFirmCatalog(){}
        public void addToCatalog(){}
    }

    public class ReferenceBook extends Books{
        public void SearchRefbook(){}
    }

    public class GeneralBook extends Books{}

    public class Member{
        public String name;
        public String address;
        public String phone_number;
        public void requestForBook(){}
        public void returnBook(){}
    }

    public class FacultyMember{
        public String name;
        public int id;
        public void checkoutBook(){}
    }

    public class Student{
        public String name;
        public String student_id;
        public void checkoutBook(){}
        public void returnBook(){}
    }

    public class Librarian{
        public String name;
        public String address;
        public int mobile_number;
        public void updateInfo(){}
        public void issueBooks(){}
        public void verificationInfo(){}
        public void searchBook(){}
        public void returnBook(){}
    }

    public class Alert{
        public LocalDate issue_date;
        public String book_name;
        public LocalDate return_date;
        public int fine;
        public void fineCall(){}
        public void viewAlert(){}
        public void sendToLibrarian(){}
    }
}
