package HomeworkGit;

public class _04_03_2026_HomeWork_1 {
    static void main() {
        //shagird melumatlari : Ad, Soyad, Ata Adi, Yash, MektebNo, Sinifi (int), Cinsi (K/Q)
        Shagird sg1 = new Shagird();
        sg1.ad = "Anotnio";
        sg1.soyad = "Banderas";
        sg1.ataAdi = "Alex";
        sg1.age = 16;
        sg1.gender = 'K';
        sg1.mektebNo = 3;
        sg1.sinifi = 10;
        System.out.println("Sagird Haqqinda melumat ");
        System.out.println("Sagirdin adi: "+sg1.ad);
        System.out.println("Sagirdin soyadi: "+sg1.soyad);
        System.out.println("Sagirdin Ata adi: "+sg1.ataAdi);
        System.out.println("Sagirdin yasi: "+sg1.age);
        System.out.println("Sagirdin cinsi: "+sg1.gender);
        System.out.println("Sagirdin mektebno: "+sg1.mektebNo);
        System.out.println("Sagirdin sinifi: "+sg1.sinifi);
    }
}

class Shagird {
    int mektebNo;
    String ad;
    String soyad;
    String ataAdi;
    int age;
    char gender;
    int sinifi;

}


