package models;

import java.util.List;

public class TimelineUltimasDicas implements TimelineStrategy {

	@Override
	public void sortDicas(List<Dica> dicas) {
		dicas.sort((d1, d2) -> Long.compare(d2.getId(), d1.getId()));
	}
}
