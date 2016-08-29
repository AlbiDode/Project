/**
 */
package secondModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import secondModel.LiveScore;
import secondModel.PreferedPlayer;
import secondModel.SecondModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secondModel.impl.LiveScoreImpl#getPreferedplayer <em>Preferedplayer</em>}</li>
 *   <li>{@link secondModel.impl.LiveScoreImpl#getSalonname <em>Salonname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiveScoreImpl extends MinimalEObjectImpl.Container implements LiveScore {
	/**
	 * The cached value of the '{@link #getPreferedplayer() <em>Preferedplayer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferedplayer()
	 * @generated
	 * @ordered
	 */
	protected EList<PreferedPlayer> preferedplayer;

	/**
	 * The default value of the '{@link #getSalonname() <em>Salonname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalonname()
	 * @generated
	 * @ordered
	 */
	protected static final String SALONNAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSalonname() <em>Salonname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalonname()
	 * @generated
	 * @ordered
	 */
	protected String salonname = SALONNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecondModelPackage.Literals.LIVE_SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreferedPlayer> getPreferedplayer() {
		if (preferedplayer == null) {
			preferedplayer = new EObjectContainmentEList<PreferedPlayer>(PreferedPlayer.class, this, SecondModelPackage.LIVE_SCORE__PREFEREDPLAYER);
		}
		return preferedplayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalonname() {
		return salonname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalonname(String newSalonname) {
		String oldSalonname = salonname;
		salonname = newSalonname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecondModelPackage.LIVE_SCORE__SALONNAME, oldSalonname, salonname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecondModelPackage.LIVE_SCORE__PREFEREDPLAYER:
				return ((InternalEList<?>)getPreferedplayer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecondModelPackage.LIVE_SCORE__PREFEREDPLAYER:
				return getPreferedplayer();
			case SecondModelPackage.LIVE_SCORE__SALONNAME:
				return getSalonname();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecondModelPackage.LIVE_SCORE__PREFEREDPLAYER:
				getPreferedplayer().clear();
				getPreferedplayer().addAll((Collection<? extends PreferedPlayer>)newValue);
				return;
			case SecondModelPackage.LIVE_SCORE__SALONNAME:
				setSalonname((String)newValue);
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
			case SecondModelPackage.LIVE_SCORE__PREFEREDPLAYER:
				getPreferedplayer().clear();
				return;
			case SecondModelPackage.LIVE_SCORE__SALONNAME:
				setSalonname(SALONNAME_EDEFAULT);
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
			case SecondModelPackage.LIVE_SCORE__PREFEREDPLAYER:
				return preferedplayer != null && !preferedplayer.isEmpty();
			case SecondModelPackage.LIVE_SCORE__SALONNAME:
				return SALONNAME_EDEFAULT == null ? salonname != null : !SALONNAME_EDEFAULT.equals(salonname);
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
		result.append(" (salonname: ");
		result.append(salonname);
		result.append(')');
		return result.toString();
	}

} //LiveScoreImpl
