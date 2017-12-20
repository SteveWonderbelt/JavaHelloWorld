import java.awt.*;
import javax.swing.*;
public class ReverseAString {

	public static void main(String[] args) {
		JFrame frame = new JFrame("FrameDemo");
		String the_string = JOptionPane.showInputDialog(frame, "Enter one sentence");
		String new_string = "";
		for(int i = the_string.length()-1; i >= 0; i--) {
			char new_char = the_string.charAt(i);
			new_string += String.valueOf(new_char);
		}
		JOptionPane.showMessageDialog(frame, new_string);
		

	}

}
