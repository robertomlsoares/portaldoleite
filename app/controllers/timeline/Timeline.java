package controllers.timeline;

import java.util.List;
import java.util.Map;

import models.Dica;
import models.Disciplina;

public interface Timeline {

	public Map<Disciplina, List<Dica>> getDicas(List<Disciplina> disciplinas);

}
