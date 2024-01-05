/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
Öğrenci Not Sistemi
Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
Teacher Sınıfı Özellikleri :

Nitelikler : name,mpno,branch
Metotlar : Teacher()
Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
*/

package OgrenciNotSistemi;


/**
 *
 * @author LENOVO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Course mat = new Course("Matematik" , "MAT101" , "MAT");
        Course fizik = new Course("Fizik" , "FZK101" , "FZK");
        Course kimya = new Course("Kimya" , "KMY101" , "KMY");
        
        Teacher t1 = new Teacher("Mahmut Hoca" , "MAT", "00000");
        Teacher t2 = new Teacher("Fatma Ayşe" , "FZK", "11111");
        Teacher t3 = new Teacher("Ali Veli" , "KMY" , "22222");
        
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        
        Student s1 = new Student("İnek Şaban", 4 , "000",  mat, fizik, kimya);
        s1.addBulkExamNote(50,20,20,20,40,20);
        s1.isPass();
        
        Student s2 = new Student("Güdük Necmi", 4 , "111" ,  mat, fizik, kimya);
        s2.addBulkExamNote(100,20,50,20,40,20);
        s2.isPass();
        
        Student s3 = new Student("Hayta ismail", 4 , "222" , mat, fizik, kimya);
        s3.addBulkExamNote(50,20,20,20,40,20);
        s3.isPass();
        
    }
    
}
