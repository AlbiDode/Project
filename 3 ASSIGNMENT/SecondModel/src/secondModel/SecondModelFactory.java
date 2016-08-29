/**
 */
package secondModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see secondModel.SecondModelPackage
 * @generated
 */
public interface SecondModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecondModelFactory eINSTANCE = secondModel.impl.SecondModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Live Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Score</em>'.
	 * @generated
	 */
	LiveScore createLiveScore();

	/**
	 * Returns a new object of class '<em>Prefered Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefered Player</em>'.
	 * @generated
	 */
	PreferedPlayer createPreferedPlayer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecondModelPackage getSecondModelPackage();

} //SecondModelFactory
