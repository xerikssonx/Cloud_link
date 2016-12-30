package com.edd.gwt.client.ui;

import static com.edd.gwt.client.request.RequestFactory.testRequest;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;


/**
 * Main UI component
 * 
 * @author AGI
 * 
 */
public class MainPanel extends Composite {

	private static MainPanelUiBinder uiBinder = GWT.create(MainPanelUiBinder.class);

	interface MainPanelUiBinder extends UiBinder<Widget, MainPanel> {
	}

	@UiField
	TextBox textBox;

	@UiField
	FlowPanel todoPanel;

	@Inject
	public MainPanel() {

		testRequest.test((method, response) -> {
		});

		initWidget(uiBinder.createAndBindUi(this));
	}

}
