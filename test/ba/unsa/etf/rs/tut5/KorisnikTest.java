package ba.unsa.etf.rs.tut5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class KorisnikTest {
    @Test
    void setIme() {
        Korisnik k = new Korisnik();
        k.setIme("Harun");
        assertEquals("Harun", k.getIme());
    }



    @Test
    void setPrezime() {
        Korisnik k = new Korisnik();
        k.setPrezime("Ajkunic");
        assertEquals("Ajkunic", k.getPrezime());
    }
}
