//ZEHRA KUTLUGÜN
//22100011002
package Odev;

import java.util.Scanner;

public class AnaSayfa {
	
	public static void BolumBilListe(int bs,Bolum[] bolum,int los,int ylos,int ds,Ogrenci[] ogrenciler,Ders[] dersler) {
		for( int i=0;i<bolum.length;i++){
			
			System.out.println("Bolum no:"+bolum[i].getBolNo());
	        System.out.println("Bolum adı:"+bolum[i].getBolAd());
	        for(int j=0;j<los&& j < bolum[i].ogrenciler.length;j++) {
	 
	        	System.out.println("Lisans Ogrencileri:");
	        	System.out.println((j+1)+".Ogrenci: "+bolum[i].ogrenciler[j].getOgrID()+" "+bolum[i].ogrenciler[j].getOgrAd()+" "+bolum[i].ogrenciler[j].getOgrSoyad()+((LisansOgrencisi) bolum[i].ogrenciler[j]).getOgrSinif());
	        	
	        }
	        for(int a=los;a<los+ylos && a < bolum[i].ogrenciler.length;a++) {
	        	System.out.println("Yuksek Lisans Ogrencileri:");
	        	System.out.println((a+1)+".Ogrenci: "+bolum[i].ogrenciler[a].getOgrID()+" "+bolum[i].ogrenciler[a].getOgrAd()+" "+bolum[i].ogrenciler[a].getOgrSoyad());
	        	
	        }
	        System.out.println("Dersler:");
	        for(int b=0;b<ds&& b < bolum[i].dersler.length;b++) {
	        	
	        	System.out.println((b+1)+".Ders: "+bolum[i].dersler[b].getDersID()+" "+bolum[i].dersler[b].getDersAd()+" "+bolum[i].dersler[b].getDersKredi());
	        }
	        
	        }
	}
	
	
	public static void LisansOgrListele(int bs,Bolum[] bolum,int los,int ylos,int ds,Ogrenci[] ogrenciler,Ders[] dersler) {
		System.out.println("Tum bolumlerdeki LİSANS Ogrencileri:");
		for (int i = 0; i < bs; i++) {
		    for (int sinif = 1; sinif <= 4; sinif++) {
		        System.out.println(sinif + ". sınıf öğrencileri:");
		        for (int j = 0; j < los && j < bolum[i].ogrenciler.length; j++) {
		            if (((LisansOgrencisi) bolum[i].ogrenciler[j]).getOgrSinif() == sinif) {
		                System.out.println(((LisansOgrencisi) bolum[i].ogrenciler[j]).getOgrID() +
		                        ((LisansOgrencisi) bolum[i].ogrenciler[j]).getOgrAd() +
		                        ((LisansOgrencisi) bolum[i].ogrenciler[j]).getOgrSoyad());
		            }
		        }
		    }
		}
		}
		
	public static void YLisansOgrListele(int bs,Bolum[] bolum,int los,int ylos,int ds,Ogrenci[] ogrenciler,int top,Ders[] dersler) {
		System.out.println("Tum bolumlerdeki YUKSEK LİSANS  ogrencileri:");
		for (int i = 0; i < bs; i++) {
    	for(int j=los;j<top && j< bolum[i].ogrenciler.length;j++) {
        	System.out.println(((YLOgrencisi) bolum[i].ogrenciler[j]).getOgrID()+((YLOgrencisi) bolum[i].ogrenciler[j]).getOgrAd()+((YLOgrencisi) bolum[i].ogrenciler[j]).getOgrSoyad());
    	}
	}
	}
	public static void DersleriListele(int bs,Bolum[] bolum,int los,int ylos,int ds,Ogrenci[] ogrenciler,int top,Ders[] dersler) {
		System.out.println("Tum Bolumlerdeki Dersler:");
		
		for (int i = 0; i < bolum.length; i++) {
		    for (int j = 0; j < bolum[i].dersler.length; j++) {
		        Ders DersYeni = (Ders) bolum[i].dersler[j];

		        int kontrol = 0;
		        for (int k = 0; k < j; k++) {
		            Ders sonrakiDers = (Ders) bolum[i].dersler[k];

		            if (DersYeni.getDersKredi() == sonrakiDers.getDersKredi()) {
		                kontrol = 1;
		                break;
		            }
		        }

		        if (kontrol==0) {
		            System.out.println(DersYeni.getDersKredi() + " Kredilik Ders:");
		            System.out.println(DersYeni.getDersID() + DersYeni.getDersAd());

		            for (int k = j + 1; k < bolum[i].dersler.length; k++) {
		                Ders DersKontrol = (Ders) bolum[i].dersler[k];

		                if (DersYeni.getDersKredi() == DersKontrol.getDersKredi()) {
		                    System.out.println(DersKontrol.getDersID() + DersKontrol.getDersAd());
		                }
		            }
		        }
		    }
		}
		
	}
	public static void AramaYap(int bs,Bolum[] bolum,int los,int ylos,int ds,Ogrenci[] ogrenciler,String aranacak,Ders[] dersler) {
		System.out.println("Arama yapacak kelimeyi gir");
		Scanner scan=new Scanner(System.in);
		aranacak=scan.next();
		int kontrol = 0;

		for (int i = 0; i < bolum.length; i++) {
		    for (int j = 0; j < bolum[i].ogrenciler.length; j++) {
		        if (bolum[i].ogrenciler[j].getOgrAd().equals(aranacak) || bolum[i].ogrenciler[j].getOgrSoyad().equals(aranacak)) {
		            kontrol = 1;
		            System.out.println("Ogrenci Bulundu: " + bolum[i].getBolAd() + " Bolumunde okuyor");

		            if (j < los) {
		                System.out.println("Lisans Ogrencisi");
		            } else if (j < los + ylos) {
		                System.out.println("Yuksek Lisans Ogrencisi");
		            }

		            System.out.println("Ogrencinin ismi: " + bolum[i].ogrenciler[j].getOgrAd() + " " + bolum[i].ogrenciler[j].getOgrSoyad());
		        }
		    }
		}

		if (kontrol==0) {
			int kontrol2=0;
		    System.out.println("Ogrenci bulunamadı");
		    for (int i = 0; i < bolum.length; i++) {
		    	for(int b=0;b<ds&& b < bolum[i].dersler.length;b++) {
		    		if(bolum[i].dersler[b].getDersAd().equals(aranacak)) {
		    			System.out.println("Bolum adı: "+bolum[i].getBolAd()+"Ders adı: "+bolum[i].dersler[b].getDersAd());
		    			kontrol2=1;
		    		}
		    		
		    	}
		    	if(kontrol2==0) {
	    			System.out.println("ders bulunamadı");}
	    		
		    }
		    
		}
	}

	public static void main(String[] args) {
		System.out.println("Kac bolum olacak");
		Scanner scan=new Scanner(System.in);
		int bs=scan.nextInt();
		Bolum[] bolum=new Bolum[bs];
		Ogrenci[] ogrenciler= null;
		Ders[] dersler=null;
		
	
		int los=0;
		int ylos=0;
		int top=0;
		int ds=0;
		String aranacak=" ";
		
		for(int i=0;i<bs;i++) {
		System.out.println("Bolum no giriniz");
		int bolumno=scan.nextInt();
		System.out.println("Bolum ad giriniz");
		String bad=scan.next();
		bolum[i]=new Bolum(bolumno,bad);
		
		System.out.println("toplam kac ogrenci gireceksiniz");
		top=scan.nextInt();
		bolum[i].ogrenciler =new  Ogrenci[top];
		
		System.out.println("Kac tane lisans ogrencisi olacak:");
		los=scan.nextInt();
		for(int j=0;j<los;j++) {
			
			System.out.println("Lisans ogrencisinin adını giriniz");
			String lad=scan.next();
			System.out.println("Lisans ogrencisinin soyadını giriniz");
			String lsoyad=scan.next();
			System.out.println("Lisans ogrencisinin sınıfını giriniz");
			int ls=scan.nextInt();
			bolum[i].ogrenciler[j]=new LisansOgrencisi(bolumno,lad,lsoyad,ls);	
		}
			
		System.out.println("Kac tane yuksek lisans ogrencisi olacak");
		ylos=scan.nextInt();
		for( int j=los;j<los+ylos;j++) {
			System.out.println("Yuksek Lisans ogrencisinin adını giriniz");
			String ylad=scan.next();
			System.out.println("Yuksek Lisans ogrencisinin soyadını giriniz");
			String ylsoyad=scan.next();
			
			bolum[i].ogrenciler[j]=new YLOgrencisi(bolumno,ylad,ylsoyad);
		}
		
		System.out.println("Bu bolum için kac ders acılacak:");
		ds=scan.nextInt();
		bolum[i].dersler =new  Ders[ds];
		for(int a=0;a<ds;a++) {
			System.out.println("Ders adını giriniz:");
			String dad=scan.next();
			System.out.println("Ders kredisini giriniz:");
			int dkre=scan.nextInt();
			bolum[i].dersler[a]=new Ders(bolumno,5,dad,dkre);	
		}
		}
		
		while(true) {
			System.out.println("1-Tum bolumlerin Bilgilerini Listele"
					+ "2-Lisans Ogrencilerini Listele"
					+ "3-Yuksek Lisans Ogrencilerini Listele"
					+ "4-Dersleri Listele"
					+ "5-Arama Yap"
					+ "6-CIKIS");
			int secim=scan.nextInt();
			switch(secim) {
			case 1: BolumBilListe(bs,bolum,los,ylos,ds,ogrenciler,dersler);
			break;
			case 2: LisansOgrListele(bs,bolum,los,ylos,ds,ogrenciler,dersler);
		    break;
			case 3: YLisansOgrListele(bs,bolum,los,ylos,ds,ogrenciler,top,dersler);
			break;
			case 4: DersleriListele(bs,bolum,los,ylos,ds,ogrenciler,top,dersler);
			break;
			case 5:AramaYap(bs,bolum,los,ylos,ds,ogrenciler,aranacak,dersler);
			break;
			case 6:System.out.println("CIKIS yapılıyor");
			System.exit(0);
			break;
			
			}	
				
			}
		}
		
}
package Odev;


public class Bolum {
	private int bolNo;
	private String bolAd;
	public 	Ogrenci ogrenciler[];
	public Ders dersler[];
	public Bolum(int bolNo, String bolAd) {
		this.bolNo = bolNo;
		this.bolAd = bolAd;
			
	}
	public int getBolNo() {
		return bolNo;
	}
	public void setBolNo(int bolNo) {
		this.bolNo = bolNo;
	}
	public String getBolAd() {
		return bolAd;
	}
	public void setBolAd(String bolAd) {
		this.bolAd = bolAd;
	}
	
	
	

}
package Odev;



public class Ders {
	private int bolumNo;
	private int dersID;
	private String dersAd;
	private int dersKredi;
	private static int count=10;
	
	public Ders(int bolumNo, int dersID, String dersAd, int dersKredi) {
		this.bolumNo = bolumNo;
		count++;
		this.dersID = count;
		this.dersAd = dersAd;
		this.dersKredi = dersKredi;
	}
	Ders dersler[]=new Ders [100];


	public int getBolumNo() {
		return bolumNo;
	}
	public void setBolumNo(int bolumNo) {
		this.bolumNo = bolumNo;
	}
	public int getDersID() {
		return dersID;
	}
	public void setDersID(int dersID) {
		this.dersID = dersID;
	}
	public String getDersAd() {
		return dersAd;
	}
	public void setDersAd(String dersAd) {
		this.dersAd = dersAd;
	}
	public int getDersKredi() {
		return dersKredi;
	}
	public void setDersKredi(int dersKredi) {
		this.dersKredi = dersKredi;
	}
	
	
	

}
package Odev;


public class LisansOgrencisi extends Ogrenci{
	private int ogrID;
	private int ogrSinif;
	private String durum;
	private static int count=0;
	public LisansOgrencisi(int bolNo, String ogrAd, String ogrSoyad) {
		super(bolNo, ogrAd, ogrSoyad);
	}
	public LisansOgrencisi(int bolNo, String ogrAd, String ogrSoyad,int ogrSinif) {
		super(bolNo, ogrAd, ogrSoyad);
		this.ogrSinif=ogrSinif;
		this.durum="LİSANS";
		count+=5;
		this.ogrID=count;
	}

	

	public int getOgrID() {
		return ogrID;
	}
	public void setOgrID(int ogrID) {
		this.ogrID = ogrID;
	}
	public int getOgrSinif() {
		return ogrSinif;
	}
	public void setOgrSinif(int ogrSinif) {
		this.ogrSinif = ogrSinif;
	}
	public String getDurum() {
		return durum;
	}
	public void setDurum(String durum) {
		this.durum = durum;
	}
}
package Odev;



public class Ogrenci {
	private int bolNo;
	private String ogrAd;
	private String ogrSoyad;
	private int ogrID;
	public Ogrenci(int bolNo, String ogrAd, String ogrSoyad) {
		this.bolNo = bolNo;
		this.ogrAd = ogrAd;
		this.ogrSoyad = ogrSoyad;
		this.ogrID=ogrID;
	}
	
	Ogrenci ogrenciler[]=new Ogrenci [100];
	


	public int getOgrID() {
		return ogrID;
	}

	public void setOgrID(int ogrID) {
		this.ogrID = ogrID;
	}

	public int getBolNo() {
		return bolNo;
	}

	public void setBolNo(int bolNo) {
		this.bolNo = bolNo;
	}

	public String getOgrAd() {
		return ogrAd;
	}

	public void setOgrAd(String ogrAd) {
		this.ogrAd = ogrAd;
	}

	public String getOgrSoyad() {
		return ogrSoyad;
	}

	public void setOgrSoyad(String ogrSoyad) {
		this.ogrSoyad = ogrSoyad;
	}
	
	
	}
package Odev;

public class YLOgrencisi extends Ogrenci {
	private int ogrID;
	private String durum;
	private static int count=100;
	public YLOgrencisi(int bolNo, String ogrAd, String ogrSoyad) {
		super(bolNo, ogrAd, ogrSoyad);
		this.durum="YUKSEK LİSANS";
		count+=5;
		this.ogrID=count;
	}
	public int getOgrID() {
		return ogrID;
	}
	public void setOgrID(int ogrID) {
		this.ogrID = ogrID;
	}
	public String getDurum() {
		return durum;
	}
	public void setDurum(String durum) {
		this.durum = durum;
	}
	
}
