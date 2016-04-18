package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2_test;

import org.junit.Test;

import de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2.CrypterCaesar;
import de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2.CrypterException;
import de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2.CrypterFactory;
import de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2.Crypter;
import de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2.VerschluesselungsTyp;







public class CrypterCaesarTest {
	
    @Test 
	public void testCaesar() throws CrypterException {
    	Crypter caesar = Crypter.
		assertEquals("C", caesar.entschluesseln("U");
	}
    
    public void testCaesarException()
            throws CrypterException  {

        Crypter caesar = CrypterFactory.crypterTyp(, ki);

        try {
            caesar.encrypt("C", "caesAr");
            fail();
        } catch (CrypterException imex) {
            assertTrue(true);
        }

        try {
            caesar.verschluesseln();
            fail();
        } catch (CrypterException ikex) {
            assertTrue(true);
        }

        try {
            caesar.verschluesseln(klarTextZeichen);
            fail();
        } catch (CrypterExceptionn ikex) {
            assertTrue(true);
        }

        try {
            caesar.encrypt("1", "CAESAR");
            fail();
        } catch (IllegalKeyException ikex) {
            assertTrue(true);
        }

        try {
            caesar.decrypt("1", "FDHVDU");
            fail();
        } catch (CrypterException ikex) {
            assertTrue(true);
        }

        try {
            caesar.decrypt("CC", "FDHVDU");
            fail();
        } catch (CrypterException ikex) {
            assertTrue(true);
        }

    }

}