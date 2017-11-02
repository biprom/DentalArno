package com.biprom.DentalArno.View;

import com.biprom.DentalArno.Design.CameraDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;

import static com.biprom.DentalArno.View.CameraView.VIEW_NAME;

@SpringView(name = VIEW_NAME)
public class CameraView extends CameraDesign implements View {

	public static final String VIEW_NAME = "camera";

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

	}
}
