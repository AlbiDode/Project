/**
 */
package secondModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import secondModel.LiveScore;
import secondModel.PreferedPlayer;
import secondModel.SecondModelFactory;
import secondModel.SecondModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecondModelPackageImpl extends EPackageImpl implements SecondModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferedPlayerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see secondModel.SecondModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecondModelPackageImpl() {
		super(eNS_URI, SecondModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SecondModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecondModelPackage init() {
		if (isInited) return (SecondModelPackage)EPackage.Registry.INSTANCE.getEPackage(SecondModelPackage.eNS_URI);

		// Obtain or create and register package
		SecondModelPackageImpl theSecondModelPackage = (SecondModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecondModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecondModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSecondModelPackage.createPackageContents();

		// Initialize created meta-data
		theSecondModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecondModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecondModelPackage.eNS_URI, theSecondModelPackage);
		return theSecondModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveScore() {
		return liveScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiveScore_Preferedplayer() {
		return (EReference)liveScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveScore_Salonname() {
		return (EAttribute)liveScoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreferedPlayer() {
		return preferedPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreferedPlayer_Name() {
		return (EAttribute)preferedPlayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreferedPlayer_Won() {
		return (EAttribute)preferedPlayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreferedPlayer_Playings() {
		return (EAttribute)preferedPlayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondModelFactory getSecondModelFactory() {
		return (SecondModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		liveScoreEClass = createEClass(LIVE_SCORE);
		createEReference(liveScoreEClass, LIVE_SCORE__PREFEREDPLAYER);
		createEAttribute(liveScoreEClass, LIVE_SCORE__SALONNAME);

		preferedPlayerEClass = createEClass(PREFERED_PLAYER);
		createEAttribute(preferedPlayerEClass, PREFERED_PLAYER__NAME);
		createEAttribute(preferedPlayerEClass, PREFERED_PLAYER__WON);
		createEAttribute(preferedPlayerEClass, PREFERED_PLAYER__PLAYINGS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(liveScoreEClass, LiveScore.class, "LiveScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiveScore_Preferedplayer(), this.getPreferedPlayer(), null, "preferedplayer", null, 0, -1, LiveScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveScore_Salonname(), ecorePackage.getEString(), "salonname", null, 0, 1, LiveScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preferedPlayerEClass, PreferedPlayer.class, "PreferedPlayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreferedPlayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, PreferedPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreferedPlayer_Won(), ecorePackage.getEInt(), "won", null, 0, 1, PreferedPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreferedPlayer_Playings(), ecorePackage.getEInt(), "playings", null, 0, 1, PreferedPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SecondModelPackageImpl
