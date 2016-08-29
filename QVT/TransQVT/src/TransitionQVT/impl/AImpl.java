/**
 */
package TransitionQVT.impl;

import TransitionQVT.A;
import TransitionQVT.TransitionQVTPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TransitionQVT.impl.AImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link TransitionQVT.impl.AImpl#getReduction <em>Reduction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AImpl extends ElementImpl implements A {
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReduction() <em>Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REDUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReduction() <em>Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduction()
	 * @generated
	 * @ordered
	 */
	protected Integer reduction = REDUCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransitionQVTPackage.Literals.A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionQVTPackage.A__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReduction() {
		return reduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReduction(Integer newReduction) {
		Integer oldReduction = reduction;
		reduction = newReduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionQVTPackage.A__REDUCTION, oldReduction, reduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransitionQVTPackage.A__HEIGHT:
				return getHeight();
			case TransitionQVTPackage.A__REDUCTION:
				return getReduction();
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
			case TransitionQVTPackage.A__HEIGHT:
				setHeight((Double)newValue);
				return;
			case TransitionQVTPackage.A__REDUCTION:
				setReduction((Integer)newValue);
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
			case TransitionQVTPackage.A__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case TransitionQVTPackage.A__REDUCTION:
				setReduction(REDUCTION_EDEFAULT);
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
			case TransitionQVTPackage.A__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case TransitionQVTPackage.A__REDUCTION:
				return REDUCTION_EDEFAULT == null ? reduction != null : !REDUCTION_EDEFAULT.equals(reduction);
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
		result.append(" (height: ");
		result.append(height);
		result.append(", reduction: ");
		result.append(reduction);
		result.append(')');
		return result.toString();
	}

} //AImpl
