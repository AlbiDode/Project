/**
 */
package firstModel.tests;

import firstModel.FirstModelFactory;
import firstModel.TypeOfPlayers;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Of Players</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeOfPlayersTest extends TestCase {

	/**
	 * The fixture for this Type Of Players test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOfPlayers fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeOfPlayersTest.class);
	}

	/**
	 * Constructs a new Type Of Players test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfPlayersTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Type Of Players test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TypeOfPlayers fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Type Of Players test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOfPlayers getFixture() {
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
		setFixture(FirstModelFactory.eINSTANCE.createTypeOfPlayers());
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

} //TypeOfPlayersTest
