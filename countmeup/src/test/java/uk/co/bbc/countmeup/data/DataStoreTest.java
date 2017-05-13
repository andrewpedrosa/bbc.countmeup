/**
 * 
 */
package uk.co.bbc.countmeup.data;

import junit.framework.TestCase;

/**
 * @author Andrew Pedrosa
 *
 */
public class DataStoreTest extends TestCase {

	DataStore store = new DataStore();
	/**
	 * Test method for {@link uk.co.bbc.countmeup.data.DataStore#getVoters()}.
	 */
	public final void testGetVoters() {
		assertEquals(store.getVoters().size(),4);
		assertNotNull(store.getVoters().get("voter1"));
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.data.DataStore#getCandidates()}.
	 */
	public final void testGetCandidates() {
		assertEquals(store.getCandidates().size(),4);
		assertNotNull(store.getCandidates().get("A"));
	}


}
