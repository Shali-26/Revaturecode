class N{
	public static void main(String[]args){
		String s= "S";
		
		switch(s){
			case "S" :
				System.out.println("student scored between 90 to 100"); // checking whether a grade or not
			break;
			case "A" :
				System.out.println("student has scored between 80 to 90");
			break;
			case "B" :
				System.out.println("student has scored 70 to 80");
			break;
			case "C":
				System.out.println("student has scored 60 to 70");
			break;
			case "D":
				System.out.println("student has scored 50 to 60");
			break;
			case "E":
				System.out.println("student has scored 40 to 50");
			break;
			case "F" :
				System.out.println("student has scored 0 to 40");
			break;
			default:
				System.out.println("Invalid score");

}
	}
}