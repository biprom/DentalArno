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
                    break;
                case "bureau2":  SharedData.data.setBoolVBureau2( true);
                    break;
                case "bureauLED":  SharedData.data.setBoolVLedBureau( true);
                    break;
                case "voordeur":  SharedData.data.setBoolVoordeurBuiten( true);
                    break;
                case "inkom":  SharedData.data.setBoolVInkomPlafond( true);
                    break;
                case "inkomVloer":  SharedData.data.setBoolVInkomVloer( true);
                    break;
                case "garage":  SharedData.data.setBoolVGarage( true);
                    break;
                case "keuken1":  SharedData.data.setBoolVKeuken( true);
                    break;
                case "keuken2":  SharedData.data.setBoolVKeuken2( true);
                    break;
                case "eettafel":  SharedData.data.setBoolVEettafel( true);
                    break;
                case "spotskeuken":  SharedData.data.setBoolVLedKeuken( true);
                    break;
                case "trap":  SharedData.data.setBoolVTrapverlichting( true);
                    break;
                case "nachthallVloer":  SharedData.data.setBoolVNachthall( true);
                    break;
                case "nachthall":  SharedData.data.setBoolVNachthallboven( true);
                    break;
                case "woonkamer":  SharedData.data.setBoolVLeeshoek( true);
                    break;
                case "tv":  SharedData.data.setBoolVLivingTV1( true);
                    break;
                case "screensLiving":  SharedData.data.setScreensLiving( true);
                    break;
                case "screensKeuken":  SharedData.data.setScreensKeuken( true);
                    break;
                case "screensMastSlpk":  SharedData.data.setScreensMastSlpk( true);
                    break;
                case "screensSlpkDochter":  SharedData.data.setScreensSlpkDochter( true);
                    break;
                case "screensSlpkZoon":  SharedData.data.setScreensSlpkZoon( true);
                    break;
                case "screensMastBadk":  SharedData.data.setScreensMastBadk( true);
                    break;




            }


            System.out.println("mousedetails = " + msg +" TRUE");

        }

        @Override
        public void mouseUp(String msg) {

            switch (msg){
                case "bureau1":  SharedData.data.setBoolVBureau1( false);
                    break;
                case "bureau2":  SharedData.data.setBoolVBureau2( false);
                    break;
                case "bureauLED":  SharedData.data.setBoolVLedBureau( false);
                    break;
                case "voordeur":  SharedData.data.setBoolVoordeurBuiten( false);
                    break;
                case "inkom":  SharedData.data.setBoolVInkomPlafond( false);
                    break;
                case "inkomVloer":  SharedData.data.setBoolVInkomVloer( false);
                    break;
                case "garage":  SharedData.data.setBoolVGarage( false);
                    break;
                case "keuken1":  SharedData.data.setBoolVKeuken( false);
                    break;
                case "keuken2":  SharedData.data.setBoolVKeuken2( false);
                    break;
                case "eettafel":  SharedData.data.setBoolVEettafel( false);
                    break;
                case "spotskeuken":  SharedData.data.setBoolVLedKeuken( false);
                    break;
                case "trap":  SharedData.data.setBoolVTrapverlichting( false);
                    break;
                case "nachthallVloer":  SharedData.data.setBoolVNachthall( false);
                    break;
                case "nachthall":  SharedData.data.setBoolVNachthallboven( false);
                    break;
                case "woonkamer":  SharedData.data.setBoolVLeeshoek( false);
                    break;
                case "tv":  SharedData.data.setBoolVLivingTV1( false);
                    break;
                case "screensLiving":  SharedData.data.setScreensLiving( false);
                    break;
                case "screensKeuken":  SharedData.data.setScreensKeuken( false);
                    break;
                case "screensMastSlpk":  SharedData.data.setScreensMastSlpk( false);
                    break;
                case "screensSlpkDochter":  SharedData.data.setScreensSlpkDochter( false);
                    break;
                case "screensSlpkZoon":  SharedData.data.setScreensSlpkZoon( false);
                    break;
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




