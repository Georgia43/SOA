package fr.insa.soa.RestProjectE.ressources;

import fr.insa.soa.RestProjectE.Stage;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class StageRessource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Stage getStage(int idEtudiant) {
		Stage stage = new Stage();
		stage.setEvaluation(16);
		stage.setCompetences("SOA, Rest");
		stage.setAnnee(2021);
		return stage;
	}

}
