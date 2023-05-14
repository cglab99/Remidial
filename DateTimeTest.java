package 보강;
import java.awt.*;
import java.time.*;
import java.util.Calendar;
import java.util.Set;
import javax.swing.*;

public class DateTimeTest extends JFrame {

	static JLabel time, car;
	static JPanel panel = new JPanel();
	DateTimeTest(){
		this.setLayout(null);
		this.setBounds(0,0,300,200);

		//time = new JLabel( LocalTime.now().getSecond() + "" );
		time = new JLabel();
		ImageIcon ii = new ImageIcon("car2.png");
		time.setIcon(ii);
		time.setBounds( 0,30,50,29 );
		this.add(time);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {

		DateTimeTest dt = new DateTimeTest();
		
		Thread t4 = new Thread( () -> {
			while(true) {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		
				if( time.getLocation().getX() < dt.getWidth() ) time.setLocation( (int)(time.getLocation().getX())+5 , 30);
				else time.setLocation( 0 , 30);
				//time.setText( LocalTime.now().getSecond() + "" );
				
			}
		});
		t4.start();
		
	}
}
