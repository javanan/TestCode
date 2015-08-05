package com.FileReadTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;



/**
 *  读取大文件的方法
 * @author chen
 *
 */
public class ReadFile {
	
	@Test
	public void FileReadMethod() throws Throwable{
		   Path path=Paths.get("D:/Test.txt");
		   List<String> str= Files.readAllLines(path,Charset.forName("gbk") );
		   for(int i=0;i<str.size();i++){
			   System.out.println(str.get(i)+"\n");
		   }
	}
	
	
	FileInputStream fileInputStream=null;
	Scanner scn=null;
	@Test
	public void ScannerTest() throws Exception {
		String path="D:/Test.txt";
		try {
			fileInputStream=new FileInputStream(path);
			scn=new Scanner(fileInputStream, "GBK");
			while(scn.hasNextLine()){
				String ret=scn.nextLine();
				System.out.println(ret);
			}
			if(scn.ioException()!=null){
				throw scn.ioException();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}finally{
			if(fileInputStream!=null){
				fileInputStream.close();
			}
			if(scn!=null){
				scn.close();
			}
		}

	}
	
	
	@Test
	public void FileUtilsTest(){
		//ListIterator it = FileUtils.lineIterator(theFile, "UTF-8");
	}
	
	
	
	
	
	
	
	
	
	
}
