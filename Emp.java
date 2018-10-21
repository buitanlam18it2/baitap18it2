package quanly;

public class Emp {
	private String manv;
	String ten;
	float sogio, hsluong, phucap;
	String ns;
	public String getmanv() {
		return manv;
	}
	public void setmanv(String manv) {
		this.manv = manv;
	}
	public String getten() {
		return ten;
	}
	public void setten(String ten) {
		this.ten = ten;
	}
	public float getsogio() {
		return sogio;
	}
	public void setSogio(float sogio) {
		this.sogio = sogio;
	}
	public float gethsluong() {
		return hsluong;
	}
	public void sethsluong(float hsluong) {
		this.hsluong = hsluong;
	}
	public float getphucap() {
		return phucap;
	}
	public void setphucap(float phucap) {
		this.phucap = phucap;
	}
	public String getns() {
		return ns;
	}
	public void setns(String ns) {
		this.ns = ns;
	}
	public Emp(String manv, String ten, float sogio, float hsluong, float phucap, String ns)
	{
		this.manv=manv;
		this.ten=ten;
		this.sogio=sogio;
		this.hsluong=hsluong;
		this.phucap=phucap;
		this.ns=ns;	
 	}
}
