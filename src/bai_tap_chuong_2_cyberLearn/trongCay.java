package bai_tap_chuong_2_cyberLearn;

import java.util.Scanner;

public class trongCay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double chieuDaiSan, banKinhMotCay, khongGianCanThiet, soCay, khongGianTrong;

Scanner input = new Scanner(System.in);
System.out.println("Nhap chieu sai san");
chieuDaiSan = Double.parseDouble(input.nextLine());
System.out.println("Nhap ban kinh cua mot cay phat trien day du");
banKinhMotCay = Double.parseDouble(input.nextLine());
System.out.println("Nhap khong gian can thiet giua cac cay phat trien day du");
khongGianCanThiet = Double.parseDouble(input.nextLine());

soCay = (int) (chieuDaiSan / (banKinhMotCay + khongGianCanThiet));
khongGianTrong =(int) ((2*banKinhMotCay)*(2*banKinhMotCay*soCay + (soCay-1)*khongGianCanThiet));

System.out.println("So cay co the trong duoc la:	" + soCay);
System.out.println("Tong khong gian se duoc chiem boi nhung cay trong hoan toan la: 	" + khongGianTrong);
		
		
	}

}
/*
 * 1. Tao bien chieuDaiSan, banKinhMotCay, khongGianCanThiet, soCay, khongGianTrong
 * 2. In thong bao nhap chieu dai, ban kinh, khong gian can thiet
 * 3. Nhap chieu dai, ban kinh, khong gian can thiet
 * 4. tinh so cay co the trong duoc bang cong thuc:
 * soCay = chieuDaiSan / (banKinhMotCay + khongGianCanThiet)
 * 5. Tinh Khong gian chiem boi mot cay
 * khongGianChiem = (2*banKinhMotCay)*(2*banKinhMotCay*soCay+(soCay-1)*khongGianCanThiet);
 * 6. In ket qua ra man hinh 
 * */