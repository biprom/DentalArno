package com.biprom.DentalArno.View;

import com.biprom.DentalArno.Design.MainDesign;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

import static com.biprom.DentalArno.View.MainView.VIEW_NAME;

@SpringComponent
@SpringView(name = VIEW_NAME)
public class MainView extends MainDesign implements View {

	public static final String VIEW_NAME = "MAIN_VIEW";


	private final SpringViewProvider viewProvider;



	@Autowired
	public MainView(SpringViewProvider viewProvider) {
		this.viewProvider = viewProvider;

	}



	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

		Navigator subNavigator = new Navigator(UI.getCurrent(), subPanel);
		subNavigator.addProvider(viewProvider);

		subNavigator.addView(WeatherView.VIEW_NAME, viewProvider.getView(WeatherView.VIEW_NAME));
		subNavigator.addView(CameraView.VIEW_NAME, viewProvider.getView(CameraView.VIEW_NAME));
		subNavigator.addView(LightView.VIEW_NAME, viewProvider.getView(LightView.VIEW_NAME));


		subNavigator.navigateTo(LightView.VIEW_NAME);

		bVerlichting.addClickListener(e -> subNavigator.navigateTo(LightView.VIEW_NAME));
		//bScreens.addClickListener(e > subNavigator.navigateTo(ScreensView.VIEW_NAME));
		bVideofoon.addClickListener(e -> subNavigator.navigateTo(CameraView.VIEW_NAME));
		bWeather.addClickListener(e -> subNavigator.navigateTo(WeatherView.VIEW_NAME));

	}
}
