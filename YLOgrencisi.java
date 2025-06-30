//ZEHRA KUTLUGÜN
//22100011002
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