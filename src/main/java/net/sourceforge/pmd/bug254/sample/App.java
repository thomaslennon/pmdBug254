package net.sourceforge.pmd.bug254.sample;

import net.sourceforge.pmd.bug254.exceptions.SampleException;

/**
 * this class demonstrates PMD bug254
 * 
 */
public class App {

    /**
     * This method "throws" a runtime exception... so we document it.
	 * javadoc above is correctly updated to import the correct exception
	 * PMD reports this as a unused import.
     * 
     * @throws SampleException
     */
    public void someMethod() {

    }

}
