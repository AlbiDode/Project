/**
 */
package TransitionQVT.impl;

import TransitionQVT.B;
import TransitionQVT.TransitionQVTPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TransitionQVT.impl.BImpl#getBoss <em>Boss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BImpl extends ElementImpl implements B {
	/**
	 * The default value of the '{@link #getBoss() <em>Boss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoss()
	 * @generated
	 * @ordered
	 */
	protected static final String BOSS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoss() <em>Boss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoss()
	 * @generated
	 * @ordered
	 */
	protected String boss = BOSS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransitionQVTPackage.Literals.B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoss() {
		return boss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoss(String newBoss) {
		String oldBoss = boss;
		boss = newBoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionQVTPackage.B__BOSS, oldBoss, boss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransitionQVTPackage.B__BOSS:
				return getBoss();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransitionQVTPackage.B__BOSS:
				setBoss((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TransitionQVTPackage.B__BOSS:
				setBoss(BOSS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TransitionQVTPackage.B__BOSS:
				return BOSS_EDEFAULT == null ? boss != null : !BOSS_EDEFAULT.equals(boss);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (boss: ");
		result.append(boss);
		result.append(')');
		return result.toString();
	}

} //BImpl
