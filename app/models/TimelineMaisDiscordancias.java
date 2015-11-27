package models;

import java.util.List;

/**
 * Created by dekozo on 11/24/15.
 */
public class TimelineMaisDiscordancias implements TimelineStrategy {

	@Override
	public List<Dica> sortDicas(List<Dica> dicas) {
		dicas.sort((d1, d2) -> Long.compare(d2.getDiscordancias(), d1.getDiscordancias()));
		return dicas;
	}
}
