package aliptic.projet.cargot.pub.services;

import java.util.List;
import javax.ejb.Remote;
import aliptic.projet.cargot.pub.dtos.GrossisteDTO;

@Remote
public interface GrossisteServiceRemote {
	
	public void createGrossiste(GrossisteDTO Grossiste);
	public GrossisteDTO readGrossiste(int numeroSIRET);
	public List<GrossisteDTO> readGrossistes();
	public void updateGrossiste(GrossisteDTO Grossiste);
	public void deleteGrossiste(GrossisteDTO Grossiste);
	public void deleteGrossisteFromNumeroSIRET(int numeroSIRET);

}
