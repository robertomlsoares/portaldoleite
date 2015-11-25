package models.timeline;

import models.Dica;
import models.Disciplina;
import models.Tema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dekozo on 11/24/15.
 */
public class TimelineMaisDiscordancias implements TimelineStrategy {

    @Override
    public Map<Disciplina, List<Dica>> getDicas(List<Disciplina> disciplinas) {
        Map<Disciplina, List<Dica>> dicasPorDisciplina = new HashMap<>();

        for (Disciplina disciplina : disciplinas) {
            List<Dica> dicas = new ArrayList<>();
            for (Tema tema : disciplina.getTemas()) {
                dicas.addAll(tema.getDicas());
            }
            dicas.sort((d1, d2) -> Long.compare(d2.getDiscordancias(), d1.getDiscordancias()));
            dicasPorDisciplina.put(disciplina, dicas);
        }
        return dicasPorDisciplina;
    }
}
