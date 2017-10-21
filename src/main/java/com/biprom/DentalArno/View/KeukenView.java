package com.biprom.DentalArno.View;

import com.biprom.DentalArno.Design.KeukenVerlichting;
import com.biprom.DentalArno.Data.Data;
import com.vaadin.ui.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.marcus.MouseEvents;



public class KeukenView extends KeukenVerlichting {

    Data data;

    @Autowired
    public KeukenView() {



    buttonEettafel.addClickListener(e -> System.out.println("brammie heeft gedrukt!!!"));
    buttonKeuken1.addClickListener(e -> System.out.println("Dependency Injection = " + data.isBoolVBureau1()));
        final MouseEvents hlMouseEvents = MouseEvents.enableFor(buttonKeuken1);
        hlMouseEvents.addMouseOverListener(() -> Notification.show("Over event"));
        hlMouseEvents.addMouseOutListener(() -> Notification.show("Out event"));

    }



}

