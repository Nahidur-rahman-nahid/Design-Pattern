package Lab5;

public class Main {

	public static void main(String[] args) {
	    
		
		Printer modernPrinter = new ModernPrinter();
		modernPrinter.printDocument("PDf doc printed");
		LegacyPrinter legacyPrinter = new LegacyPrinter();
		Printer legacyObjectAdapter = new LegacyObjectAdapter(legacyPrinter);
		legacyObjectAdapter.printDocument("new PDf doc printed");
		// using the class adapter
		Printer legacyPrinterClassAdapter = new LegacyPrinterClassAdapter();
		legacyPrinterClassAdapter.printDocument("another pdf doc printer via class adapter");
		
		

	}

}
