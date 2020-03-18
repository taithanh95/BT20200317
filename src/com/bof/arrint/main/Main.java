package com.bof.arrint.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final int FIVE_HUNDRED = 500;

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Nhap vao so luong phan tu: ");
			n = sc.nextInt();
		} while (n < 0);
		int arrInt[] = new int[n];

		System.out.println("Nhap cac phan tu cho mang: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + i + ": ");
			arrInt[i] = sc.nextInt();
		}
		System.out.println("\nMang sau khi nhap: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arrInt[i] + " ");
		}
		// Tim tap hop so co tong tiem can 500

		Arrays.sort(arrInt);
		String content = Arrays.toString(arrInt);
		System.out.println("\nMang sau khi sap xep tang dan: " + content);

		System.out.println("Gia tri be nhat la: " + arrInt[0]);
		System.out.println("Gia tri lon nhat la: " + arrInt[arrInt.length - 1]);
	}
}