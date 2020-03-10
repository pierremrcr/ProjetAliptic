package aliptic.projet.cargot.internal.utils;

import aliptic.projet.cargot.internal.entities.CartonEntity;
import aliptic.projet.cargot.pub.dtos.CartonDTO;

public class CartonConverter {
	
	public static CartonDTO entityToDTO(CartonEntity CartonEntity) {
		return new CartonDTO(
				CartonEntity.getId(),
				CartonEntity.getVerrines()
				);
	}
	
	public static CartonEntity DTOToEntity(CartonDTO CartonDTO) {
		return new CartonEntity(
				CartonDTO.getId(),
				CartonDTO.getVerrines()
				);
	}

}
