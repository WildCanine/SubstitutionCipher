package substitutioncipher;
import javax.swing.JOptionPane;
public class Substitution {
	private String alpha="zebracdfghijklmnopqstuvwxy0123456789.:";
	private String choice="";
	private String plainText="";
	private String encodedText="";
	private String decodedText="";
	private int key=0;
	public Substitution() {
	}
	public String getEncryptDecrypt() {
		while (true) {
			choice=JOptionPane.showInputDialog(null, "Would you like to encrypt (e) or decrypt (d)?");
			if (choice.equals("e") || choice.equals("d")) {
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Please answer either 'e' for encryption or 'd' for decryption.");
			}
		}
		return choice;
	}
	public void getPlainText() {
		plainText=JOptionPane.showInputDialog(null, "Please enter the plain text message:");
	}
	public void getKey() {
		key=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the shift key:"));
	}
	public void encrypt() {
		for (int i=0; i<plainText.length(); i++) {
			if (!alpha.contains(String.valueOf(plainText.charAt(i)).toLowerCase())) {
				encodedText+=" ";
			}
			else {
				encodedText+=alpha.charAt((alpha.indexOf(String.valueOf(plainText.charAt(i)).toLowerCase())+key)%alpha.length());
			}
		}
		JOptionPane.showMessageDialog(null, encodedText);
	}
	public void decrypt() {
		for (int i=0; i<plainText.length(); i++) {
			if (!alpha.contains(String.valueOf(plainText.charAt(i)).toLowerCase())) {
				decodedText+=" ";
			}
			else {
				decodedText+=alpha.charAt((alpha.indexOf(String.valueOf(plainText.charAt(i)).toLowerCase())+38-key)%alpha.length());
			}
		}
		JOptionPane.showMessageDialog(null, decodedText);
	}
}