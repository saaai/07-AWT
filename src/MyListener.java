import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyListener implements WindowListener {

	Frame f;//creation of frame instance variable
	
	MyListener(Frame f)//parameterized constructor which is expecting the Frame f object.
	{
		this.f =f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
			"window listener" is not a class its an interface.
	 * if it's an interface how will we create an object for this?
	 * we have to implement this window listener by other class, wherever it is expecting the parent object then we can pass the child object. this means wherever we need to pass the window listener object directly we shall pass the implementation class object there.
	 * 
	 * ex: public class MyListener implements WindowListener
	 * in the above statement, we are trying to create the sub class for the windowlistener interface and use this subclass object will be give to the add windowlistener method for this reason we are not supposed to use the abstract,
	 * 			we are supposed to implement all the methods of the particular interface and we have to provide the subclass object to the add windowlistener here.  
	 * 
	 */

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Inside Window Opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Inside Window Closing");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Inside Window Closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Inside Window Iconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Inside Window Deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Inside Window Activated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Inside Window Closed");
		
	}

}
