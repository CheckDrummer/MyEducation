package Learn1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInput {

    public static void fileInput () throws IOException {
		try (FileInputStream input = new FileInputStream("test.txt")){
			int data = input.read();
			while (data != -1) {
				System.out.println((char)data);
				data = input.read();
			}
		}
	}


	public static void main(String[] args) throws IOException {
		System.out.println(" ");
		System.out.println("fileInput");

		fileInput();



		System.out.println(" ");
		System.out.println("FileWriter");

		try(FileWriter writer = new FileWriter("/Users/chekulaev/Documents/1.txt", true))
		{
			// запись всей строки
			String text = "Мама мыла раму, раму мыла мама";
			writer.write(text);
			// запись по символам
			writer.append('\n');
			writer.append('E');

			writer.flush();
		}
		catch(IOException ex){

			System.out.println(ex.getMessage());
		}




		System.out.println(" ");
		System.out.println("FileReader");

		try (FileReader fileReader = new FileReader("/Users/chekulaev/Documents/1.txt")){
			int c;
			while ((c=fileReader.read()) != -1){
				System.out.print((char)c);
			}
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
    }
}
