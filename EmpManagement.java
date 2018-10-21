package quanly;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class EmpManagement {
	Vector list = new Vector();
	public EmpManagement() {
		while(true) {
			System.out.println("Quan nhan vien");
			System.out.println("1. Nhap thong tin");
			System.out.println("2. Xem thong tin");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void Chonlai()
{
	int n;
	Scanner key=new Scanner(System.in);
	System.out.println("Moi ban chon lai");
	n=key.nextInt();
	}
	public void NhapTT()
	{
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong nhan vien ");
		n =key.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Nhap ten nhan vien ");
			String ten = key.next();
			System.out.println("Nhap ma nhan vien ");		
			String manv = key.next();				
			System.out.println("Ngay thang nam sinh ");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String ns=key.next();	
			System.out.println("Nhap so gio lam viec ");
			float sogio=key.nextFloat();
			System.out.println("Nhap he so luong lam viec ");
			float hsluong=key.nextFloat();
			System.out.println("Nhap phu cap ");
			float phucap=key.nextFloat();
			Emp em = new Emp(manv,ten,sogio,hsluong,phucap,ns);
			list.add(em);
	}	
	}
public void InTT() {
	Enumeration eEmp = list.elements();
	int i=1;
	while(eEmp.hasMoreElements()) {
		Emp emp = (Emp)eEmp.nextElement();
		System.out.println("Ma nhan vien la "+emp.getmanv()+"\nTen nhan vien "+emp.getten() + "\nSinh ngay " + emp.getns()+"\nDa lam viec trong " + emp.getsogio() + " gio\nHe so luong: " + emp.gethsluong()+ "\nPhu cap "+ emp.getphucap());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new EmpManagement();
	}
}
