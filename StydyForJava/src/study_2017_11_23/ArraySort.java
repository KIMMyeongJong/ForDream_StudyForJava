package study_2017_11_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraySort {

	public static void main(String[] args) {
		Random rand = new Random();

		final int SIZE = 10;
		int[] randArr = new int[SIZE];
		String[] nameArr = { "�����", "�ڸ���", "�����", "��������", "������", "�����" };
		for (int i = 0; i < SIZE; i++) {
			randArr[i] = rand.nextInt(500);
		}//������ ���� �迭 ������ŭ �߻����� �����ϴ� for end

		for (int i : randArr) {
			System.out.print("  " + i);
		}//���ĵ��� ���� ������ �� �迭 ��� for end
		System.out.println();
		Arrays.sort(randArr);
		// ArraysŬ������ sort�޼ҵ带 ���� �迭�� ���Ľ�Ų��
		for (int i : randArr) {
			System.out.print("   " + i);
		}
		System.out.println();
		for (String i : nameArr) {
			System.out.print("   " + i);
		}//���ĵ��� ���� �迭 ��� for end
		System.out.println();
		Arrays.sort(nameArr);
		for (String i : nameArr) {
			System.out.print("   " + i);
		}//���ĵ� �̸� �迭 ��� for end
	}//main method end

}//class end
