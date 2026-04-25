package interview_Coding;

public class RemoveLstLtrFrm_StringArray_62 {
	public static void main(String args[])
	{
		//Remove the Last  letter
		String str[] = {"Applea", "Autoa", "Alphaa"};

		for (int i = 0; i < str.length; i++) {
			if (str[i].endsWith("a")) {
				str[i] = str[i].substring(0, str[i].length() - 1);
			}
		}

		for (String s : str) {
			System.out.println(s);
		}
//=====================================================================================================================
		//Using replace method
		//Remove the Last  letter
		
		/*String str[] = {"Applea", "Autoa", "Alphaa"};

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceFirst("a$", ""); // remove last 'a'   //"a$" → means 'a' at the end of string
        }                                                                        //replaceFirst("a$", "") → removes only the last 'a'

        for (String s : str) {
            System.out.println(s);
        }*/
//=====================================================================================================================
		//Remove the First letter
		/* String str[] = {"Applea", "Autoa", "Alphaa"};

        for (int i = 0; i < str.length; i++) {
            String remove = str[i].replace("A", "");
            System.out.println(remove);
        }*/
//=====================================================================================================================
		//Remove the First letter
		/*String str[] = {"Applea", "Autoa", "Alphaa"};

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceFirst("^.", ""); // remove first character
        }

        for (String s : str) {
            System.out.println(s);
        }*/

	}
}