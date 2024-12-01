package Lab5;

public class LegacyPrinterClassAdapter extends LegacyPrinter implements Printer{


	@Override
	public void printDocument(String doc) {
		// TODO Auto-generated method stub
		ancientPrintStyle(doc);
	}

	

}
