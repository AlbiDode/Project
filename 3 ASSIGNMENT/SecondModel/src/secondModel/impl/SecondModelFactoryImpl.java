/**
 */
package secondModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import secondModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecondModelFactoryImpl extends EFactoryImpl implements SecondModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecondModelFactory init() {
		try {
			SecondModelFactory theSecondModelFactory = (SecondModelFactory)EPackage.Registry.INSTANCE.getEFactory(SecondModelPackage.eNS_URI);
			if (theSecondModelFactory != null) {
				return theSecondModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecondModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SecondModelPackage.LIVE_SCORE: return createLiveScore();
			case SecondModelPackage.PREFERED_PLAYER: return createPreferedPlayer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveScore createLiveScore() {
		LiveScoreImpl liveScore = new LiveScoreImpl();
		return liveScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferedPlayer createPreferedPlayer() {
		PreferedPlayerImpl preferedPlayer = new PreferedPlayerImpl();
		return preferedPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondModelPackage getSecondModelPackage() {
		return (SecondModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecondModelPackage getPackage() {
		return SecondModelPackage.eINSTANCE;
	}

} //SecondModelFactoryImpl
