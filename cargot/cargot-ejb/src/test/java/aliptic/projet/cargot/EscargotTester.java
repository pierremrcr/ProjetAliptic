package aliptic.projet.cargot;

import static org.junit.Assert.assertTrue;
import java.util.Hashtable;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.junit.BeforeClass;
import org.junit.Test;
import aliptic.projet.cargot.pub.services.EscargotServiceRemote;
import aliptic.projet.cargot.pub.dtos.EscargotDTO;
import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.internal.entities.EscargotEntity;

public class EscargotTester {
	
	protected static InitialContext context;
	
	@BeforeClass
	public static void testInit() throws NamingException {
		Hashtable<Object, Object> props = new Hashtable<>();
		props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		props.put("jboss.naming.client.ejb.context", false);
		props.put("org.jboss.ejb.client.scoped.context", true);
		props.put("endpoint.name", "client-endpoint");
		props.put("remote.connectionprovider.create.options.org.xnio.Options.SSL_ENABLED", false);
		props.put("remote.connections", "default");
		props.put("remote.connection.default.connect.options.org.xnio.Options.SASL_POLICY_NOANONYMOUS", false);
		props.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		props.put("remote.connection.default.host", "127.0.0.1");
		props.put("remote.connection.default.port", "8080");
//		props.put(Context.PROVIDER_URL,"remote://localhost:4447");
//		props.put(Context.SECURITY_PRINCIPAL, "testuser");
//		props.put(Context.SECURITY_CREDENTIALS, "testpassword");
		props.put("jboss.naming.client.ejb.context", true);
		context = new InitialContext(props);
	}
	
	@Test
	public void testEscargotServiceRemote() throws NamingException {
		EscargotServiceRemote service = (EscargotServiceRemote) context.lookup("ejb:cargot/cargot-ejb/CommandeDAO!aliptic.projet.cargot.internal.daos.CommandeDAO");
		service.createEscargot(1, true, Calibre.PETIT, Espece.BOURGOGNE, 5.);
		EscargotEntity Escargot = service.getEscargotById(1);
		Escargot.setPoids(21.5);
		service.updateEscargot(Escargot);
		service.createEscargot(2, true, Calibre.MOYEN, Espece.PETIT_GRIS, 2.5);
		service.createEscargot(3, true, Calibre.GRAND, Espece.BOURGOGNE, 25.);
		List<EscargotEntity> Escargots = service.getAllEscargots();
	}


}
