/*
 * generated by Xtext 2.22.0
 */
package org.xtext.webots.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.webots.mydsl.ui.internal.MydslActivator;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MydslActivator.getInstance().getInjector("org.xtext.webots.mydsl.MyDsl");
	}

}
