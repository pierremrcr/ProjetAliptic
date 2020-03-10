package aliptic.projet.cargot.internal.utils;

import aliptic.projet.cargot.internal.entities.AdresseEntity;
import aliptic.projet.cargot.pub.dtos.AdresseDTO;

public class AdresseConverter {
	
	public static AdresseDTO entityToDTO(AdresseEntity AdresseEntity) {
		return new AdresseDTO(
				AdresseEntity.getId(),
				AdresseEntity.getNumero(),
				AdresseEntity.getNomRue(),
				AdresseEntity.getCodePostal(),
				AdresseEntity.getVille(),
				AdresseEntity.getPays()
				);
	}
	
	public static AdresseEntity DTOToEntity(AdresseDTO AdresseDTO) {
		return new AdresseEntity(
				AdresseDTO.getId(),
				AdresseDTO.getNumero(),
				AdresseDTO.getNomRue(),
				AdresseDTO.getCodePostal(),
				AdresseDTO.getVille(),
				AdresseDTO.getPays()
				);
	}

}
