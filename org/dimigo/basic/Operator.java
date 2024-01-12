package org.dimigo.basic;
  
public class Operator {
 
	public static void main(String[] args) {
		int avgSalary = 1700000;
		int numOfEmployee = 3;
		int numOfStore = 1500;

		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", avgSalary) + "원");
		System.out.println("점포 내 직원수 : " + numOfEmployee + "명");
		System.out.println("점포 수 : " + String.format("%,d", numOfStore) + "개");
		
		// int의 범위를 벗어나므로 long 타입으로 변환해주기
		long annualCost = avgSalary * 12L * numOfEmployee * numOfStore;
		
		System.out.println("\n연간 인건비 : " + String.format("%,d", annualCost) + "원");
		
	}
}