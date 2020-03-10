package aliptic.projet.cargot;

import static org.junit.Assert.assertTrue;
import java.util.Hashtable;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.junit.BeforeClass;
import org.junit.Test;

public class EscargotCRUDTester {
	
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
	public void testServiceRemote() throws NamingException {
		ServiceRemote service = (ServiceRemote) context.lookup("ejb:wildflygestion/wildflygestion-ejb/Service!jaysan.wildfly.gestion.wildflygestion.pub.ServiceRemote");
		ProductDTO product = new ProductDTO(
				"S10_1678",
				"1969 Harley Davidson Ultimate Chopper",
				"Motorcycles",
				"1:10",
				"Min Lin Diecast",
				"This replica features working kickstand, front suspension, gear-shift lever, footbrake lever, drive chain, wheels and steering. All parts are particularly delicate due to their precise scale and require special care and attention.",
				7933,
				48.81,
				95.70);
		service.createProduct(product);
		product = service.readProduct("S10_1678");
		product.setBuyPrice(50.);
		service.updateProduct(product);
		product = new ProductDTO(
				"S10_1949",
				"1952 Alpine Renault 1300",
				"Classic Cars",
				"1:10",
				"Classic Metal Creations",
				"Turnable front wheels; steering function; detailed interior; detailed engine; opening hood; opening trunk; opening doors; and detailed chassis.",
				7305,
				98.58,
				214.30);
		service.createProduct(product);
		product = new ProductDTO(
				"S10_2016",
				"1996 Moto Guzzi 1100i",
				"Motorcycles",
				"1:10",
				"Highway 66 Mini Classics",
				"Official Moto Guzzi logos and insignias, saddle bags located on side of motorcycle.",
				6625,
				68.99,
				118.94);
		service.createProduct(product);
		List<ProductDTO> products = service.readProducts();
		assertTrue(products.size() > 0);
		service.deleteProduct(product);
		service.deleteProductFromId("S10_1678");
		service.deleteProductFromId("S10_1949");
	}


}
