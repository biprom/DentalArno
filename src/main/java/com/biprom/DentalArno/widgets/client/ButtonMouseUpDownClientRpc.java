package com.biprom.DentalArno.widgets.client;

import com.vaadin.shared.communication.ClientRpc;

public interface ButtonMouseUpDownClientRpc extends ClientRpc {

    public void alert(String message);

}
