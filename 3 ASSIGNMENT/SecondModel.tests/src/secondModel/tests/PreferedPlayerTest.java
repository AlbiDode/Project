/**
 */
package secondModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import secondModel.PreferedPlayer;
import secondModel.SecondModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prefered Player</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreferedPlayerTest extends TestCase {

	/**
	 * The fixture for this Prefered Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferedPlayer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PreferedPlayerTest.class);
	}

	/**
	 * Constructs a new Prefered Player test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferedPlayerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Prefered Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PreferedPlayer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Prefered Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferedPlayer getFixture() {
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
		setFixture(SecondModelFactory.eINSTANCE.createPreferedPlayer());
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

} //PreferedPlayerTest
