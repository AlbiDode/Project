/**
 */
package firstModel.impl;

import firstModel.FirstModelPackage;
import firstModel.TypeOfPlayers;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Of Players</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link firstModel.impl.TypeOfPlayersImpl#getName <em>Name</em>}</li>
 *   <li>{@link firstModel.impl.TypeOfPlayersImpl#getFrequencyofplaying <em>Frequencyofplaying</em>}</li>
 *   <li>{@link firstModel.impl.TypeOfPlayersImpl#getMoneywon <em>Moneywon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeOfPlayersImpl extends MinimalEObjectImpl.Container implements TypeOfPlayers {
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
	 * The default value of the '{@link #getFrequencyofplaying() <em>Frequencyofplaying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyofplaying()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCYOFPLAYING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequencyofplaying() <em>Frequencyofplaying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyofplaying()
	 * @generated
	 * @ordered
	 */
	protected int frequencyofplaying = FREQUENCYOFPLAYING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoneywon() <em>Moneywon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoneywon()
	 * @generated
	 * @ordered
	 */
	protected static final int MONEYWON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMoneywon() <em>Moneywon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoneywon()
	 * @generated
	 * @ordered
	 */
	protected int moneywon = MONEYWON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOfPlayersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FirstModelPackage.Literals.TYPE_OF_PLAYERS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FirstModelPackage.TYPE_OF_PLAYERS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequencyofplaying() {
		return frequencyofplaying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyofplaying(int newFrequencyofplaying) {
		int oldFrequencyofplaying = frequencyofplaying;
		frequencyofplaying = newFrequencyofplaying;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FirstModelPackage.TYPE_OF_PLAYERS__FREQUENCYOFPLAYING, oldFrequencyofplaying, frequencyofplaying));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMoneywon() {
		return moneywon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoneywon(int newMoneywon) {
		int oldMoneywon = moneywon;
		moneywon = newMoneywon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FirstModelPackage.TYPE_OF_PLAYERS__MONEYWON, oldMoneywon, moneywon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FirstModelPackage.TYPE_OF_PLAYERS__NAME:
				return getName();
			case FirstModelPackage.TYPE_OF_PLAYERS__FREQUENCYOFPLAYING:
				return getFrequencyofplaying();
			case FirstModelPackage.TYPE_OF_PLAYERS__MONEYWON:
				return getMoneywon();
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
			case FirstModelPackage.TYPE_OF_PLAYERS__NAME:
				setName((String)newValue);
				return;
			case FirstModelPackage.TYPE_OF_PLAYERS__FREQUENCYOFPLAYING:
				setFrequencyofplaying((Integer)newValue);
				return;
			case FirstModelPackage.TYPE_OF_PLAYERS__MONEYWON:
				setMoneywon((Integer)newValue);
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
			case FirstModelPackage.TYPE_OF_PLAYERS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FirstModelPackage.TYPE_OF_PLAYERS__FREQUENCYOFPLAYING:
				setFrequencyofplaying(FREQUENCYOFPLAYING_EDEFAULT);
				return;
			case FirstModelPackage.TYPE_OF_PLAYERS__MONEYWON:
				setMoneywon(MONEYWON_EDEFAULT);
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
			case FirstModelPackage.TYPE_OF_PLAYERS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FirstModelPackage.TYPE_OF_PLAYERS__FREQUENCYOFPLAYING:
				return frequencyofplaying != FREQUENCYOFPLAYING_EDEFAULT;
			case FirstModelPackage.TYPE_OF_PLAYERS__MONEYWON:
				return moneywon != MONEYWON_EDEFAULT;
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
		result.append(", frequencyofplaying: ");
		result.append(frequencyofplaying);
		result.append(", moneywon: ");
		result.append(moneywon);
		result.append(')');
		return result.toString();
	}

} //TypeOfPlayersImpl
