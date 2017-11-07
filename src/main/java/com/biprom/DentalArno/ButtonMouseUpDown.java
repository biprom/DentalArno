package com.biprom.DentalArno;


import com.biprom.DentalArno.Data.Data;
import com.biprom.DentalArno.client.ButtonMouseUpDownServerRpc;
import com.biprom.DentalArno.client.ButtonMouseUpDownState;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.ui.AbstractComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ButtonMouseUpDown extends AbstractComponent {

    @Autowired
    Data sharedData;


    public ButtonMouseUpDown() {
        registerRpc(rpc);
        getState().text = "AAN/UIT DIM";


    }



    private ButtonMouseUpDownServerRpc rpc = new ButtonMouseUpDownServerRpc() {
        @Override
        public void clicked(MouseEventDetails mouseDetails) {

        }

        @Override
        public void mouseDown(String msg) {
    /*
            switch (msg){
            case "bureau1DOWN":  sd.setBoolVBureau1(true);
            break;

            }
            */
            SharedData.data.setBoolVBureau1(true);
            System.out.println("mousedetails = " + SharedData.data.isBoolVBureau1());

        }

        @Override
        public void mouseUp(String msg) {
            /*
            switch (msg){
                case "bureau1DOWN":  sd.setBoolVBureau1(false);
                    break;

            }
            */
            SharedData.data.setBoolVBureau1(false);
           System.out.println("mousedetails = " + SharedData.data.isBoolVBureau1());

        }
    };



    public void setButtonName(String msg){
        getState().text = msg;
    }

    @Override
    public ButtonMouseUpDownState getState() {
        return (ButtonMouseUpDownState) super.getState();
    }



}




