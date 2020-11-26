package bai_tap_chuong_2_cyberLearn;

import java.util.Scanner;

public class averageSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double sum = 0;
int averageSum;
int soChia =5;

Scanner input = new Scanner(System.in);
System.out.println("Nhập số thứ nhất:");
sum += input.nextDouble();
System.out.println("Nhập số thứ hai:");
sum += input.nextDouble();
System.out.println("Nhập số thứ ba:");
sum += input.nextDouble();
System.out.println("Nhập số thứ bốn:");
sum += input.nextDouble();
System.out.println("Nhập số thứ năm:");
sum += input.nextDouble();	

averageSum = (int) (sum/soChia);
System.out.println("Giá trị trung bình của các số trên là " + averageSum);
	}
}
