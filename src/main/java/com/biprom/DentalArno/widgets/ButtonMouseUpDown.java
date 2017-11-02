package com.biprom.DentalArno.widgets;


import com.biprom.DentalArno.widgets.client.ButtonMouseUpDownServerRpc;
import com.biprom.DentalArno.widgets.client.ButtonMouseUpDownState;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.ui.AbstractComponent;

public class ButtonMouseUpDown extends AbstractComponent {

    private ButtonMouseUpDownServerRpc rpc = new ButtonMouseUpDownServerRpc() {
        @Override
        public void clicked(MouseEventDetails mouseDetails) {

        }

        @Override
        public void mouseDown(MouseEventDetails mouseDetails) {
            System.out.println("mousebutton is down!");
        }

        @Override
        public void mouseUp(MouseEventDetails mouseDetails) {
            System.out.println("mousebutton is up!");
        }
    };

    public ButtonMouseUpDown() {
        registerRpc(rpc);
        getState().text = "bureauknoppie";
    }

    @Override
    public ButtonMouseUpDownState getState() {
        return (ButtonMouseUpDownState) super.getState();
    }
}




