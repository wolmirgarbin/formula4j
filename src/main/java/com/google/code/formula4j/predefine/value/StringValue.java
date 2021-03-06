/*
 *
 * Copyright (c) 2005 The Exceoon Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Exceoon Software Foundation (http://www.exceoon.com/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. Products derived from this software may not be called " Exceoon ",
 *    nor may " Exceoon " appear in their name, without prior written
 *    permission of the Exceoon Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * Exceoon Software Corporation and was originally based on software
 * Exceoon copyright (c) 2005, International
 * Business Machines, Inc., http://www.Exceoon.com.  For more
 * information on the Exceoon Software Foundation, please see
 * <http://www.Exceoon.com/>.
 */

package com.google.code.formula4j.predefine.value;

import com.google.code.formula4j.type.MathematicalValue;

/**
 * Author	David.Liu 
 * Mail		david.liu@exceoon.com
 * copyright	Exceoon corporation
 */

public class StringValue implements MathematicalValue
{
	public final static String STRING_VALUE = "stringValue"; 
	private String stringValue;
	final public static int TYPE = 5;
	
	public StringValue(String value)
	{
		super();
		this.stringValue = value;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.formula4j.type.MathematicalValue#getNumericValue()
	 */
	@Override
	public double getNumericValue()
	{
		return this.stringValue!=null?this.stringValue.length():0;
	}

	/* (non-Javadoc)
	 * @see com.google.code.formula4j.type.MathematicalValue#getType()
	 */
	@Override
	public int getType()
	{
		return TYPE;
	}

	/* (non-Javadoc)
	 * @see com.google.code.formula4j.type.MathematicalValue#getValue()
	 */
	@Override
	public Object getValue()
	{
		return this.stringValue;
	}

}
