package substitutioncipher;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		Substitution openSubstitution=new Substitution();
		String crypt=openSubstitution.getEncryptDecrypt();
		if (crypt.equals("e")) {
			openSubstitution.getPlainText();
			openSubstitution.getKey();
			openSubstitution.encrypt();
		}
		else if (crypt.equals("d")) {
			openSubstitution.getPlainText();
			openSubstitution.getKey();
			openSubstitution.decrypt();
		}
	}
}