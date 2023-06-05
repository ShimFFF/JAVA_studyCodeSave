package pratice;

import java.util.Scanner;
import java.io.*;
import java.util.Random;
//걍 import java.io.* 하면 자바 IO 다 import 하는 듯


public class PraticeFileIO {
	
	
	public static void main(String []args) {
		
		String fileNmCSV="java_CSV_file_io_pratice.txt";
		CSVfileTest(fileNmCSV); 
		
		String fileNmBin="java_Bin_file_io_pratice.bin";
		BinfileTest(fileNmBin);
		
		
	}
	
	//파일이름 얻고 파일 만들고, 10개 래던 인트 저장하고, 
	//닫고 다시 오픈하고, 평균 민 맥스
	public static void CSVfileTest(String fileNm) {
		
		//파일 만드릭
		//PrintWriter 객체는 파일 생성함 (동일 이름 파일 있으면 내용 사라짐)
		PrintWriter outPutStream = null;
		try {
			outPutStream = new PrintWriter(fileNm);
		}catch(FileNotFoundException e) {
			System.out.println("Error open file "+e.getMessage());
			System.exit(0);
		}
		//파일 쓰기
		Random rand=new Random();
		for(int i=0;i<10;i++) {
			outPutStream.println((i+1)+"번 숫자 : "+ rand.nextInt(100));
		}
		outPutStream.close();//파일 닫아줘야 작업 완료(파일에 저장됨)
		
		
		//기존 파일 열기
		PrintWriter outPutStream2 =null;
		FileWriter fileW=null;
		
		try {
			//이런 식으로 생성하면 기존 파일 열 수 있음
			fileW=new FileWriter(fileNm, true);
			outPutStream2 = new PrintWriter(fileW);
		}catch(IOException e) {
			System.out.println("Error open file "+e.getMessage());
			System.exit(0);
		}
		//11번째 숫자
		outPutStream2.println("11번 숫자 : "+rand.nextInt(100));
		outPutStream2.close(); //파일 닫아줘야 작업 완료
		
		
		//파일 읽기
		Scanner inputStream=null;
		try {
			File file = new File(fileNm);
			inputStream=new Scanner(file);
			
			
		}catch(FileNotFoundException e) {
			System.out.println("Error open file "+e.getMessage());
			System.exit(0);
		}
		//다음 줄이 없으면 파일 읽기 멈춰!
		while(inputStream.hasNextLine()) {
			System.out.println(inputStream.nextLine());
		}
		
		inputStream.close();
		
	}
	
	
	//signal.txt 에서 10개 인트 읽고
	// 앞 뒤 인드 간 차이를 바이너리 파일에 저장
	//저장한 바이너리 파일 읽기
	public static void BinfileTest(String fileNm) {
		int []saveVal=new int[10];
		
		System.out.println("\n\n\n바이너리 파일 예제 시작");
		
		try {
			Scanner inputStream=new Scanner(new File("C:\\OOP\\signal.txt"));
			//파일 읽기
			//10개 정수 읽음
			for(int i=0;i<10;i++){
				saveVal[i]=inputStream.nextInt();
				System.out.println("signal.txt 1번 "+saveVal[i]);
			}
			inputStream.close();
			
			
			//바이너리 파일 쓰기
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileNm));
			for(int i=0;i<10;i++) {
				//이건 print가 아니라 write뭐시기
				if(i==0)
					outputStream.writeInt(saveVal[i]);
				else
					outputStream.writeInt(saveVal[i]-saveVal[i-1]);
			}
			outputStream.close();
			
			
			
			//바이너리 파일 읽기
			ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream(fileNm));
			
			//파일 읽기
			//10개 정수 읽음
			int result=0;
			int i=1;
			while(i<=10){
				result=inputStream2.readInt();
				System.out.println(i+"번 "+ result);
				i++;
			}
			inputStream2.close();
			
			
			
		}catch(FileNotFoundException e) {
			System.out.println("Error open file "+e.getMessage());
			System.exit(0);
		}catch (EOFException e) { //IOException 위에 싸야함,  IO에 파일 끝 도달 예외도 포함됨
	        System.out.println("Error EOF " + e.getMessage());
	        System.exit(0);
	    }catch(IOException e) {
			System.out.println("Error IO"+e.getMessage());
			System.exit(0);
		}

		
		
	}

	
	//직렬화(serialization) 예제 
}
