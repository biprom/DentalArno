package com.biprom.DentalArno.View;

import com.biprom.DentalArno.Data.Data;
import com.biprom.DentalArno.Design.KeukenVerlichting;
import com.biprom.DentalArno.extension.DownUpExtension;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.Button;
import org.springframework.beans.factory.annotation.Autowired;

@SpringComponent
public class KeukenView extends KeukenVerlichting {

	@Autowired
	Data data;

	public KeukenView() {
		buttonEettafel.addClickListener(e -> System.out.println("brammie heeft gedrukt!!!"));

		// Tried my best, doesn't work.
		new DownUpExtension().extend(buttonKeuken1);

		buttonKeuken2.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(Button.ClickEvent clickEvent) {
				if (data.isBoolVKeuken2()) {
					// button staat aan, afzetten die handelen
					data.setBoolVKeuken2(false);
					buttonKeuken2.setCaption("keuken 2");
				} else {
					// button staat af , aanzetten die handelen
					data.setBoolVKeuken2(true);
					buttonKeuken2.setCaption("keuken 2 - ON");
				}
			}
		});

	}


}

