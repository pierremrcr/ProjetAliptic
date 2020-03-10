package aliptic.projet.cargot.internal.utils;

import java.util.ArrayList;
import java.util.List;
import aliptic.projet.cargot.internal.entities.CartonEntity;
import aliptic.projet.cargot.pub.dtos.CartonDTO;
import aliptic.projet.cargot.internal.entities.VerrineEntity;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;
import aliptic.projet.cargot.internal.utils.VerrineConverter;

public class CartonConverter {
	
	public static CartonDTO entityToDTO(CartonEntity CartonEntity) {
		List<VerrineDTO> verrinesDTO = new ArrayList<VerrineDTO>();
		List<VerrineEntity> verrinesEntity = CartonEntity.getVerrines();
		for (VerrineEntity verrineEntity: verrinesEntity) {
			verrinesDTO.add(VerrineConverter.entityToDTO(verrineEntity));
		}
		return new CartonDTO(CartonEntity.getId(), verrinesDTO);
	}
	
	public static CartonEntity DTOToEntity(CartonDTO CartonDTO) {
		List<VerrineEntity> verrinesEntity = new ArrayList<VerrineEntity>();
		List<VerrineDTO> verrinesDTO = CartonDTO.getVerrines();
		for (VerrineDTO verrineDTO: verrinesDTO) {
			verrinesEntity.add(VerrineConverter.DTOToEntity(verrineDTO));
		}
		return new CartonEntity(CartonDTO.getId(), verrinesEntity);
	}

}
