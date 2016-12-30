package com.edd.gwt.client;

import com.edd.gwt.client.ui.MainPanel;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 * 
 * Point d'entrée du module GWT
 */
public class GwtWebApp implements EntryPoint {

	public void onModuleLoad() {
		RootLayoutPanel.get().add(new MainPanel());
	}
}
