package com.biprom.DentalArno.client;

import com.vaadin.event.MouseEvents;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.communication.ServerRpc;

public interface ButtonMouseUpDownServerRpc extends ServerRpc {

    public void clicked(MouseEventDetails mouseDetails);
    public void mouseDown(String msg);
    public void mouseUp(String msg);

}
