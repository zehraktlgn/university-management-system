//ZEHRA KUTLUGÜN
//22100011002
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
