public class Main {

	static void print(String string){
		System.out.println(string);
	}

    public static void main(String[] args) {
	    Text text = new Text("Hello");

	    boldDecorator boldDecorator = new boldDecorator(text);
		print(boldDecorator.getOutput());

	    italicDecorator italicDecorator = new italicDecorator(text);
		print(italicDecorator.getOutput());

	    strikeOutDecorator strikeOutDecorator = new strikeOutDecorator(text);
		print(strikeOutDecorator.getOutput());
    }
}
