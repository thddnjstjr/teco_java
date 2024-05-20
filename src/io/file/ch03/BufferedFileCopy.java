package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// (바이트 기반 스트림을 활용)
		// 기반 스트림 + 보조스트림을 활용해서
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오
		String sourceFilePath = "D:\\dev-sdk\\스샷\\a.zip";
		String destinationFilePath = "copy2.zip";
		// 시작 시간
		long start = System.nanoTime();
		try (
				FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out = new FileOutputStream(destinationFilePath);
				BufferedInputStream bis = new BufferedInputStream(in);
				BufferedOutputStream bos = new BufferedOutputStream(out)
				)
		{
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 종료 시간
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("소요시간은 : " + duration);
		double seconds = duration / 1_000_000_000.0;
		String resultFormat = String.format("소요시간은 : %.6f초 입니다", seconds);
		System.out.println(resultFormat);
	}
	

}
