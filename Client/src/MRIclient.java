/**
 * 
 */

/**
 * @author helier
 *
 */

import java.rmi.*;

public class MRIclient {
	
	String server;
	MRIserver mriserver;
	
	public MRIclient() 
    {
        try
        {
        	this.mriserver = (MRIserver)Naming.lookup ("//" + this.server + "/server");
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
        new MRIclient();
    }

}
