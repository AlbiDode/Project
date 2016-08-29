/**
 */
package secondModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import secondModel.LiveScore;
import secondModel.SecondModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Live Score</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiveScoreTest extends TestCase {

	/**
	 * The fixture for this Live Score test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveScore fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LiveScoreTest.class);
	}

	/**
	 * Constructs a new Live Score test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveScoreTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Live Score test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LiveScore fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Live Score test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveScore getFixture() {
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
		setFixture(SecondModelFactory.eINSTANCE.createLiveScore());
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

} //LiveScoreTest
