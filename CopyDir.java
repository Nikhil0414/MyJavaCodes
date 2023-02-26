import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDir {

	public static void main(String[] args)
	{	
		File dir = new File("C:\\Users\\NIKHIL\\Downloads\\new.txt");
		File[] files = dir.listFiles(new File_Filter("*"+ strLine + "*.txt"));
		for (File file : files){    
			System.out.println(file.getName());

			try {
				String sourceFile=dir+"\\"+file.getName();
				String destinationFile="D:\\mital\\storefile\\"+file.getName();
				FileInputStream fileInputStream = new FileInputStream(sourceFile);
				FileOutputStream fileOutputStream = new FileOutputStream(
						destinationFile);
				int bufferSize;
				byte[] bufffer = new byte[512];
				while ((bufferSize = fileInputStream.read(bufffer)) > 0) {
					fileOutputStream.write(bufffer, 0, bufferSize);
				}
				fileInputStream.close();
				fileOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}