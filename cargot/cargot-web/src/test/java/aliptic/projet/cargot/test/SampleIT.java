package aliptic.projet.cargot.test;

import java.io.File;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.importer.ZipImporter;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Sample integration test: demonstrates how to create the EAR file using the ShrinkWrap API.
 * 
 * Delete this file if no integration test is required.
 */
@RunWith(Arquillian.class)
public class SampleIT {

    /**
     * Creates the EAR file that is deployed to the server.
     * 
     * @return EAR archive
     */
    @Deployment
    public static Archive<?> getEarArchive() {
        // Create the EAR archive:
        EnterpriseArchive ear = ShrinkWrap.create(EnterpriseArchive.class, "cargot-ear.ear");

        // Current directory is the root of the "cargot-web" project. Go up one level
        // and enter the "cargot-ejb" project.
        // The ejb jar is found in the "target" directory:
        File f = new File("../cargot-ejb/target/cargot-ejb.jar");
        JavaArchive ejbJar = ShrinkWrap.create(ZipImporter.class, "cargot-ejb.jar").importFrom(f).as(JavaArchive.class);
        ear.addAsModule(ejbJar);

        // Now grab the web archive:
        f = new File("./target/cargot-web.war");
        if (f.exists() == false) {
            throw new RuntimeException("File " + f.getAbsolutePath() + " does not exist.");
        }
        WebArchive war = ShrinkWrap.create(ZipImporter.class, "cargot-web.war").importFrom(f).as(WebArchive.class);
        ear.addAsModule(war);

        // The manifest file is auto created by the Maven EAR plugin - we don't have it here.

        // Add the package containing the test classes:
        war.addPackage("aliptic.projet.cargot.test");

        // Export the EAR file to examine it in case of problems:
        // ear.as(ZipExporter.class).exportTo(new File("c:\\temp\\test.ear"), true);

        return ear;
    }

    /**
     * A sample test...
     * 
     */
    @Test
    public void test() {
        // This line will be written on the server console.
        System.out.println("Test is invoked...");
    }
}
