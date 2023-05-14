package FactoryPattern;

import java.io.InputStreamReader;
import java.util.Scanner;

import FactoryPattern.factory.TransportFactory;
import FactoryPattern.util.FactoryPatternConstants;

public class Client {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		
		System.out.println("Enter input");
		String userInput = scanner.next();
		
		if(userInput.contains("sea")) {
			TransportFactory.createTransport(FactoryPatternConstants.SHIP_LOGISTICS).deliver();;
		} else if(userInput.contains("road")) {
			TransportFactory.createTransport(FactoryPatternConstants.ROAD_LOGISTICS).deliver();;
		} else {
			System.out.println("Unsupported transport mode");
		}
	}

}
