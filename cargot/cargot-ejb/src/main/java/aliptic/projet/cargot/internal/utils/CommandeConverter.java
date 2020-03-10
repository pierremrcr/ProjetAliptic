package aliptic.projet.cargot.internal.utils;

import aliptic.projet.cargot.internal.entities.CommandeEntity;
import aliptic.projet.cargot.pub.dtos.CommandeDTO;

public class CommandeConverter {
	
	public static CommandeDTO entityToDTO(CommandeEntity CommandeEntity) {
		return new CommandeDTO(
				CommandeEntity.getNumeroCommande()
				);
	}
	
	public static CommandeEntity DTOToEntity(CommandeDTO CommandeDTO) {
		return new CommandeEntity(
				CommandeDTO.getNumeroCommande()
				);
	}

}
