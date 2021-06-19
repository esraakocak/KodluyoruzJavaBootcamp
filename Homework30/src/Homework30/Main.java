package Homework30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        
       
        mat.sozluHesapla(100);
        fizik.sozluHesapla(80);
        kimya.sozluHesapla(50);

        Teacher t1 = new Teacher("Esra Koçak", "90550000000", "MAT");
        Teacher t2 = new Teacher("deneme ", "90550000001", "FZK");
        Teacher t3 = new Teacher("deneme 2", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("melisa", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(80,20,40);
        s1.isPass();

        Student s2 = new Student("mine", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("deneme5", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass(); 
   
	}

}
