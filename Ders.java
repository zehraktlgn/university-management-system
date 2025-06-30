//ZEHRA KUTLUGÜN
//22100011002
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

