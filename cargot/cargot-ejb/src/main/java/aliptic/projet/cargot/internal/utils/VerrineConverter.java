package aliptic.projet.cargot.internal.utils;

import aliptic.projet.cargot.internal.entities.VerrineEntity;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;
import java.util.ArrayList;
import java.util.List;
import aliptic.projet.cargot.internal.entities.EscargotEntity;

public class VerrineConverter {
	
	/*
	public static VerrineDTO entityToDTO(VerrineEntity VerrineEntity) {
		List<EscargotDTO> escargotsDTO = new ArrayList<EscargotDTO>();
		List<EscargotEntity> escargotsEntity = VerrineEntity.getEscargots();
		for (EscargotEntity escargotEntity: escargotsEntity) {
			escargotsDTO.add(EscargotConverter.entityToDTO(escargotEntity));
		}
		return new VerrineDTO(
				VerrineEntity.getId(),
				VerrineEntity.getCalibre(),
				VerrineEntity.getEspece(),
				VerrineEntity.getQuantiteMax(),
				escargotsDTO
				);
	}
	*/
	
	/*
	public static VerrineEntity DTOToEntity(VerrineDTO VerrineDTO) {
		List<EscargotEntity> escargotsEntity = new ArrayList<EscargotEntity>();
		List<EscargotDTO> escargotsDTO = VerrineDTO.getEscargots();
		for (EscargotDTO escargotDTO: escargotsDTO) {
			escargotsEntity.add(EscargotConverter.DTOToEntity(escargotDTO));
		}
		return new VerrineEntity(
				VerrineDTO.getId(),
				VerrineDTO.getCalibre(),
				VerrineDTO.getEspece(),
				VerrineDTO.getQuantiteMax(),
				escargotsEntity
				);
	}
	*/

}
