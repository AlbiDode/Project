/**
 */
package firstModel.tests;

import firstModel.BetAndWin;
import firstModel.FirstModelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bet And Win</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BetAndWinTest extends TestCase {

	/**
	 * The fixture for this Bet And Win test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetAndWin fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BetAndWinTest.class);
	}

	/**
	 * Constructs a new Bet And Win test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BetAndWinTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bet And Win test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BetAndWin fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bet And Win test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetAndWin getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FirstModelFactory.eINSTANCE.createBetAndWin());
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

} //BetAndWinTest
