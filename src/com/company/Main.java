package com.company;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static class Stdin {
		private final String name, id, classId;

		public Stdin(String name, String id, String classId) {
			this.name = name;
			this.id = id;
			this.classId = classId;
		}
	}

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    List<Stdin> sinhVien = new ArrayList<>();
	    List<String> giangVien = new ArrayList<>();
	    int n, m;
	    System.out.println("Số sinh viên là: ");
	    n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Hãy nhập thông tin các sinh viên");
	    for (int i = 0; i < n; i++) {
	    	int j = i + 1;
	    	String tName, tId, tClassId;
			System.out.println("Nhập tên sinh viên " + j + ": ");
            tName = scanner.nextLine();
			System.out.println("Nhập mã số sinh viên " + j + ": ");
			tId = scanner.nextLine();
			System.out.println("Nhập tên lớp của sinh viên " + j + ": ");
			tClassId = scanner.nextLine();
			Stdin temp = new Stdin(tName, tId, tClassId);
			sinhVien.add(temp);
        }
	    for (int i = 0; i < n; i++) {
			System.out.println(sinhVien.get(i).name + ", " + sinhVien.get(i).id + ", " + sinhVien.get(i).classId + "\n");
		}
	    System.out.println("Số giảng viên là: ");
	    m = scanner.nextInt();
	    scanner.nextLine();
		System.out.println("Hãy nhập tên các giảng viên");
	    for (int i = 0; i < m; i++) {
	    	int j = i + 1;
			System.out.println("Giảng viên " + j + ": ");
            giangVien.add(scanner.nextLine());
        }
        while (true) {
			System.out.println("Nhấn 1 nếu bạn muốn tìm thông tin sinh viên, 2 để biết các giảng viên hoặc -1 để kết thúc chương trình!");
			//clearScreen();
			int opt = scanner.nextInt();
			if (opt == 1) {
				boolean check = false;
				scanner.nextLine();
				System.out.println("Nhập mã số sinh viên hoặc tên sinh viên: ");
				String inf = scanner.nextLine();
				for (int i = 0; i < n; i++) {
					if (sinhVien.get(i).name.equals(inf) || sinhVien.get(i).id.equals(inf)) {
						check = true;
						System.out.println("Tên sinh viên: " + sinhVien.get(i).name + "\n");
						System.out.println("Mã số sinh viên: " + sinhVien.get(i).id + "\n");
						System.out.println("Mã lớp sinh viên: " + sinhVien.get(i).classId);
						break;
					}
				}
				if (!check) System.out.println("Sinh viên không tồn tại!");
			}
			else if (opt == 2) {
				for (int i = 0; i < m; i++) {
					int j = i + 1;
					System.out.println("Giảng viên " + j + " : " + giangVien.get(i) + "\n");
				}
			}
			else if (opt == -1) return;
			else {
				System.out.println("Hãy nhập lại lựa chọn của bạn!");
			}
		}
    }
}
