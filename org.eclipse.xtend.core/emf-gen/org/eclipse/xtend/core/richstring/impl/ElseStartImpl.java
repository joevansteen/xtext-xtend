/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtend.core.richstring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtend.core.richstring.ElseStart;
import org.eclipse.xtend.core.richstring.IfConditionStart;
import org.eclipse.xtend.core.richstring.ProcessedRichStringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Else Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ElseStartImpl#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElseStartImpl extends LinePartImpl implements ElseStart
{
	/**
	 * The cached value of the '{@link #getIfConditionStart() <em>If Condition Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfConditionStart()
	 * @generated
	 * @ordered
	 */
	protected IfConditionStart ifConditionStart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseStartImpl()
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
		return ProcessedRichStringPackage.Literals.ELSE_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfConditionStart getIfConditionStart()
	{
		if (ifConditionStart != null && ifConditionStart.eIsProxy())
		{
			InternalEObject oldIfConditionStart = (InternalEObject)ifConditionStart;
			ifConditionStart = (IfConditionStart)eResolveProxy(oldIfConditionStart);
			if (ifConditionStart != oldIfConditionStart)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START, oldIfConditionStart, ifConditionStart));
			}
		}
		return ifConditionStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfConditionStart basicGetIfConditionStart()
	{
		return ifConditionStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfConditionStart(IfConditionStart newIfConditionStart, NotificationChain msgs)
	{
		IfConditionStart oldIfConditionStart = ifConditionStart;
		ifConditionStart = newIfConditionStart;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START, oldIfConditionStart, newIfConditionStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfConditionStart(IfConditionStart newIfConditionStart)
	{
		if (newIfConditionStart != ifConditionStart)
		{
			NotificationChain msgs = null;
			if (ifConditionStart != null)
				msgs = ((InternalEObject)ifConditionStart).eInverseRemove(this, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_START, IfConditionStart.class, msgs);
			if (newIfConditionStart != null)
				msgs = ((InternalEObject)newIfConditionStart).eInverseAdd(this, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_START, IfConditionStart.class, msgs);
			msgs = basicSetIfConditionStart(newIfConditionStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START, newIfConditionStart, newIfConditionStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START:
				if (ifConditionStart != null)
					msgs = ((InternalEObject)ifConditionStart).eInverseRemove(this, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_START, IfConditionStart.class, msgs);
				return basicSetIfConditionStart((IfConditionStart)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START:
				return basicSetIfConditionStart(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START:
				if (resolve) return getIfConditionStart();
				return basicGetIfConditionStart();
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
			case ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START:
				setIfConditionStart((IfConditionStart)newValue);
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
			case ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START:
				setIfConditionStart((IfConditionStart)null);
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
			case ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START:
				return ifConditionStart != null;
		}
		return super.eIsSet(featureID);
	}

} //ElseStartImpl
