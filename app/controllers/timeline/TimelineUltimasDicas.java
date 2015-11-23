package controllers.timeline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Dica;
import models.Disciplina;
import models.Tema;

public class TimelineUltimasDicas implements Timeline {

	@Override
	public Map<Disciplina, List<Dica>> getDicas(List<Disciplina> disciplinas) {
		Map<Disciplina, List<Dica>> dicasPorDisciplina = new HashMap<>();
		for (Disciplina disciplina : disciplinas) {
			List<Dica> dicas = new ArrayList<>();
			for (Tema tema : disciplina.getTemas()) {
				dicas.addAll(tema.getDicas());
			}
			dicas.sort((d1, d2) -> Long.compare(d2.getId(), d1.getId()));
			dicasPorDisciplina.put(disciplina, dicas);
		}
		return dicasPorDisciplina;
	}
}
