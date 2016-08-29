/**
 */
package firstModel.impl;

import firstModel.BetAndWin;
import firstModel.Boss;
import firstModel.FirstModelPackage;
import firstModel.LiveBet;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bet And Win</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link firstModel.impl.BetAndWinImpl#getLivebet <em>Livebet</em>}</li>
 *   <li>{@link firstModel.impl.BetAndWinImpl#getBoss <em>Boss</em>}</li>
 *   <li>{@link firstModel.impl.BetAndWinImpl#getMatchcategory <em>Matchcategory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BetAndWinImpl extends MinimalEObjectImpl.Container implements BetAndWin {
	/**
	 * The cached value of the '{@link #getLivebet() <em>Livebet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivebet()
	 * @generated
	 * @ordered
	 */
	protected EList<LiveBet> livebet;

	/**
	 * The cached value of the '{@link #getBoss() <em>Boss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoss()
	 * @generated
	 * @ordered
	 */
	protected EList<Boss> boss;

	/**
	 * The default value of the '{@link #getMatchcategory() <em>Matchcategory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchcategory()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCHCATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchcategory() <em>Matchcategory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchcategory()
	 * @generated
	 * @ordered
	 */
	protected String matchcategory = MATCHCATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetAndWinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FirstModelPackage.Literals.BET_AND_WIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiveBet> getLivebet() {
		if (livebet == null) {
			livebet = new EObjectContainmentEList<LiveBet>(LiveBet.class, this, FirstModelPackage.BET_AND_WIN__LIVEBET);
		}
		return livebet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boss> getBoss() {
		if (boss == null) {
			boss = new EObjectContainmentEList<Boss>(Boss.class, this, FirstModelPackage.BET_AND_WIN__BOSS);
		}
		return boss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchcategory() {
		return matchcategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchcategory(String newMatchcategory) {
		String oldMatchcategory = matchcategory;
		matchcategory = newMatchcategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FirstModelPackage.BET_AND_WIN__MATCHCATEGORY, oldMatchcategory, matchcategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FirstModelPackage.BET_AND_WIN__LIVEBET:
				return ((InternalEList<?>)getLivebet()).basicRemove(otherEnd, msgs);
			case FirstModelPackage.BET_AND_WIN__BOSS:
				return ((InternalEList<?>)getBoss()).basicRemove(otherEnd, msgs);
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
			case FirstModelPackage.BET_AND_WIN__LIVEBET:
				return getLivebet();
			case FirstModelPackage.BET_AND_WIN__BOSS:
				return getBoss();
			case FirstModelPackage.BET_AND_WIN__MATCHCATEGORY:
				return getMatchcategory();
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
			case FirstModelPackage.BET_AND_WIN__LIVEBET:
				getLivebet().clear();
				getLivebet().addAll((Collection<? extends LiveBet>)newValue);
				return;
			case FirstModelPackage.BET_AND_WIN__BOSS:
				getBoss().clear();
				getBoss().addAll((Collection<? extends Boss>)newValue);
				return;
			case FirstModelPackage.BET_AND_WIN__MATCHCATEGORY:
				setMatchcategory((String)newValue);
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
			case FirstModelPackage.BET_AND_WIN__LIVEBET:
				getLivebet().clear();
				return;
			case FirstModelPackage.BET_AND_WIN__BOSS:
				getBoss().clear();
				return;
			case FirstModelPackage.BET_AND_WIN__MATCHCATEGORY:
				setMatchcategory(MATCHCATEGORY_EDEFAULT);
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
			case FirstModelPackage.BET_AND_WIN__LIVEBET:
				return livebet != null && !livebet.isEmpty();
			case FirstModelPackage.BET_AND_WIN__BOSS:
				return boss != null && !boss.isEmpty();
			case FirstModelPackage.BET_AND_WIN__MATCHCATEGORY:
				return MATCHCATEGORY_EDEFAULT == null ? matchcategory != null : !MATCHCATEGORY_EDEFAULT.equals(matchcategory);
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
		result.append(" (matchcategory: ");
		result.append(matchcategory);
		result.append(')');
		return result.toString();
	}

} //BetAndWinImpl
