/**
 */
package firstModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see firstModel.FirstModelFactory
 * @model kind="package"
 * @generated
 */
public interface FirstModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "firstModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/firstModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "firstModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FirstModelPackage eINSTANCE = firstModel.impl.FirstModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link firstModel.impl.BetAndWinImpl <em>Bet And Win</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see firstModel.impl.BetAndWinImpl
	 * @see firstModel.impl.FirstModelPackageImpl#getBetAndWin()
	 * @generated
	 */
	int BET_AND_WIN = 0;

	/**
	 * The feature id for the '<em><b>Livebet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET_AND_WIN__LIVEBET = 0;

	/**
	 * The feature id for the '<em><b>Boss</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET_AND_WIN__BOSS = 1;

	/**
	 * The feature id for the '<em><b>Matchcategory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET_AND_WIN__MATCHCATEGORY = 2;

	/**
	 * The number of structural features of the '<em>Bet And Win</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET_AND_WIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bet And Win</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET_AND_WIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link firstModel.impl.TypeOfPlayersImpl <em>Type Of Players</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see firstModel.impl.TypeOfPlayersImpl
	 * @see firstModel.impl.FirstModelPackageImpl#getTypeOfPlayers()
	 * @generated
	 */
	int TYPE_OF_PLAYERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_PLAYERS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Frequencyofplaying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_PLAYERS__FREQUENCYOFPLAYING = 1;

	/**
	 * The feature id for the '<em><b>Moneywon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_PLAYERS__MONEYWON = 2;

	/**
	 * The number of structural features of the '<em>Type Of Players</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_PLAYERS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type Of Players</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_PLAYERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link firstModel.impl.LiveBetImpl <em>Live Bet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see firstModel.impl.LiveBetImpl
	 * @see firstModel.impl.FirstModelPackageImpl#getLiveBet()
	 * @generated
	 */
	int LIVE_BET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_BET__NAME = TYPE_OF_PLAYERS__NAME;

	/**
	 * The feature id for the '<em><b>Frequencyofplaying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_BET__FREQUENCYOFPLAYING = TYPE_OF_PLAYERS__FREQUENCYOFPLAYING;

	/**
	 * The feature id for the '<em><b>Moneywon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_BET__MONEYWON = TYPE_OF_PLAYERS__MONEYWON;

	/**
	 * The number of structural features of the '<em>Live Bet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_BET_FEATURE_COUNT = TYPE_OF_PLAYERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Live Bet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_BET_OPERATION_COUNT = TYPE_OF_PLAYERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link firstModel.impl.BossImpl <em>Boss</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see firstModel.impl.BossImpl
	 * @see firstModel.impl.FirstModelPackageImpl#getBoss()
	 * @generated
	 */
	int BOSS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOSS__NAME = TYPE_OF_PLAYERS__NAME;

	/**
	 * The feature id for the '<em><b>Frequencyofplaying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOSS__FREQUENCYOFPLAYING = TYPE_OF_PLAYERS__FREQUENCYOFPLAYING;

	/**
	 * The feature id for the '<em><b>Moneywon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOSS__MONEYWON = TYPE_OF_PLAYERS__MONEYWON;

	/**
	 * The number of structural features of the '<em>Boss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOSS_FEATURE_COUNT = TYPE_OF_PLAYERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOSS_OPERATION_COUNT = TYPE_OF_PLAYERS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link firstModel.BetAndWin <em>Bet And Win</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bet And Win</em>'.
	 * @see firstModel.BetAndWin
	 * @generated
	 */
	EClass getBetAndWin();

	/**
	 * Returns the meta object for the containment reference list '{@link firstModel.BetAndWin#getLivebet <em>Livebet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Livebet</em>'.
	 * @see firstModel.BetAndWin#getLivebet()
	 * @see #getBetAndWin()
	 * @generated
	 */
	EReference getBetAndWin_Livebet();

	/**
	 * Returns the meta object for the containment reference list '{@link firstModel.BetAndWin#getBoss <em>Boss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boss</em>'.
	 * @see firstModel.BetAndWin#getBoss()
	 * @see #getBetAndWin()
	 * @generated
	 */
	EReference getBetAndWin_Boss();

	/**
	 * Returns the meta object for the attribute '{@link firstModel.BetAndWin#getMatchcategory <em>Matchcategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matchcategory</em>'.
	 * @see firstModel.BetAndWin#getMatchcategory()
	 * @see #getBetAndWin()
	 * @generated
	 */
	EAttribute getBetAndWin_Matchcategory();

	/**
	 * Returns the meta object for class '{@link firstModel.TypeOfPlayers <em>Type Of Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Of Players</em>'.
	 * @see firstModel.TypeOfPlayers
	 * @generated
	 */
	EClass getTypeOfPlayers();

	/**
	 * Returns the meta object for the attribute '{@link firstModel.TypeOfPlayers#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see firstModel.TypeOfPlayers#getName()
	 * @see #getTypeOfPlayers()
	 * @generated
	 */
	EAttribute getTypeOfPlayers_Name();

	/**
	 * Returns the meta object for the attribute '{@link firstModel.TypeOfPlayers#getFrequencyofplaying <em>Frequencyofplaying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequencyofplaying</em>'.
	 * @see firstModel.TypeOfPlayers#getFrequencyofplaying()
	 * @see #getTypeOfPlayers()
	 * @generated
	 */
	EAttribute getTypeOfPlayers_Frequencyofplaying();

	/**
	 * Returns the meta object for the attribute '{@link firstModel.TypeOfPlayers#getMoneywon <em>Moneywon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moneywon</em>'.
	 * @see firstModel.TypeOfPlayers#getMoneywon()
	 * @see #getTypeOfPlayers()
	 * @generated
	 */
	EAttribute getTypeOfPlayers_Moneywon();

	/**
	 * Returns the meta object for class '{@link firstModel.LiveBet <em>Live Bet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Bet</em>'.
	 * @see firstModel.LiveBet
	 * @generated
	 */
	EClass getLiveBet();

	/**
	 * Returns the meta object for class '{@link firstModel.Boss <em>Boss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boss</em>'.
	 * @see firstModel.Boss
	 * @generated
	 */
	EClass getBoss();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FirstModelFactory getFirstModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link firstModel.impl.BetAndWinImpl <em>Bet And Win</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see firstModel.impl.BetAndWinImpl
		 * @see firstModel.impl.FirstModelPackageImpl#getBetAndWin()
		 * @generated
		 */
		EClass BET_AND_WIN = eINSTANCE.getBetAndWin();

		/**
		 * The meta object literal for the '<em><b>Livebet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BET_AND_WIN__LIVEBET = eINSTANCE.getBetAndWin_Livebet();

		/**
		 * The meta object literal for the '<em><b>Boss</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BET_AND_WIN__BOSS = eINSTANCE.getBetAndWin_Boss();

		/**
		 * The meta object literal for the '<em><b>Matchcategory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BET_AND_WIN__MATCHCATEGORY = eINSTANCE.getBetAndWin_Matchcategory();

		/**
		 * The meta object literal for the '{@link firstModel.impl.TypeOfPlayersImpl <em>Type Of Players</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see firstModel.impl.TypeOfPlayersImpl
		 * @see firstModel.impl.FirstModelPackageImpl#getTypeOfPlayers()
		 * @generated
		 */
		EClass TYPE_OF_PLAYERS = eINSTANCE.getTypeOfPlayers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_OF_PLAYERS__NAME = eINSTANCE.getTypeOfPlayers_Name();

		/**
		 * The meta object literal for the '<em><b>Frequencyofplaying</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_OF_PLAYERS__FREQUENCYOFPLAYING = eINSTANCE.getTypeOfPlayers_Frequencyofplaying();

		/**
		 * The meta object literal for the '<em><b>Moneywon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_OF_PLAYERS__MONEYWON = eINSTANCE.getTypeOfPlayers_Moneywon();

		/**
		 * The meta object literal for the '{@link firstModel.impl.LiveBetImpl <em>Live Bet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see firstModel.impl.LiveBetImpl
		 * @see firstModel.impl.FirstModelPackageImpl#getLiveBet()
		 * @generated
		 */
		EClass LIVE_BET = eINSTANCE.getLiveBet();

		/**
		 * The meta object literal for the '{@link firstModel.impl.BossImpl <em>Boss</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see firstModel.impl.BossImpl
		 * @see firstModel.impl.FirstModelPackageImpl#getBoss()
		 * @generated
		 */
		EClass BOSS = eINSTANCE.getBoss();

	}

} //FirstModelPackage
