import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// Easy Maintenance

// Spring 이 추구하는 스타일 (유지보수)

// 수정이 일어날만한 부분 : 외부파일에 (C:\Users\hanko\Desktop\winter)
// java에서는 그 파일을 불러다가 사용
public class EMain {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("구매가격:");
		int price = k.nextInt();
		
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\hanko\\Desktop\\winter\\pointRate.txt");
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String pr = null;
		try {
			pr = br.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		double pintRate = Double.parseDouble(pr);
		
		double pointRate = 0;
		
		double point = price * pointRate; 
		//예) 1000원 X 0.1 = 100원적립
		System.out.printf("적립 포인트: %.1f 점", point);
	}

}
