/**
 */
package firstModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bet And Win</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link firstModel.BetAndWin#getLivebet <em>Livebet</em>}</li>
 *   <li>{@link firstModel.BetAndWin#getBoss <em>Boss</em>}</li>
 *   <li>{@link firstModel.BetAndWin#getMatchcategory <em>Matchcategory</em>}</li>
 * </ul>
 *
 * @see firstModel.FirstModelPackage#getBetAndWin()
 * @model
 * @generated
 */
public interface BetAndWin extends EObject {
	/**
	 * Returns the value of the '<em><b>Livebet</b></em>' containment reference list.
	 * The list contents are of type {@link firstModel.LiveBet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Livebet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Livebet</em>' containment reference list.
	 * @see firstModel.FirstModelPackage#getBetAndWin_Livebet()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiveBet> getLivebet();

	/**
	 * Returns the value of the '<em><b>Boss</b></em>' containment reference list.
	 * The list contents are of type {@link firstModel.Boss}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boss</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boss</em>' containment reference list.
	 * @see firstModel.FirstModelPackage#getBetAndWin_Boss()
	 * @model containment="true"
	 * @generated
	 */
	EList<Boss> getBoss();

	/**
	 * Returns the value of the '<em><b>Matchcategory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchcategory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchcategory</em>' attribute.
	 * @see #setMatchcategory(String)
	 * @see firstModel.FirstModelPackage#getBetAndWin_Matchcategory()
	 * @model
	 * @generated
	 */
	String getMatchcategory();

	/**
	 * Sets the value of the '{@link firstModel.BetAndWin#getMatchcategory <em>Matchcategory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchcategory</em>' attribute.
	 * @see #getMatchcategory()
	 * @generated
	 */
	void setMatchcategory(String value);

} // BetAndWin
