package tempconverter;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class TempConversionFrame extends JFrame{
	private JComboBox inputTempFormatBox;
	private JLabel label1; // JLabel with just text
	private JTextField textField1; // text field with set size
	private static final String[] tempFormat = { "Farenheight", "Cels", "Kalven" };

	// TempConversionFrame constructor adds JComboBox to JFrame
	   public TempConversionFrame() {
		   super( "Convert Temperature" );
		   setLayout( new FlowLayout() ); // set frame layout
		   
		   inputTempFormatBox = new JComboBox( tempFormat );
		   inputTempFormatBox.setMaximumRowCount( 3 ); // display three rows;
		   
		      // JLabel constructor with a string argument
		      label1 = new JLabel( "Enter the temperature and select the conversion" );
		      label1.setHorizontalTextPosition( SwingConstants.CENTER );
		      label1.setVerticalTextPosition( SwingConstants.TOP );
		      label1.setToolTipText( "Enter the temperature and select the conversion" );
		      add( label1 );
		      
		      textField1 = new JTextField( 5 );
		      add( textField1 ); // add textField1 to JFrame
		   
	   }
	
	
} // Class
