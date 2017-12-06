import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		
		int score = 0;
		String one = JOptionPane.showInputDialog("How many days are there in 4 years?");
		if(one.equals("1461")) {
			score++;
			JOptionPane.showMessageDialog(null, "Good job! Score: "+score);
		} else {
			JOptionPane.showMessageDialog(null, "lol no. Score: "+score);
		}
		String two = JOptionPane.showInputDialog("How many seconds are there in a year?");
		if(two.equals("12")) {
			score++;
			JOptionPane.showMessageDialog(null, "Good job! Score: "+score);
		} else {
			JOptionPane.showMessageDialog(null, "lol no. Score: "+score);
		}
		String three = JOptionPane.showInputDialog("What has 13 hearts but no other organs?");
		if(three.equals("a deck of cards")) {
			score++;
			JOptionPane.showMessageDialog(null, "Good job! Score: "+score);
		} else {
			JOptionPane.showMessageDialog(null, "lol no. Score: "+score);
		}
		String four = JOptionPane.showInputDialog("How many months have 28 days?");
		if(four.equals("12")) {
			score++;
			JOptionPane.showMessageDialog(null, "Good job! Final Score: "+score);
		} else {
			JOptionPane.showMessageDialog(null, "lol no. Final Score: "+score);
		}
		
	}
}

