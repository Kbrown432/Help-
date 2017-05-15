class Help {
	public static void main(String[] args) 
	throws java.io.IOException {
		char input;
		char one;
		one = '1';
		char two;
		two ='2';
		char three;
		three = '3';
		char four;
		four = '4';
		char five;
		five = '5';
		char six;
		six = '6';
		char seven;
		seven = '7';
		char ignore;
		char q;
		do {
			System.out.println("Help on:\n " + "1. if\n " + "2. switch\n " + "3. for\n " + "4. while\n " + "5. do-while\n " + "6. break\n " + "7. continue\n " + "Choose one: ");
        	input = (char) System.in.read();

			if(input == one) {
				System.out.println("if(condition) {\n \n statement sequence\n }\n else\n {\n statement sequence\n }");
			}
			if(input == two) {
				System.out.println("switch(expression) {\n\n case constant1:\n \tstatement sequence\n \tbreak;\n case constant2:\n \tstatement sequence\n \tbreak;\n case constant3:\n \tstatement sequence\n \tbreak;\n default:\n \tstatement sequence\n }");
			}
			if(input == three) {
				System.out.println("for(initialization; condition; iteration)\n {\n statement sequence\n }");
			}
			if(input == four) {
				System.out.println("while(condition) {\n statement sequence\n }");
			}
			if(input == five) {
				System.out.println("do {\n statements;\n } while(condition);");
			}
			if(input == six) {
				System.out.println("break;");
			}
			if(input == seven) {
				System.out.println("continue;");
			}
		}while(input < '8');
		
		do {
			ignore = (char) System.in.read();
	    	}
		while(ignore != '\n');

		for(;;) {
			if(input == 'Q') {
				break;
			}
		}
		System.out.println("Exit!");
	}
}
