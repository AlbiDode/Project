/**
 */
package secondModel;

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
 * @see secondModel.SecondModelFactory
 * @model kind="package"
 * @generated
 */
public interface SecondModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "secondModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/secondModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "secondModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecondModelPackage eINSTANCE = secondModel.impl.SecondModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link secondModel.impl.LiveScoreImpl <em>Live Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secondModel.impl.LiveScoreImpl
	 * @see secondModel.impl.SecondModelPackageImpl#getLiveScore()
	 * @generated
	 */
	int LIVE_SCORE = 0;

	/**
	 * The feature id for the '<em><b>Preferedplayer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCORE__PREFEREDPLAYER = 0;

	/**
	 * The feature id for the '<em><b>Salonname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCORE__SALONNAME = 1;

	/**
	 * The number of structural features of the '<em>Live Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCORE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Live Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link secondModel.impl.PreferedPlayerImpl <em>Prefered Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secondModel.impl.PreferedPlayerImpl
	 * @see secondModel.impl.SecondModelPackageImpl#getPreferedPlayer()
	 * @generated
	 */
	int PREFERED_PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERED_PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Won</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERED_PLAYER__WON = 1;

	/**
	 * The feature id for the '<em><b>Playings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERED_PLAYER__PLAYINGS = 2;

	/**
	 * The number of structural features of the '<em>Prefered Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERED_PLAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Prefered Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERED_PLAYER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link secondModel.LiveScore <em>Live Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Score</em>'.
	 * @see secondModel.LiveScore
	 * @generated
	 */
	EClass getLiveScore();

	/**
	 * Returns the meta object for the containment reference list '{@link secondModel.LiveScore#getPreferedplayer <em>Preferedplayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferedplayer</em>'.
	 * @see secondModel.LiveScore#getPreferedplayer()
	 * @see #getLiveScore()
	 * @generated
	 */
	EReference getLiveScore_Preferedplayer();

	/**
	 * Returns the meta object for the attribute '{@link secondModel.LiveScore#getSalonname <em>Salonname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salonname</em>'.
	 * @see secondModel.LiveScore#getSalonname()
	 * @see #getLiveScore()
	 * @generated
	 */
	EAttribute getLiveScore_Salonname();

	/**
	 * Returns the meta object for class '{@link secondModel.PreferedPlayer <em>Prefered Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefered Player</em>'.
	 * @see secondModel.PreferedPlayer
	 * @generated
	 */
	EClass getPreferedPlayer();

	/**
	 * Returns the meta object for the attribute '{@link secondModel.PreferedPlayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see secondModel.PreferedPlayer#getName()
	 * @see #getPreferedPlayer()
	 * @generated
	 */
	EAttribute getPreferedPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link secondModel.PreferedPlayer#getWon <em>Won</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Won</em>'.
	 * @see secondModel.PreferedPlayer#getWon()
	 * @see #getPreferedPlayer()
	 * @generated
	 */
	EAttribute getPreferedPlayer_Won();

	/**
	 * Returns the meta object for the attribute '{@link secondModel.PreferedPlayer#getPlayings <em>Playings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Playings</em>'.
	 * @see secondModel.PreferedPlayer#getPlayings()
	 * @see #getPreferedPlayer()
	 * @generated
	 */
	EAttribute getPreferedPlayer_Playings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecondModelFactory getSecondModelFactory();

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
		 * The meta object literal for the '{@link secondModel.impl.LiveScoreImpl <em>Live Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secondModel.impl.LiveScoreImpl
		 * @see secondModel.impl.SecondModelPackageImpl#getLiveScore()
		 * @generated
		 */
		EClass LIVE_SCORE = eINSTANCE.getLiveScore();

		/**
		 * The meta object literal for the '<em><b>Preferedplayer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVE_SCORE__PREFEREDPLAYER = eINSTANCE.getLiveScore_Preferedplayer();

		/**
		 * The meta object literal for the '<em><b>Salonname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SCORE__SALONNAME = eINSTANCE.getLiveScore_Salonname();

		/**
		 * The meta object literal for the '{@link secondModel.impl.PreferedPlayerImpl <em>Prefered Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secondModel.impl.PreferedPlayerImpl
		 * @see secondModel.impl.SecondModelPackageImpl#getPreferedPlayer()
		 * @generated
		 */
		EClass PREFERED_PLAYER = eINSTANCE.getPreferedPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERED_PLAYER__NAME = eINSTANCE.getPreferedPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Won</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERED_PLAYER__WON = eINSTANCE.getPreferedPlayer_Won();

		/**
		 * The meta object literal for the '<em><b>Playings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERED_PLAYER__PLAYINGS = eINSTANCE.getPreferedPlayer_Playings();

	}

} //SecondModelPackage
