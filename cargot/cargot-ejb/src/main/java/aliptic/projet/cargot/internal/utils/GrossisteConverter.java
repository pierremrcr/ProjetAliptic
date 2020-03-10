package aliptic.projet.cargot.internal.utils;

import aliptic.projet.cargot.internal.entities.GrossisteEntity;
import aliptic.projet.cargot.pub.dtos.GrossisteDTO;

public class GrossisteConverter {
	
	public static GrossisteDTO entityToDTO(GrossisteEntity GrossisteEntity) {
		return new GrossisteDTO(
				GrossisteEntity.getNumeroSIRET(),
				GrossisteEntity.getLibelle(),
				GrossisteEntity.getEmail(),
				GrossisteEntity.getNumeroTelephone(),
				GrossisteEntity.getTauxPreferentiel()
				);
	}
	
	public static GrossisteEntity DTOToEntity(GrossisteDTO GrossisteDTO) {
		return new GrossisteEntity(
				GrossisteDTO.getNumeroSIRET(),
				GrossisteDTO.getLibelle(),
				GrossisteDTO.getEmail(),
				GrossisteDTO.getNumeroTelephone(),
				GrossisteDTO.getTauxPreferentiel()
				);
	}

}
