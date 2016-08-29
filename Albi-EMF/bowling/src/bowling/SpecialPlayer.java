/**
 */
package bowling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.SpecialPlayer#getMedals <em>Medals</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getSpecialPlayer()
 * @model
 * @generated
 */
public interface SpecialPlayer extends Player {
	/**
	 * Returns the value of the '<em><b>Medals</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medals</em>' attribute.
	 * @see #setMedals(int)
	 * @see bowling.BowlingPackage#getSpecialPlayer_Medals()
	 * @model default="2"
	 * @generated
	 */
	int getMedals();

	/**
	 * Sets the value of the '{@link bowling.SpecialPlayer#getMedals <em>Medals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medals</em>' attribute.
	 * @see #getMedals()
	 * @generated
	 */
	void setMedals(int value);

} // SpecialPlayer
