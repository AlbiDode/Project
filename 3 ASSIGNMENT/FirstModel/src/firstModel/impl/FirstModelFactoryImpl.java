/**
 */
package firstModel.impl;

import firstModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FirstModelFactoryImpl extends EFactoryImpl implements FirstModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FirstModelFactory init() {
		try {
			FirstModelFactory theFirstModelFactory = (FirstModelFactory)EPackage.Registry.INSTANCE.getEFactory(FirstModelPackage.eNS_URI);
			if (theFirstModelFactory != null) {
				return theFirstModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FirstModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstModelFactoryImpl() {
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
			case FirstModelPackage.BET_AND_WIN: return createBetAndWin();
			case FirstModelPackage.TYPE_OF_PLAYERS: return createTypeOfPlayers();
			case FirstModelPackage.LIVE_BET: return createLiveBet();
			case FirstModelPackage.BOSS: return createBoss();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BetAndWin createBetAndWin() {
		BetAndWinImpl betAndWin = new BetAndWinImpl();
		return betAndWin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfPlayers createTypeOfPlayers() {
		TypeOfPlayersImpl typeOfPlayers = new TypeOfPlayersImpl();
		return typeOfPlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveBet createLiveBet() {
		LiveBetImpl liveBet = new LiveBetImpl();
		return liveBet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boss createBoss() {
		BossImpl boss = new BossImpl();
		return boss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstModelPackage getFirstModelPackage() {
		return (FirstModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FirstModelPackage getPackage() {
		return FirstModelPackage.eINSTANCE;
	}

} //FirstModelFactoryImpl
