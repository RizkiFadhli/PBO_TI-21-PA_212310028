
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Latihan03 {
	public static void main(String[] args) {
		Biodata myBio = new Biodata();
		
		String Fullname, Address, Age;

		
		Fullname = JOptionPane.showInputDialog(
				null,
				"Input Your Name",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE);
		
		Age = JOptionPane.showInputDialog(
				null,
				"Input Your Age",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE);
		
		Address = JOptionPane.showInputDialog(
				null,
				"Input Your Address",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE);
		
		if(Fullname.isEmpty() && Address.isEmpty() && Age.isEmpty()) {
			JOptionPane.showMessageDialog(
					null, 
					"Field fullname/usia/alamat tidak boleh kosong", 
					"Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
	
		else 
			if(!Pattern.matches("^[0-9]+$", Age)) {
			JOptionPane.showMessageDialog(
					null, 
					"Isian usia harus angka",
					"Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
		
		else if(Address.length() < 10) {
			JOptionPane.showMessageDialog(
					null, 
					"Masukan alamat minimum 10 karakter",
					"Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(
					null, 
					"Seluruh informasi telah dimasukan",
					"Output Message", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}

	}

