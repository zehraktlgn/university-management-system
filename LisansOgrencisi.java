//ZEHRA KUTLUGÜN
//22100011002
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
