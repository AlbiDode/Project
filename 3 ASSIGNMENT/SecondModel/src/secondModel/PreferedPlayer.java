/**
 */
package secondModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefered Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secondModel.PreferedPlayer#getName <em>Name</em>}</li>
 *   <li>{@link secondModel.PreferedPlayer#getWon <em>Won</em>}</li>
 *   <li>{@link secondModel.PreferedPlayer#getPlayings <em>Playings</em>}</li>
 * </ul>
 *
 * @see secondModel.SecondModelPackage#getPreferedPlayer()
 * @model
 * @generated
 */
public interface PreferedPlayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see secondModel.SecondModelPackage#getPreferedPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link secondModel.PreferedPlayer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Won</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Won</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Won</em>' attribute.
	 * @see #setWon(int)
	 * @see secondModel.SecondModelPackage#getPreferedPlayer_Won()
	 * @model
	 * @generated
	 */
	int getWon();

	/**
	 * Sets the value of the '{@link secondModel.PreferedPlayer#getWon <em>Won</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Won</em>' attribute.
	 * @see #getWon()
	 * @generated
	 */
	void setWon(int value);

	/**
	 * Returns the value of the '<em><b>Playings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Playings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playings</em>' attribute.
	 * @see #setPlayings(int)
	 * @see secondModel.SecondModelPackage#getPreferedPlayer_Playings()
	 * @model
	 * @generated
	 */
	int getPlayings();

	/**
	 * Sets the value of the '{@link secondModel.PreferedPlayer#getPlayings <em>Playings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Playings</em>' attribute.
	 * @see #getPlayings()
	 * @generated
	 */
	void setPlayings(int value);

} // PreferedPlayer
