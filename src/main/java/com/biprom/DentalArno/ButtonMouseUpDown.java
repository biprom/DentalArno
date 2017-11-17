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




    public ButtonMouseUpDown() {
        registerRpc(rpc);
        getState().text = "";


    }



    private ButtonMouseUpDownServerRpc rpc = new ButtonMouseUpDownServerRpc() {
        @Override
        public void clicked(MouseEventDetails mouseDetails) {

        }

        @Override
        public void mouseDown(String msg) {

            switch (msg){
                case "bureau1":  SharedData.data.setBoolVBureau1( true);
                case "bureau2":  SharedData.data.setBoolVBureau2( true);
                case "bureauLED":  SharedData.data.setBoolVLedBureau( true);
                case "voordeur":  SharedData.data.setBoolVoordeurBuiten( true);
                case "inkom":  SharedData.data.setBoolVInkomPlafond( true);
                case "inkomVloer":  SharedData.data.setBoolVInkomVloer( true);
                case "garage":  SharedData.data.setBoolVGarage( true);
                case "keuken1":  SharedData.data.setBoolVKeuken( true);
                case "keuken2":  SharedData.data.setBoolVKeuken2( true);
                case "eettafel":  SharedData.data.setBoolVEettafel( true);
                case "spotskeuken":  SharedData.data.setBoolVLedKeuken( true);
                case "trap":  SharedData.data.setBoolVTrapverlichting( true);
                case "nachthallVloer":  SharedData.data.setBoolVNachthall( true);
                case "nachthall":  SharedData.data.setBoolVNachthallboven( true);
                case "woonkamer":  SharedData.data.setBoolVLeeshoek( true);
                case "tv":  SharedData.data.setBoolVLivingTV1( true);
                case "screensLiving":  SharedData.data.setScreensLiving( true);
                case "screensKeuken":  SharedData.data.setScreensKeuken( true);
                case "screensMastSlpk":  SharedData.data.setScreensMastSlpk( true);
                case "screensSlpkDochter":  SharedData.data.setScreensSlpkDochter( true);
                case "screensSlpkZoon":  SharedData.data.setScreensSlpkZoon( true);
                case "screensMastBadk":  SharedData.data.setScreensMastBadk( true);


                    break;

            }


            System.out.println("mousedetails = " + msg +" TRUE");

        }

        @Override
        public void mouseUp(String msg) {

            switch (msg){
                case "bureau1":  SharedData.data.setBoolVBureau1( false);
                case "bureau2":  SharedData.data.setBoolVBureau2( false);
                case "bureauLED":  SharedData.data.setBoolVLedBureau( false);
                case "voordeur":  SharedData.data.setBoolVoordeurBuiten( false);
                case "inkom":  SharedData.data.setBoolVInkomPlafond( false);
                case "inkomVloer":  SharedData.data.setBoolVInkomVloer( false);
                case "garage":  SharedData.data.setBoolVGarage( false);
                case "keuken1":  SharedData.data.setBoolVKeuken( false);
                case "keuken2":  SharedData.data.setBoolVKeuken2( false);
                case "eettafel":  SharedData.data.setBoolVEettafel( false);
                case "spotskeuken":  SharedData.data.setBoolVLedKeuken( false);
                case "trap":  SharedData.data.setBoolVTrapverlichting( false);
                case "nachthallVloer":  SharedData.data.setBoolVNachthall( false);
                case "nachthall":  SharedData.data.setBoolVNachthallboven( false);
                case "woonkamer":  SharedData.data.setBoolVLeeshoek( false);
                case "tv":  SharedData.data.setBoolVLivingTV1( false);
                case "screensLiving":  SharedData.data.setScreensLiving( false);
                case "screensKeuken":  SharedData.data.setScreensKeuken( false);
                case "screensMastSlpk":  SharedData.data.setScreensMastSlpk( false);
                case "screensSlpkDochter":  SharedData.data.setScreensSlpkDochter( false);
                case "screensSlpkZoon":  SharedData.data.setScreensSlpkZoon( false);
                case "screensMastBadk":  SharedData.data.setScreensMastBadk( false);
                    break;

            }


            System.out.println("mousedetails = " + msg +" FALSE");

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




