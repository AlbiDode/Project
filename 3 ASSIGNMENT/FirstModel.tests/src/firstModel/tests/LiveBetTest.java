/**
 */
package firstModel.tests;

import firstModel.FirstModelFactory;
import firstModel.LiveBet;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Live Bet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiveBetTest extends TypeOfPlayersTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LiveBetTest.class);
	}

	/**
	 * Constructs a new Live Bet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveBetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Live Bet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LiveBet getFixture() {
		return (LiveBet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FirstModelFactory.eINSTANCE.createLiveBet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LiveBetTest
