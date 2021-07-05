//package com.company;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    List<String> sinhVien = new ArrayList<String>();
	    List<String> giangVien = new ArrayList<String>();
	    int n, m;
	    System.out.println("Số sinh viên là: ");
	    n = scanner.nextInt();
	    for (int i = 0; i < n; i++) {
            sinhVien.add(scanner.next());
        }
	    System.out.println("\n" + "Số giảng viên là: ");
	    m = scanner.nextInt();
	    for (int i = 0; i < m; i++) {
            giangVien.add(scanner.next());
        }
        System.out.println("Các sinh viên là: \n");
	    for (int i = 0; i < n; i++) {
	    	int temp = i + 1;
            System.out.println(temp + "." + sinhVien.get(i) + "\n");
        }
		System.out.println("Các giảng viên là: \n");
	    for (int i = 0; i < m; i++) {
	    	int temp = i + 1;
			System.out.println(temp + "." + giangVien.get(i) + "\n");
		}
    }
}
