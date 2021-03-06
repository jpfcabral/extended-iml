/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iml.extendedIML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.iml.extendedIML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedIMLFactoryImpl extends EFactoryImpl implements ExtendedIMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExtendedIMLFactory init()
  {
    try
    {
      ExtendedIMLFactory theExtendedIMLFactory = (ExtendedIMLFactory)EPackage.Registry.INSTANCE.getEFactory(ExtendedIMLPackage.eNS_URI);
      if (theExtendedIMLFactory != null)
      {
        return theExtendedIMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExtendedIMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedIMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExtendedIMLPackage.MODEL: return createModel();
      case ExtendedIMLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case ExtendedIMLPackage.IMPORTER: return createImporter();
      case ExtendedIMLPackage.IMAGE_IMPORTER: return createImageImporter();
      case ExtendedIMLPackage.DIR_IMPORTER: return createDirImporter();
      case ExtendedIMLPackage.OPERATOR: return createOperator();
      case ExtendedIMLPackage.ROTATE_OPERATION: return createRotateOperation();
      case ExtendedIMLPackage.FILTER_OPERATION: return createFilterOperation();
      case ExtendedIMLPackage.BLUR_OPERATION: return createBlurOperation();
      case ExtendedIMLPackage.EQUALIZE_OPERATION: return createEqualizeOperation();
      case ExtendedIMLPackage.SHOW_OPERATION: return createShowOperation();
      case ExtendedIMLPackage.SAVE_OPERATION: return createSaveOperation();
      case ExtendedIMLPackage.FILL_OPERATION: return createFillOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Importer createImporter()
  {
    ImporterImpl importer = new ImporterImpl();
    return importer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImageImporter createImageImporter()
  {
    ImageImporterImpl imageImporter = new ImageImporterImpl();
    return imageImporter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DirImporter createDirImporter()
  {
    DirImporterImpl dirImporter = new DirImporterImpl();
    return dirImporter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RotateOperation createRotateOperation()
  {
    RotateOperationImpl rotateOperation = new RotateOperationImpl();
    return rotateOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterOperation createFilterOperation()
  {
    FilterOperationImpl filterOperation = new FilterOperationImpl();
    return filterOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BlurOperation createBlurOperation()
  {
    BlurOperationImpl blurOperation = new BlurOperationImpl();
    return blurOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EqualizeOperation createEqualizeOperation()
  {
    EqualizeOperationImpl equalizeOperation = new EqualizeOperationImpl();
    return equalizeOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShowOperation createShowOperation()
  {
    ShowOperationImpl showOperation = new ShowOperationImpl();
    return showOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SaveOperation createSaveOperation()
  {
    SaveOperationImpl saveOperation = new SaveOperationImpl();
    return saveOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FillOperation createFillOperation()
  {
    FillOperationImpl fillOperation = new FillOperationImpl();
    return fillOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExtendedIMLPackage getExtendedIMLPackage()
  {
    return (ExtendedIMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExtendedIMLPackage getPackage()
  {
    return ExtendedIMLPackage.eINSTANCE;
  }

} //ExtendedIMLFactoryImpl
