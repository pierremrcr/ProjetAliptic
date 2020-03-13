package aliptic.projet.cargot;


import java.util.Hashtable;
import java.util.List;

import javax.ejb.ObjectNotFoundException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.junit.BeforeClass;
import org.junit.Test;
import aliptic.projet.cargot.pub.services.EscargotServiceRemote;
import aliptic.projet.cargot.pub.services.VerrineServiceRemote;
import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.internal.entities.EscargotEntity;

public class EscargotTester {
	
	static EscargotServiceRemote service;
	static VerrineServiceRemote verrineService;
	
	@Test
	public void testEscargotServiceRemote() throws NamingException {
		service.createEscargot(true, Calibre.PETIT, Espece.BOURGOGNE, 5.);
		EscargotEntity Escargot = service.getEscargotById(1);
		Escargot.setPoids(21.5);
		service.updateEscargot(1,true, Calibre.PETIT, Espece.PETIT_GRIS, 23.5);
		service.createEscargot(true, Calibre.MOYEN, Espece.PETIT_GRIS, 2.5);
		service.createEscargot(true, Calibre.GRAND, Espece.BOURGOGNE, 25.);
		List<EscargotEntity> escargots = service.getAllEscargots();
		for (EscargotEntity escargot : escargots){
			System.out.println(escargot.getId() + " " + escargot.getCalibre() + " " + escargot.getEspece());
			service.deleteEscargotById(escargot.getId());
		}
		escargots = service.getAllEscargots();
		for (EscargotEntity escargot : escargots){
			System.out.println(escargot.getId() + " " + escargot.getCalibre() + " " + escargot.getEspece());
			service.deleteEscargotById(escargot.getId());
		}
	}
	
	@Test
	public void testcreateEscargots() throws NamingException {
		int id=0;
		for(int i=0;i<12;i++) {
			service.createEscargot(true, Calibre.PETIT, Espece.BOURGOGNE, 25);
			id++;
		}
		for(int i=0;i<24;i++) {
			service.createEscargot(true, Calibre.MOYEN, Espece.BOURGOGNE, 50);
			id++;
		}
		for(int i=0;i<12;i++) {
			service.createEscargot(true, Calibre.MOYEN, Espece.PETIT_GRIS, 40);
			id++;
		}
		List<EscargotEntity> escargots = service.getAllEscargots();
		for (EscargotEntity escargot : escargots){
			System.out.println(escargot.getId() + " " + escargot.getCalibre() + " " + escargot.getEspece());
		}
	}
	
	
	
	@Test
	public void createVerrineTest() {
		try {
			verrineService.createVerrine(Calibre.MOYEN, Espece.PETIT_GRIS, 12);
			System.out.println(verrineService.getVerrineById(1));
			System.out.println(service.getEscargotById(42).getVerrine());
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Nombre d'escargots insuffisants");
		}	
	}
	

	@BeforeClass
	public static void init() throws NamingException {
		Hashtable<Object, Object> props = new Hashtable<>();
		props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		props.put("jboss.naming.client.ejb.context", false);
		props.put("org.jboss.ejb.client.scoped.context", true);
		//props.put("java.naming.factory.initial", "org.jboss.as.naming.InitialContextFactory");
		props.put("endpoint.name", "client-endpoint");
		props.put("remote.connectionprovider.create.options.org.xnio.Options.SSL_ENABLED", false);
		props.put("remote.connections", "default");
		props.put("remote.connection.default.connect.options.org.xnio.Options.SASL_POLICY_NOANONYMOUS", false);
		props.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		props.put("remote.connection.default.host", "127.0.0.1");
		props.put("remote.connection.default.port", "8080");
		//  props.put(Context.PROVIDER_URL,"remote://localhost:4447");
		//  props.put(Context.SECURITY_PRINCIPAL, "testuser");
		//  props.put(Context.SECURITY_CREDENTIALS, "testpassword");
		props.put("jboss.naming.client.ejb.context", true);
		InitialContext context = new InitialContext(props);
		service = (EscargotServiceRemote) context.lookup("ejb:cargot/cargot-ejb/EscargotService!aliptic.projet.cargot.pub.services.EscargotServiceRemote");
		verrineService = (VerrineServiceRemote) context.lookup("ejb:cargot/cargot-ejb/VerrineService!aliptic.projet.cargot.pub.services.VerrineServiceRemote");
	}
	
}
