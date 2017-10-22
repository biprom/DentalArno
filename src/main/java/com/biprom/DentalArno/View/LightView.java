package com.biprom.DentalArno.View;

import com.biprom.DentalArno.Data.Data;
import com.biprom.DentalArno.Design.InkomVerlichting;
import com.biprom.DentalArno.Design.LightDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Component;

public class LightView extends LightDesign implements View {

    public static final String VIEW_NAME = "light";
    private int i = 0;

    private enum TabName{
        KEUKEN, LIVING, BUREAU, NACHTHALL, INKOM
    }

    private Component [ ] accordionComponents = new Component[5];


    public LightView() {

        accordionComponents[0] = new KeukenView();
        accordionComponents[1] = new WoonkamerView();
        accordionComponents[2] = new BureauView();
        accordionComponents[3] = new NachthallView();
        accordionComponents[4] = new InkomVerlichting();



        for (TabName tabName : TabName.values()){
            lightAccordion.addTab(accordionComponents[i], ""+ tabName);
            i++;
        }


    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
