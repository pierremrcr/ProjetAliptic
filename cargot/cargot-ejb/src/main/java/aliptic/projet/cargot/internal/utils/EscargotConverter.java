package aliptic.projet.cargot.internal.utils;

import aliptic.projet.cargot.internal.entities.EscargotEntity;
import aliptic.projet.cargot.pub.dtos.EscargotDTO;

public class EscargotConverter {
	
	public static EscargotDTO entityToDTO(EscargotEntity EscargotEntity) {
		return new EscargotDTO(
				EscargotEntity.getId(),
				EscargotEntity.isDisponible(),
				EscargotEntity.getCalibre(),
				EscargotEntity.getEspece(),
				EscargotEntity.getPoids()
				);
	}
	
	public static EscargotEntity DTOToEntity(EscargotDTO EscargotDTO) {
		return new EscargotEntity(
				EscargotDTO.getId(),
				EscargotDTO.isDisponible(),
				EscargotDTO.getCalibre(),
				EscargotDTO.getEspece(),
				EscargotDTO.getPoids()
				);
	}

}
