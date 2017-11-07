package com.biprom.DentalArno.View;

import com.biprom.DentalArno.Design.ScreenDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;

import static com.biprom.DentalArno.View.ScreenView.VIEW_NAME;


@SpringView(name = VIEW_NAME)
public class ScreenView extends ScreenDesign implements View {
    public static final String VIEW_NAME = "screens";
    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
