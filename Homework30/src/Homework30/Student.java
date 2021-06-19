package Homework30;

	public class Student {
	    String name,stuNo;
	    int classes;
	    Course mat;
	    Course fizik;
	    Course kimya;
	    double avarage;
	    boolean isPass;


	    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
	        this.name = name;
	        this.classes = classes;
	        this.stuNo = stuNo;
	        this.mat = mat;
	        this.fizik = fizik;
	        this.kimya = kimya;
	        calcAvarage();
	        this.isPass = false;
	    }


	    public void addBulkExamNote(int mat, int fizik, int kimya) {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.note = mat;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.note = fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.note = kimya;
	        }

	    }

	    public void isPass() {
	        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
	            System.out.println("Notlar tam olarak girilmemiþ");
	        } else {
	            this.isPass = isCheckPass();
	            printNote();
	            System.out.println("Ortalama : " + this.avarage);
	            if (this.isPass) {
	                System.out.println("Sýnýfý Geçti. ");
	            } else {
	                System.out.println("Sýnýfta Kaldý.");
	            }
	        }
	    }

	    public void calcAvarage() {
	        float fizikAvarage = (float) ((this.fizik.note * 0.80)+(this.fizik.sozluHesapla(this.fizik.sozluNotu)*0.20));
	        float matAvarage = (float) ((this.mat.note * 0.80)+(this.mat.sozluHesapla(this.kimya.sozluNotu)*0.20));
	        float kimyaAvarage = (float) ((this.kimya.note * 0.80)+(this.kimya.sozluHesapla(this.kimya.sozluNotu)*0.20));
	        this.avarage = (fizikAvarage+matAvarage+kimyaAvarage) / 3;
	    
	        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
	    }

	    public boolean isCheckPass() {
	        calcAvarage();
	        return this.avarage > 55;
	    }

	    public void printNote(){
	        System.out.println("=========================");
	        System.out.println("Öðrenci : " + this.name);
	        System.out.println("Matematik Notu : " + this.mat.note);
	        System.out.println("Fizik Notu : " + this.fizik.note);
	        System.out.println("Kimya Notu : " + this.kimya.note);
	    }

	} 

