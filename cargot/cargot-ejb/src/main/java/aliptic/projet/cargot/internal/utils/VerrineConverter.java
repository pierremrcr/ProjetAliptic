package aliptic.projet.cargot.internal.utils;

import aliptic.projet.cargot.internal.entities.VerrineEntity;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;

public class VerrineConverter {
	
	public static VerrineDTO entityToDTO(VerrineEntity VerrineEntity) {
		return new VerrineDTO(
				VerrineEntity.getId(),
				VerrineEntity.getCalibre(),
				VerrineEntity.getEspece(),
				VerrineEntity.getQuantiteMax(),
				VerrineEntity.getEscargots()
				);
	}
	
	public static VerrineEntity DTOToEntity(VerrineDTO VerrineDTO) {
		return new VerrineEntity(
				VerrineDTO.getId(),
				VerrineDTO.getCalibre(),
				VerrineDTO.getEspece(),
				VerrineDTO.getQuantiteMax(),
				VerrineDTO.getEscargots()
				);
	}

}
