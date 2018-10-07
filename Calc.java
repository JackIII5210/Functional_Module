package com.lanyu96.test1;

import java.util.Scanner;

/**
 * ��ģ��Ĺ�����ʵ�ּ���������
 * 
 * �ɼ��� +, -, *, /, %
 */
public class Calc {
	public static void main(String[] args) {
		System.out.println("--------������--------");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter :");
			String s = sc.next();
			if(s.equals("CE")) {
				System.out.println("Stop!");
				break;
			}
			Calculation(s);
		}
	}

	/**
	 * ����:����
	 */
	private static void Calculation(String s) {
		if (s.contains("*")) { // �˷�����
			String[] sp = s.split("\\*");
			int number = Integer.parseInt(sp[0]) * Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"*"+sp[1]+"="+number);
		} else if (s.contains("/")) {// ��������
			String[] sp = s.split("\\/");
			int number = Integer.parseInt(sp[0]) / Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"/"+sp[1]+"="+number);
		} else if (s.contains("+")) {// �ӷ�����
			String[] sp = s.split("\\+");
			int number = Integer.parseInt(sp[0]) + Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"+"+sp[1]+"="+number);
		} else if (s.contains("-")) {// ��������
			String[] sp = s.split("\\-");
			int number = Integer.parseInt(sp[0]) - Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"-"+sp[1]+"="+number);
		} else if (s.contains("%")) {// ȡ������
			String[] sp = s.split("\\%");
			int number = Integer.parseInt(sp[0]) % Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"%"+sp[1]+"="+number);
		}else {
			System.out.println("��������ȷ����ֵ!");
		}
	}

	
}
