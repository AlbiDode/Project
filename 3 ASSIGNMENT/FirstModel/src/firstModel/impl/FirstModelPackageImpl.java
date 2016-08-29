/**
 */
package firstModel.impl;

import firstModel.BetAndWin;
import firstModel.Boss;
import firstModel.FirstModelFactory;
import firstModel.FirstModelPackage;
import firstModel.LiveBet;
import firstModel.TypeOfPlayers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FirstModelPackageImpl extends EPackageImpl implements FirstModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betAndWinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeOfPlayersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveBetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bossEClass = null;

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
	 * @see firstModel.FirstModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FirstModelPackageImpl() {
		super(eNS_URI, FirstModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FirstModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FirstModelPackage init() {
		if (isInited) return (FirstModelPackage)EPackage.Registry.INSTANCE.getEPackage(FirstModelPackage.eNS_URI);

		// Obtain or create and register package
		FirstModelPackageImpl theFirstModelPackage = (FirstModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FirstModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FirstModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFirstModelPackage.createPackageContents();

		// Initialize created meta-data
		theFirstModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFirstModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FirstModelPackage.eNS_URI, theFirstModelPackage);
		return theFirstModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBetAndWin() {
		return betAndWinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBetAndWin_Livebet() {
		return (EReference)betAndWinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBetAndWin_Boss() {
		return (EReference)betAndWinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBetAndWin_Matchcategory() {
		return (EAttribute)betAndWinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeOfPlayers() {
		return typeOfPlayersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeOfPlayers_Name() {
		return (EAttribute)typeOfPlayersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeOfPlayers_Frequencyofplaying() {
		return (EAttribute)typeOfPlayersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeOfPlayers_Moneywon() {
		return (EAttribute)typeOfPlayersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveBet() {
		return liveBetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoss() {
		return bossEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstModelFactory getFirstModelFactory() {
		return (FirstModelFactory)getEFactoryInstance();
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
		betAndWinEClass = createEClass(BET_AND_WIN);
		createEReference(betAndWinEClass, BET_AND_WIN__LIVEBET);
		createEReference(betAndWinEClass, BET_AND_WIN__BOSS);
		createEAttribute(betAndWinEClass, BET_AND_WIN__MATCHCATEGORY);

		typeOfPlayersEClass = createEClass(TYPE_OF_PLAYERS);
		createEAttribute(typeOfPlayersEClass, TYPE_OF_PLAYERS__NAME);
		createEAttribute(typeOfPlayersEClass, TYPE_OF_PLAYERS__FREQUENCYOFPLAYING);
		createEAttribute(typeOfPlayersEClass, TYPE_OF_PLAYERS__MONEYWON);

		liveBetEClass = createEClass(LIVE_BET);

		bossEClass = createEClass(BOSS);
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
		liveBetEClass.getESuperTypes().add(this.getTypeOfPlayers());
		bossEClass.getESuperTypes().add(this.getTypeOfPlayers());

		// Initialize classes, features, and operations; add parameters
		initEClass(betAndWinEClass, BetAndWin.class, "BetAndWin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBetAndWin_Livebet(), this.getLiveBet(), null, "livebet", null, 0, -1, BetAndWin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBetAndWin_Boss(), this.getBoss(), null, "boss", null, 0, -1, BetAndWin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBetAndWin_Matchcategory(), ecorePackage.getEString(), "matchcategory", null, 0, 1, BetAndWin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeOfPlayersEClass, TypeOfPlayers.class, "TypeOfPlayers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeOfPlayers_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeOfPlayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeOfPlayers_Frequencyofplaying(), ecorePackage.getEInt(), "frequencyofplaying", null, 0, 1, TypeOfPlayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeOfPlayers_Moneywon(), ecorePackage.getEInt(), "moneywon", null, 0, 1, TypeOfPlayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveBetEClass, LiveBet.class, "LiveBet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bossEClass, Boss.class, "Boss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FirstModelPackageImpl
