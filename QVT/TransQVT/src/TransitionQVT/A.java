/**
 */
package TransitionQVT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TransitionQVT.A#getHeight <em>Height</em>}</li>
 *   <li>{@link TransitionQVT.A#getReduction <em>Reduction</em>}</li>
 * </ul>
 *
 * @see TransitionQVT.TransitionQVTPackage#getA()
 * @model
 * @generated
 */
public interface A extends Element {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see TransitionQVT.TransitionQVTPackage#getA_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link TransitionQVT.A#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction</em>' attribute.
	 * @see #setReduction(Integer)
	 * @see TransitionQVT.TransitionQVTPackage#getA_Reduction()
	 * @model
	 * @generated
	 */
	Integer getReduction();

	/**
	 * Sets the value of the '{@link TransitionQVT.A#getReduction <em>Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction</em>' attribute.
	 * @see #getReduction()
	 * @generated
	 */
	void setReduction(Integer value);

} // A
