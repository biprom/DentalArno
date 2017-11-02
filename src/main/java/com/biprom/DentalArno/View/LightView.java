package com.biprom.DentalArno.View;

import com.biprom.DentalArno.Design.LightDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

import static com.biprom.DentalArno.View.LightView.VIEW_NAME;

@SpringComponent
@SpringView(name = VIEW_NAME)
public class LightView extends LightDesign implements View {

	public static final String VIEW_NAME = "light";

	@Autowired
	private KeukenView keukenView;

	@Autowired
	private WoonkamerView woonkamerView;

	@Autowired
	private BureauView bureauView;

	@Autowired
	private NachthallView nachthallView;

	@Autowired
	private InkomView inkomView;

	private int i = 0;

	private enum TabName {
		KEUKEN, LIVING, BUREAU, NACHTHALL, INKOM
	}

	private Component[] accordionComponents = new Component[5];


	@PostConstruct
	public void init() {

		accordionComponents[0] = keukenView;
		accordionComponents[1] = woonkamerView;
		accordionComponents[2] = bureauView;
		accordionComponents[3] = nachthallView;
		accordionComponents[4] = inkomView;

		for (TabName tabName : TabName.values()) {
			lightAccordion.addTab(accordionComponents[i], "" + tabName);
			i++;
		}

	}


	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {


	}
}
