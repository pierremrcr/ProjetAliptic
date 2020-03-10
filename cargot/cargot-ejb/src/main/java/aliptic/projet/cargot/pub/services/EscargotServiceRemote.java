package aliptic.projet.cargot.pub.services;

import java.util.List;
import javax.ejb.Remote;
import aliptic.projet.cargot.pub.dtos.EscargotDTO;

@Remote
public interface EscargotServiceRemote {
	
	public void createEscargot(EscargotDTO escargot);
	public EscargotDTO readEscargot(int id);
	public List<EscargotDTO> readEscargots();
	public void updateEscargot(EscargotDTO escargot);
	public void deleteEscargot(EscargotDTO escargot);
	public void deleteEscargotFromId(int id);

}
