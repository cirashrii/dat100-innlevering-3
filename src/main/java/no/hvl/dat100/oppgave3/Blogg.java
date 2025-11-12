package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

import javax.swing.text.html.InlineView;

public class Blogg {

	private Innlegg[] inleggtabell;
    private int nesteledig;

	public Blogg() {
        this.inleggtabell = new Innlegg[20];
        this.nesteledig = 0;
	}

	public Blogg(int lengde) {
        this.inleggtabell = new Innlegg[lengde];
        this.nesteledig = 0;
	}

	public int getAntall() {
		int antall = 0;

        for (Innlegg innlegg : inleggtabell) {
            if (innlegg != null) {
                antall++;
            }
        }

        return antall;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {
        if(ledigPlass() && !finnes(innlegg)){
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }
        else{
            return false;
        }
	}
	
	public String toString() {
        String data = nesteledig +"\n";
        for(int i=0; i<nesteledig; i++){
            data += innleggtabell[i].toString();
        }
        return data;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}