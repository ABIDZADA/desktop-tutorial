
public class Main{


public static void main(String[] args) {
    ogrenciler ogrenci1 = new ogrenciler("Gökhan","Bilgisayar Müh",1985, 10);
    ogrenciler ogrenci2 = new ogrenciler("Ayşe", "Makine Müh.", 1985,10);
    ogrenciler ogrenci3 = new ogrenciler("Elif", "Makine Müh.", 2020,10, 1.98f);
    ogrenciler ogrenci4 = new ogrenciler(2020,10);



    ogrenci1.olusturOgrNo();
    ogrenci2.olusturOgrNo();
    ogrenci3.olusturOgrNo();
    ogrenci4.olusturOgrNo();

    ogrenci3.ganoKontrol();

    System.out.println("Öğrenci Bilgileri");

    System.out.println(
            "OGR-1 "+ogrenci4.getAd() + " " + ogrenci4.getBolum() + " " + ogrenci4.getOgrNo() + " " +
                    ogrenci4.getGano()
    );
    System.out.println(
            "OGR-2 "+ogrenci1.getAd() + " " + ogrenci1.getBolum() + " " + ogrenci1.getOgrNo() + " " +
                    ogrenci1.getGano()
    );
    System.out.println(
            "OGR-3 "+ogrenci2.getAd() + " " + ogrenci2.getBolum() + " " + ogrenci2.getOgrNo() + " " +
                    ogrenci2.getGano()
    );
    System.out.println(
            "OGR-4 "+ogrenci3.getAd() + " " + ogrenci3.getBolum() + " " + ogrenci3.getOgrNo() + " " +
                    ogrenci3.getGano()
    );

    System.out.println("1. Öğrencinin ödeyeceği harç: "+ ogrenci1.harcHesapla(5));
    System.out.println("3. Öğrencinin ödeyeceği harç: "+ ogrenci1.harcHesapla(5, 3 ));

}

}
