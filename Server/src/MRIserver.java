/**
 * 
 */

/**
 * @author helier
 *
 */

import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class MRIserver extends UnicastRemoteObject {

	String server;
	
	public MRIserver() throws RemoteException{
        try 
        {
        	this.server = InetAddress.getLocalHost().getHostAddress();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	try{
    		MRIserver mir = new MRIserver();
    		Naming.rebind("//" + mir.server + "/server", mir);
    	}
    	catch (Exception e)
	    {
    		e.printStackTrace();
	    }
    }

}
