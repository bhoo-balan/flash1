import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {

	public static void main(String[] args) {

		try(FileReader fr=new FileReader("acc.txt")){
			fr=new FileReader("inout.txt");
}
catch(IOException e) {
	
}
	}

}
