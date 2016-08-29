/**
 */
package secondModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import secondModel.PreferedPlayer;
import secondModel.SecondModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefered Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secondModel.impl.PreferedPlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link secondModel.impl.PreferedPlayerImpl#getWon <em>Won</em>}</li>
 *   <li>{@link secondModel.impl.PreferedPlayerImpl#getPlayings <em>Playings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreferedPlayerImpl extends MinimalEObjectImpl.Container implements PreferedPlayer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWon() <em>Won</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWon()
	 * @generated
	 * @ordered
	 */
	protected static final int WON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWon() <em>Won</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWon()
	 * @generated
	 * @ordered
	 */
	protected int won = WON_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayings() <em>Playings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayings()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYINGS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlayings() <em>Playings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayings()
	 * @generated
	 * @ordered
	 */
	protected int playings = PLAYINGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferedPlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecondModelPackage.Literals.PREFERED_PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecondModelPackage.PREFERED_PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWon() {
		return won;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWon(int newWon) {
		int oldWon = won;
		won = newWon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecondModelPackage.PREFERED_PLAYER__WON, oldWon, won));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPlayings() {
		return playings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayings(int newPlayings) {
		int oldPlayings = playings;
		playings = newPlayings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecondModelPackage.PREFERED_PLAYER__PLAYINGS, oldPlayings, playings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecondModelPackage.PREFERED_PLAYER__NAME:
				return getName();
			case SecondModelPackage.PREFERED_PLAYER__WON:
				return getWon();
			case SecondModelPackage.PREFERED_PLAYER__PLAYINGS:
				return getPlayings();
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
			case SecondModelPackage.PREFERED_PLAYER__NAME:
				setName((String)newValue);
				return;
			case SecondModelPackage.PREFERED_PLAYER__WON:
				setWon((Integer)newValue);
				return;
			case SecondModelPackage.PREFERED_PLAYER__PLAYINGS:
				setPlayings((Integer)newValue);
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
			case SecondModelPackage.PREFERED_PLAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecondModelPackage.PREFERED_PLAYER__WON:
				setWon(WON_EDEFAULT);
				return;
			case SecondModelPackage.PREFERED_PLAYER__PLAYINGS:
				setPlayings(PLAYINGS_EDEFAULT);
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
			case SecondModelPackage.PREFERED_PLAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecondModelPackage.PREFERED_PLAYER__WON:
				return won != WON_EDEFAULT;
			case SecondModelPackage.PREFERED_PLAYER__PLAYINGS:
				return playings != PLAYINGS_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", won: ");
		result.append(won);
		result.append(", playings: ");
		result.append(playings);
		result.append(')');
		return result.toString();
	}

} //PreferedPlayerImpl
