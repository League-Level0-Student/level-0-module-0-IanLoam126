import javax.swing.JOptionPane;

public class knock {
	public static void main(String args[]){
		
		String reply1 = JOptionPane.showInputDialog("Knock Knock...");
		if (reply1 == "who is there"){
			String name = JOptionPane.showInputDialog("Who's there?");
			String reply2 = JOptionPane.showInputDialog(name +" Who?");
			JOptionPane.showMessageDialog(null, name + " "+ reply2);
		}
		
		
	}
}
