/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Student Sınıfı Özellikleri :
Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()*/
package OgrenciNotSistemi;

/**
 *
 * @author LENOVO
 */
public class Student {
    String name;
    String stuNo;
    int classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    public Student(String name , int classes , String stuNo , Course c1 , Course c2 , Course c3) {
       this.name = name;
       this.stuNo = stuNo;
       this.classes = classes;
       this.c1 = c1;
       this.c2 = c2;
       this.c3 = c3;
       calcAvarage();
       this.isPass = false;
    }
    
    void addBulkExamNote(int note1 , int c1soz, int note2 , int c2soz , int note3, int c3soz){
        if((note1 >= 0 && note1<=100) && (c1soz >= 0 && c1soz <=100)){
            this.c1.note = note1;
            this.c1.performanceNote = c1soz;
            this.c1.finalNote = (this.c1.performanceNote * 0.20) + (this.c1.note* 0.80);
        }
        if((note2 >= 0 && note2<=100) && (c2soz >= 0 && c2soz <= 100)){
            this.c2.note = note2;
            this.c2.performanceNote = c2soz;
            this.c2.finalNote = (this.c2.performanceNote * 0.20)+(this.c2.note*0.80);
        }
        if((note3 >= 0 && note3<=100) && (c3soz >= 0 && c3soz <= 100)){    
            this.c3.note = note3;
            this.c3.performanceNote = c3soz;
            this.c3.finalNote = (this.c3.performanceNote * 0.20)+(this.c3.note*0.80);
        }
       
    }
    
    void isPass(){
        if(this.c1.finalNote == 0 || this.c2.finalNote == 0 || this.c3.finalNote == 0){
            System.out.println("Notlar Tam Olarak Girilmemiş");
        }
        else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if(this.isPass){
                System.out.println("Sınıfı Geçti");
            }
            else{
                System.out.println("Sınıfta Kaldı");
            }
        }
    }
    void calcAvarage(){
        this.avarage = (this.c1.finalNote + this.c2.finalNote + this.c3.finalNote)/3.0;
    }
    boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 55;
    }
    
    void printNote(){
        System.err.println("--------");
        System.out.println("Öğrenci : " +this.name);
        System.out.println(c1.name + " Notu\t : " +this.c1.finalNote);
        System.out.println(c2.name + " Notu\t : " +this.c2.finalNote);
        System.out.println(c3.name + " Notu\t : " +this.c3.finalNote);
    }
    
}

