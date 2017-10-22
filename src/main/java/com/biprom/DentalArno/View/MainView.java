package com.biprom.DentalArno.View;

import com.biprom.DentalArno.Design.MainDesign;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("mainView")


public class MainView extends MainDesign {

    public static final String VIEW_NAME = "";

    public MainView() {



        //browserFrameCamera.setSource(new ExternalResource("http://mail.vernafix.be:8103/control/userimage.html"));
        //weatherBrowser.setSource(new ExternalResource("https://www.accuweather.com/nl/be/oostende/31865/hourly-weather-forecast/31865"));

        Navigator subNavigator = new Navigator(getUI(), subPanel);
        subNavigator.addView(WeatherView.VIEW_NAME, new WeatherView());
        subNavigator.addView(CameraView.VIEW_NAME, new CameraView());
        subNavigator.addView(LightView.VIEW_NAME, new LightView());

        subNavigator.navigateTo(LightView.VIEW_NAME);

        bVerlichting.addClickListener(e -> subNavigator.navigateTo(LightView.VIEW_NAME));
        //bScreens.addClickListener(e > subNavigator.navigateTo(ScreensView.VIEW_NAME));
        bVideofoon.addClickListener(e -> subNavigator.navigateTo(CameraView.VIEW_NAME));
        bWeather.addClickListener(e -> subNavigator.navigateTo(WeatherView.VIEW_NAME));
    }




}
