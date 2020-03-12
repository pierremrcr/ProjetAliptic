package aliptic.projet.cargot.internal.utils;

import aliptic.projet.cargot.internal.entities.VerrineEntity;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;

public class VerrineConverter {
	
	public static VerrineDTO entityToDTO(VerrineEntity VerrineEntity) {
		return new VerrineDTO(
			VerrineEntity.getId(),
			VerrineEntity.getCalibre(),
			VerrineEntity.getEspece(),
			VerrineEntity.getQuantiteMax()
			);
	}

}
