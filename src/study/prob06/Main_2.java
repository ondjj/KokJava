package study.prob06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class Main_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * InputStreamReader(InputStream in) --> byte stream을 character stream으로 변경해주는
		 * 역할 InputStream 객체의 종류에 따라 키보드 입력 혹은 파일 내용을 읽을 수 있다. 
		 * 쉽게 말해 숫자 형태를 문자 형태로 변경해주는 역할을 한다.
		 */
		
		/*
		 * BufferedReader(Reader in, int sz) --> 효율적으로 문자를 읽기위해 버퍼링을 사용한다. 
		 * int sz를 통해 버퍼 사이즈를 지정 해 줄 수 있다. 
		 * 보통 FileReader, InpurStreamReader의 read()와 같이 cost가 많이 드는 Reader를 파라미터로 전달 받아 사용한다. 
		 * BufferedReader를 사용하면 시스템은 버퍼가 비어있을때만 IO를 일으켜 데이터를
		 * 읽어오고 나머지 경우에는 메모리에 있는 버퍼 데이터를 읽어 처리한다 (시스템에서 IO는 자원 소모가 크다)
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//BufferedWriter(OutputStream out)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*
		 * StringTokenizer() -> 문자열 구분자 --> default : space를 기준으로 구분한다.
		 * StringTokenizer(문자열,구분자,true/false) true/false -->
		 * 문자열 분리 시 구분자를 토큰 취급을 할지(true) 무시할지(false)
		 */
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());

			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		bw.close();

	}

}
