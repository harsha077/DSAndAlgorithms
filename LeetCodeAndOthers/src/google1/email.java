package google1;
class email{
	

	public static int sendEmail(String[] emails){

		int count = 0;

		for(String str: emails){
			int plusIndex = str.indexOf('+');
			int atIndex = str.indexOf('@');
			String uptoPlusStr = str.substring(0,plusIndex);
			String fromAt = str.substring(atIndex);

			if(fromAt.indexOf('+') > -1){
				fromAt = fromAt.substring(0,fromAt.indexOf('+'));
				/*if(fromAt.length() >= 5 && fromAt.substring()){
						
				}*/
			}

			/*if(uptoPlusStr.length() > 0 && fromAt.length() > 0 && (uptoPlusStr+fromAt).length() <=100){
				String com = fromAt.
				//	count++;
			}*/
		}
		return count;
	}


	public static void main(String...args){
		String[] emails = {"test.email+bob@gmail.co.m","test.email@gmail.com"};
		//System.out.println(new email().sendEmail(emails));
		//String str = "test.email@gmail.com";
		//System.out.println(str.indexOf('+'));
	} 
}