package day02;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsiusValue, fahrenheitValue;

	    Scanner scan = new Scanner(System.in);

	    // 화씨 온도를 읽어 들인다
	    System.out.print("화씨 온도를 입력하세요: ");
	    fahrenheitValue = scan.nextDouble();

	    // 화씨 온도를 섭씨 온도로 바꾸고 그 값을 섭씨 온도를 나타내는 변수에 저장한다
		celsiusValue = 5.0/9.0 *(fahrenheitValue - 32.0);


	    // 화씨 온도와 대응하는 섭씨 온도를 출력한다
	    System.out.println("화씨 온도:\t" + fahrenheitValue);
	    System.out.println("섭씨 온도:\t" + celsiusValue);
	}

}
