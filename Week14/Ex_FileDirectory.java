package Week14;
import java.io.*;
public class Ex_FileDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx2 DIRECTORY");
			System.exit(0);
		}

		File f = new File(args[0]);
		// C:\Program Files\Java\jdk1.8.0_301

		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		} 

		File[] files = f.listFiles();

		for(int i=0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+fileName+"]" : fileName);
		}
	}

}
