package TxtReadWrite;

import java.io.*;

public class txtReWr {

	
	File file;
	private static String dir = "Z://AndroidAPK/!javaCourse/Calculator/bin/TxtOperation/";
	private static String nameFile = "txtOperation.txt";
	
	
	public void write(String text) {
		file = new File(dir + nameFile);
		
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			
			PrintWriter out = new PrintWriter(file.getAbsoluteFile());
			
			try {
				out.print(text);
			} finally {
				out.close();
			}
			
		}catch(IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public String read() throws FileNotFoundException {
		
		StringBuilder sb = new StringBuilder();
		
		file = new File(dir + nameFile);
		exists();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				in.close();
			}
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		
		return sb.toString();
		
	}
	
	public void exists() throws FileNotFoundException {
		
		file = new File(dir + nameFile);
		
		if (!file.exists()) {
			throw new FileNotFoundException(file.getName());
		}
	}
	
	
	
	
	public void update (String text) throws FileNotFoundException {
		exists();
		StringBuilder sb = new StringBuilder();
		
		String oldFile = read();
		sb.append(oldFile);
		sb.append(text);
		
		write(sb.toString());
	}
	
}
