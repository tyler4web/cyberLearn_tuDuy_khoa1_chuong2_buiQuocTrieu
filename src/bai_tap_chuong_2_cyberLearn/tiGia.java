package bai_tap_chuong_2_cyberLearn;

import java.util.Scanner;

public class tiGia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int tiGia = 23500;
double usd;
double vnd;


Scanner input = new Scanner(System.in);
System.out.println("Nhap vao so USD");
usd = input.nextDouble();

vnd = usd * tiGia;

System.out.println( usd + " USD = " + vnd + "VND"
		);


	}

}
