/**
 */
package firstModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Of Players</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link firstModel.TypeOfPlayers#getName <em>Name</em>}</li>
 *   <li>{@link firstModel.TypeOfPlayers#getFrequencyofplaying <em>Frequencyofplaying</em>}</li>
 *   <li>{@link firstModel.TypeOfPlayers#getMoneywon <em>Moneywon</em>}</li>
 * </ul>
 *
 * @see firstModel.FirstModelPackage#getTypeOfPlayers()
 * @model
 * @generated
 */
public interface TypeOfPlayers extends EObject {
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
	 * @see firstModel.FirstModelPackage#getTypeOfPlayers_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link firstModel.TypeOfPlayers#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Frequencyofplaying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequencyofplaying</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequencyofplaying</em>' attribute.
	 * @see #setFrequencyofplaying(int)
	 * @see firstModel.FirstModelPackage#getTypeOfPlayers_Frequencyofplaying()
	 * @model
	 * @generated
	 */
	int getFrequencyofplaying();

	/**
	 * Sets the value of the '{@link firstModel.TypeOfPlayers#getFrequencyofplaying <em>Frequencyofplaying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequencyofplaying</em>' attribute.
	 * @see #getFrequencyofplaying()
	 * @generated
	 */
	void setFrequencyofplaying(int value);

	/**
	 * Returns the value of the '<em><b>Moneywon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moneywon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moneywon</em>' attribute.
	 * @see #setMoneywon(int)
	 * @see firstModel.FirstModelPackage#getTypeOfPlayers_Moneywon()
	 * @model
	 * @generated
	 */
	int getMoneywon();

	/**
	 * Sets the value of the '{@link firstModel.TypeOfPlayers#getMoneywon <em>Moneywon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moneywon</em>' attribute.
	 * @see #getMoneywon()
	 * @generated
	 */
	void setMoneywon(int value);

} // TypeOfPlayers
