/**
 */
package firstModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see firstModel.FirstModelPackage
 * @generated
 */
public interface FirstModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FirstModelFactory eINSTANCE = firstModel.impl.FirstModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bet And Win</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bet And Win</em>'.
	 * @generated
	 */
	BetAndWin createBetAndWin();

	/**
	 * Returns a new object of class '<em>Type Of Players</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Of Players</em>'.
	 * @generated
	 */
	TypeOfPlayers createTypeOfPlayers();

	/**
	 * Returns a new object of class '<em>Live Bet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Bet</em>'.
	 * @generated
	 */
	LiveBet createLiveBet();

	/**
	 * Returns a new object of class '<em>Boss</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boss</em>'.
	 * @generated
	 */
	Boss createBoss();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FirstModelPackage getFirstModelPackage();

} //FirstModelFactory
