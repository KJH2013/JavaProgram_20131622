package day02;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int compgrade, proggrade, mathgrade, archgrade;
		int avg = 0;

		compgrade = 88;
		proggrade = 92;
		mathgrade = 79;
		archgrade = 80;
		
		avg = (compgrade+proggrade+mathgrade+archgrade)/4;
		
		System.out.println("영작문 과목의 점수:\t\t" + compgrade);
		System.out.println("프로그래밍  과목의 점수:\t" + proggrade);
		System.out.println("이산수학  과목의 점수:\t\t" + mathgrade);
		System.out.println("컴퓨터구조  과목의 점수:\t" + archgrade);
		System.out.println("============================");
		System.out.println("평균 점수:\t\t\t" + avg);

		        
	}

}
