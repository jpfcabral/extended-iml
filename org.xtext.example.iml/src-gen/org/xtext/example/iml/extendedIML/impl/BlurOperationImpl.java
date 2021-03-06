/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iml.extendedIML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.iml.extendedIML.BlurOperation;
import org.xtext.example.iml.extendedIML.ExtendedIMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blur Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.iml.extendedIML.impl.BlurOperationImpl#getIntensity <em>Intensity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlurOperationImpl extends OperatorImpl implements BlurOperation
{
  /**
   * The default value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntensity()
   * @generated
   * @ordered
   */
  protected static final String INTENSITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntensity()
   * @generated
   * @ordered
   */
  protected String intensity = INTENSITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlurOperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExtendedIMLPackage.Literals.BLUR_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIntensity()
  {
    return intensity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntensity(String newIntensity)
  {
    String oldIntensity = intensity;
    intensity = newIntensity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedIMLPackage.BLUR_OPERATION__INTENSITY, oldIntensity, intensity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExtendedIMLPackage.BLUR_OPERATION__INTENSITY:
        return getIntensity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtendedIMLPackage.BLUR_OPERATION__INTENSITY:
        setIntensity((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExtendedIMLPackage.BLUR_OPERATION__INTENSITY:
        setIntensity(INTENSITY_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExtendedIMLPackage.BLUR_OPERATION__INTENSITY:
        return INTENSITY_EDEFAULT == null ? intensity != null : !INTENSITY_EDEFAULT.equals(intensity);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (intensity: ");
    result.append(intensity);
    result.append(')');
    return result.toString();
  }

} //BlurOperationImpl
