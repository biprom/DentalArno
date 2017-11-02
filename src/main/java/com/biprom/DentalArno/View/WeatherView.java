package com.biprom.DentalArno.View;

import com.biprom.DentalArno.Design.WeatherDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;

import static com.biprom.DentalArno.View.WeatherView.VIEW_NAME;

@SpringView(name = VIEW_NAME)
public class WeatherView extends WeatherDesign implements View {

	public static final String VIEW_NAME = "weather";

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

	}
}
