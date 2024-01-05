/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Course Sınıfı Özellikleri :
Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()*/
package OgrenciNotSistemi;

/**
 *
 * @author LENOVO
 */
public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int performanceNote;
    double finalNote;

    public Course(String name , String code , String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.performanceNote = 0;
        this.finalNote = 0;
    }
    void addTeacher(Teacher teacher){
       if(this.prefix.equals(teacher.branch)){
           System.out.println("İşlem Başarılı");
       }
       else{
           System.out.println(teacher.name+" Akademisyeni bu dersi veremez.");
       }
    }
    
    void printTeacher(){
        if(this.teacher != null){
            System.out.println(this.name + " Akademisyeni : " + this.teacher.name);
        }
        else{
            System.out.println(this.name + " Akademisyeni Atanamamıştır");
        }
    }
    
}

