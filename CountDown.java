package com.lanyu96.test1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ��ȡ2022��"����-�żҿ�"���»ᵹ��ʱ���ж�����
 */
public class CountDown {
	public static void main(String[] args) {
//		Thread t1 = new Thread();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		c.setTime(date);
		long timeNow = c.getTimeInMillis();
		String s = sdf.format(date);
		System.out.println("������" + s);// ��ʾ��ǰʱ��
		c.set(2022, 2 - 1, 4);
		long timeEnd = c.getTimeInMillis();
		long day = timeEnd - timeNow; // �ý���ʱ���ȥ��ǰʱ��
		long dayCountDown = day / 1000 / 60 / 60 / 24;// ��ȡ����,��ʽ������
		System.out.println("�����żҿڶ��»ỹ��" + dayCountDown + "��");
	}
}
