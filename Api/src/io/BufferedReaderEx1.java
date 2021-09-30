package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

import com.sun.media.sound.AiffFileWriter;
import com.sun.media.sound.AuFileWriter;

public class BufferedReaderEx1 {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("c:\\temp\\file1.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("c:\\temp\\test5.txt");
			BufferedWriter bw =new BufferedWriter(fw)){
				String line ="";
				
				while ((line =br.readLine())!=null) {
					bw.write(line);
					bw.newLine();//����
				
			}
		} catch (Exception e) {
        e.printStackTrace();
		
		}
		
		
	}

}