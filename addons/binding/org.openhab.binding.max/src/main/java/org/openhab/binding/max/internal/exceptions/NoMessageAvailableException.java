/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.max.internal.exceptions;

/**
 * Will be thrown when there is an attempt to pull a message from the message processor,
 * but the processor does not yet have a complete message.
 * 
 * @author Christian Rockrohr <christian@rockrohr.de>
 */
public class NoMessageAvailableException extends Exception {

}
