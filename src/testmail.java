import java.util.Properties;

import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;


public class testmail {

	public static void main(String[] args) throws MessagingException {
		Properties imapProps = new Properties();
    	imapProps.setProperty("mail.imaps.socketFactory.port", "993");
    	imapProps.setProperty("mail.imaps.starttls.enable", "true");
    	imapProps.setProperty("mail.imaps.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    	imapProps.setProperty("mail.imaps.socketFactory.fallback", "false");
    	imapProps.setProperty("mail.imaps.auth.plain.disable", "true");
    	imapProps.setProperty("mail.imaps.auth.ntlm.disable", "true");
    	imapProps.setProperty("mail.imaps.auth.gssapi.disable", "true");

     	Session session = Session.getInstance(imapProps);

    	session.setDebug(false);

    	Store store;
    	
    	int messageCount = 0;
    	
		
			store = session.getStore("imaps");
	    	store.connect("mailexchange-a.mycom-osi.com", "qa.proptima", "Password00!!");
	    	Folder folder = store.getFolder("Inbox");
	
	}
}
