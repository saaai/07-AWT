import java.awt.*;
import java.awt.event.WindowListener;
public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Frame f = new Frame();// as we created an object "f" internally, it is calling the default constructor. Since, there are no parameters.
			/*the constructor Frame() is creating a initially invisible frame. so to make it visible we need to make use of the constructors or methods.
			 * if we cant find it in the constructor we need to check the methods then also if we dont find it we need to proceed to inherited level that is parent class level.
			 *
			 * set.visible method is there in the java.awt.window
			 */
			f.setVisible(true);
			f.setSize(300,300);//for setting the size of the window
			f.setTitle("My First Frame!!!! :)");//setting the title of the window
			/* 
			 * to generate the mouse operations, whenever we click the buttons these operations generate internally different events.
			 * 
			 * to perform the basic window events, we need to handle them if we can handle them then we can handle the close operation button also.
			 * whenever there is an action generation, to perform that particular action there should be one listener.
			 * 
			 * "window listener" is not a class its an interface.
			 * if it's an interface how will we create an object for this?
			 * we have to implement this window listener by other class, wherever it is expecting the parent object then we can pass the child object. this means wherever we need to pass the window listener object directly we shall pass the implementation class object there.
			 * 
			 * ex: public class MyListener implements WindowListener
			 * in the above statement, we are trying to create the sub class for the windowlistener interface and use this subclass object will be give to the add windowlistener method for this reason we are not supposed to use the abstract,
			 * 			we are supposed to implement all the methods of the particular interface and we have to provide the subclass object to the add windowlistener here.  
			 */
	
			MyListener listener = new MyListener(f);//add windowlistener by passing the mylistener object here
			f.addWindowListener(listener);
			
			
	}

}
