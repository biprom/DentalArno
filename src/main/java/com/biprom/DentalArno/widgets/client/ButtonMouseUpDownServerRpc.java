package com.biprom.DentalArno.widgets.client;

import com.vaadin.event.MouseEvents;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.communication.ServerRpc;

public interface ButtonMouseUpDownServerRpc extends ServerRpc {

    public void clicked(MouseEventDetails mouseDetails);
    public void mouseDown(MouseEventDetails mouseDetails);
    public void mouseUp(MouseEventDetails mouseDetails);

}
