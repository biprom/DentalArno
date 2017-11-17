package com.biprom.DentalArno;

import com.biprom.DentalArno.Data.Data;
import com.biprom.DentalArno.IO.DigOutput_PCF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component("dentalWorkCycle")
@Scope("prototype")
public class DentalWorkCycle extends Thread {

	Data sharedData1;

	//get shared data from Bean


	@Autowired
	public DentalWorkCycle(Data dt){
		this.sharedData1 = dt;
	}

	//initialisatie outputs





//    Initialisatie digitale outputs
    DigOutput_PCF digital_output_card_1 = new DigOutput_PCF(1, 0X21);
    DigOutput_PCF digital_output_card_2 = new DigOutput_PCF(1, 0X3a);
    DigOutput_PCF digital_output_card_3 = new DigOutput_PCF(1, 0X23);
    DigOutput_PCF digital_output_card_4 = new DigOutput_PCF(1, 0X3c);
	DigOutput_PCF digital_output_card_5 = new DigOutput_PCF(1, 0X27);


	private void setOutputsToVariables() {
		try{
       digital_output_card_1.d1.setState(!sharedData1.isBoolVoordeurBuiten());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
          digital_output_card_1.d2.setState(!sharedData1.isBoolVInkomPlafond());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_1.d3.setState(!sharedData1.isBoolVInkomVloer());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_1.d4.setState(!sharedData1.isBoolVLedBureau());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_1.d5.setState(!sharedData1.isBoolVLedKeuken());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_1.d6.setState(!sharedData1.isBoolVGarage());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_1.d7.setState(!sharedData1.isBoolVBureau1());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
          digital_output_card_1.d8.setState(!sharedData1.isBoolVBureau2());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_2.d1.setState(!sharedData1.isBoolVLeeshoek());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_2.d2.setState(!sharedData1.isBoolVKeuken());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_2.d3.setState(!sharedData1.isBoolVEettafel());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_2.d4.setState(!sharedData1.isBoolVKeuken2());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_2.d5.setState(!sharedData1.isBoolVSpotsKeuken());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_2.d6.setState(!sharedData1.isBoolVLivingTV1());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_2.d7.setState(!sharedData1.isBoolVLivingTV2());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_2.d8.setState(!sharedData1.isBoolVNachthall());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_3.d1.setState(!sharedData1.isBoolVNachthallboven());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_3.d2.setState(!sharedData1.isBoolVTrapverlichting());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_3.d3.setState(!sharedData1.isBoolVTuin1());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{

			digital_output_card_3.d4.setState(!sharedData1.isBoolVTuin2());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
       digital_output_card_3.d5.setState(!sharedData1.isBoolVTuin3());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
//       digital_output_card_3.d6.setState(!sharedData1.uitbereiding2GietMetZand);
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}






		try{
//       digital_output_card_3.d7.setState(!sharedData1.zoneGarage);
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
//       digital_output_card_3.d8.setState(!sharedData1.zoneKronen);
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	public void run(){
		while(true){


			setOutputsToVariables();

			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



		}


	}


}
