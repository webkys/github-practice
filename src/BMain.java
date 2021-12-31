import java.util.Scanner;

// sql 문제 발생시 : 스프링깔린 폴더에 workspace -> .metadata -> .plugins -> org.eclipse.datatools.sqltools.result 폴더 삭제

// Bad Maintenance

// jar

//만약 적립률을 다르게해서 배포해야된다면?
// java 소스 내용을 수정 -> 컴파일 -> 테스트 -> 재배포 -> 다시 건내주기

public class BMain {

	public static void main(String[] args) {
		
		// 물건을 샀는데 포인트 적립
		// 구매가격 : 1000
		// 적립포인트 : 100
		// 10% 적립
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("구매가격:");
		int price = k.nextInt();
		
		double pointRate = 0.1;
		
		double point = price * pointRate; 
		//예) 1000원 X 0.1 = 100원적립
		System.out.printf("적립 포인트: %.1f 점", point);
		
		
	}
	
	
}
