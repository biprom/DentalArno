package com.biprom.DentalArno;

import com.biprom.DentalArno.View.MainView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.EnableVaadin;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

/**
 * This UI is the application entry point. A UI may either represent a browser window
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@SpringUI
@Widgetset("com.biprom.DentalArno.MyAppWidgetset")
@ComponentScan("com.biprom.DentalArno")
public class MyUI extends UI {


	@Autowired
	SpringViewProvider viewProvider;

	@WebListener
	public static class MyContextLoaderListener extends ContextLoaderListener {
	}

	@Configuration
	@EnableVaadin
	public static class MyConfiguration {
	}

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		Navigator navigator = new Navigator(this, this);
		navigator.addProvider(viewProvider);
		navigator.navigateTo(MainView.VIEW_NAME);
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}


}
