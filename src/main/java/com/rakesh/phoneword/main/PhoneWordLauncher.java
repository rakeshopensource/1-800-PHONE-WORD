package com.rakesh.phoneword.main;


import java.util.Arrays;
import java.util.Scanner;
import com.rakesh.phonebook.processor.InputFileProcessor;
import com.rakesh.phonebook.processor.PhoneWordProcessor;
import com.rakesh.phoneword.dict.Dictionary;
import com.rakesh.phoneword.dict.DictionaryReader;

/**
 * Class to launch phone word program.
 * 
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

public class PhoneWordLauncher {

	private static final String QUIT = "quit";

	public static void main(String[] args) {
		new PhoneWordLauncher().start(args);
	}

	private void start(String[] args) {
		PhoneWordProcessor phoneWordProcessor = new PhoneWordProcessor(
				new Dictionary(new DictionaryReader().loadDictionary()));
		if (args == null || args.length == 0) {
			Scanner scanner = new Scanner(System.in);
			boolean readInput = true;
			while (readInput) {
				System.out.println("Enter phone number, or quit to exit");
				String number = scanner.nextLine();
				if (QUIT.equals(number)) {
					readInput = false;
				} else {
					phoneWordProcessor.process(number);
				}
			}
			scanner.close();
		} else {
			InputFileProcessor inputFileReader = new InputFileProcessor(phoneWordProcessor);
			System.out.println("Files to process: " + Arrays.toString(args));
			for (String file : args) {
				inputFileReader.processFile(file);
			}
		}
	}
}
