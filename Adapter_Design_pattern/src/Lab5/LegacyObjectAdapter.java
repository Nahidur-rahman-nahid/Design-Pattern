package Lab5;

public class LegacyObjectAdapter implements Printer{
	private LegacyPrinter legacyPrinter;
	
	public LegacyObjectAdapter(LegacyPrinter legacyPrinter) {
		this.legacyPrinter = legacyPrinter;
	}
	public void printDocument(String doc) {
		legacyPrinter.ancientPrintStyle(doc);
	}
	

}
