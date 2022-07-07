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
		 * InputStreamReader(InputStream in) --> byte stream�� character stream���� �������ִ�
		 * ���� InputStream ��ü�� ������ ���� Ű���� �Է� Ȥ�� ���� ������ ���� �� �ִ�. 
		 * ���� ���� ���� ���¸� ���� ���·� �������ִ� ������ �Ѵ�.
		 */
		
		/*
		 * BufferedReader(Reader in, int sz) --> ȿ�������� ���ڸ� �б����� ���۸��� ����Ѵ�. 
		 * int sz�� ���� ���� ����� ���� �� �� �� �ִ�. 
		 * ���� FileReader, InpurStreamReader�� read()�� ���� cost�� ���� ��� Reader�� �Ķ���ͷ� ���� �޾� ����Ѵ�. 
		 * BufferedReader�� ����ϸ� �ý����� ���۰� ����������� IO�� ������ �����͸�
		 * �о���� ������ ��쿡�� �޸𸮿� �ִ� ���� �����͸� �о� ó���Ѵ� (�ý��ۿ��� IO�� �ڿ� �Ҹ� ũ��)
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//BufferedWriter(OutputStream out)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*
		 * StringTokenizer() -> ���ڿ� ������ --> default : space�� �������� �����Ѵ�.
		 * StringTokenizer(���ڿ�,������,true/false) true/false -->
		 * ���ڿ� �и� �� �����ڸ� ��ū ����� ����(true) ��������(false)
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
