/* JNativeHook: Global keyboard and mouse hooking for Java.
 * Copyright (C) 2006-2015 Alexander Barker.  All Rights Received.
 * https://github.com/kwhat/jnativehook/
 *
 * JNativeHook is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JNativeHook is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jnativehook.mouse;

/**
 * Adapter implementation of the NativeMouseListener interface.
 * The methods are empty so the super call is obsolete.
 * @author Sogomn
 *
 */
public class NativeMouseAdapter implements NativeMouseListener {
	
	@Override
	public void nativeMouseClicked(final NativeMouseEvent n) {
		//...
	}
	
	@Override
	public void nativeMousePressed(final NativeMouseEvent n) {
		//...
	}
	
	@Override
	public void nativeMouseReleased(final NativeMouseEvent n) {
		//...
	}
	
}
