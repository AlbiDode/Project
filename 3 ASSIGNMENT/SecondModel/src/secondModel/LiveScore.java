/**
 */
package secondModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secondModel.LiveScore#getPreferedplayer <em>Preferedplayer</em>}</li>
 *   <li>{@link secondModel.LiveScore#getSalonname <em>Salonname</em>}</li>
 * </ul>
 *
 * @see secondModel.SecondModelPackage#getLiveScore()
 * @model
 * @generated
 */
public interface LiveScore extends EObject {
	/**
	 * Returns the value of the '<em><b>Preferedplayer</b></em>' containment reference list.
	 * The list contents are of type {@link secondModel.PreferedPlayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferedplayer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferedplayer</em>' containment reference list.
	 * @see secondModel.SecondModelPackage#getLiveScore_Preferedplayer()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreferedPlayer> getPreferedplayer();

	/**
	 * Returns the value of the '<em><b>Salonname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salonname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salonname</em>' attribute.
	 * @see #setSalonname(String)
	 * @see secondModel.SecondModelPackage#getLiveScore_Salonname()
	 * @model
	 * @generated
	 */
	String getSalonname();

	/**
	 * Sets the value of the '{@link secondModel.LiveScore#getSalonname <em>Salonname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salonname</em>' attribute.
	 * @see #getSalonname()
	 * @generated
	 */
	void setSalonname(String value);

} // LiveScore
