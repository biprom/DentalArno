package com.biprom.DentalArno.extension.client;

import com.biprom.DentalArno.extension.DownUpExtension;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.shared.ui.Connect;
import com.vaadin.ui.Notification;

/**
 * @author Kristof
 * Created on 21/10/2017.
 */
@Connect(DownUpExtension.class)
public class DownUpConnector extends AbstractExtensionConnector {
	@Override
	protected void extend(ServerConnector target) {
		final Widget button = ((ComponentConnector) target).getWidget();

		button.addDomHandler(new MouseDownHandler() {
			@Override
			public void onMouseDown(MouseDownEvent mouseDownEvent) {
				Notification.show("DOWN");
				System.out.println("DOWN");
			}
		}, MouseDownEvent.getType());

		button.addDomHandler(new MouseUpHandler() {
			@Override
			public void onMouseUp(MouseUpEvent mouseUpEvent) {
				Notification.show("UP");
				System.out.printf("UP");
			}
		}, MouseUpEvent.getType());

	}
}
