package day04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferReaderEx {
	public static void main(String[] args) {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			
			bw.write(str);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
